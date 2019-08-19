package com.wwb.pattern.proxy.dynamicproxy.jdkproxy;

import org.junit.Before;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Description TODO
 * @Package: com.wwb.pattern.proxy.dynamicproxy.jdkproxy
 * @ClassName JDKMeipo
 * @author: wuwb
 * @date: 2019/8/15 13:56
 */
public class JDKMeipo implements InvocationHandler {

	private Object target;

	public Object getInstance(Object target) {
		this.target = target;
		Class<?> clazz = target.getClass();
		return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
	}


	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		before();
		Object obj = method.invoke(this.target, args);
		after();
		return obj;
	}

	private void before() {
		System.out.println("我是媒婆：我要给你找对象，现在已经拿到你的需求");
		System.out.println("开始物色");
	}

	private void after() {
		System.out.println("如果合适的话，就入围城");
	}
}
