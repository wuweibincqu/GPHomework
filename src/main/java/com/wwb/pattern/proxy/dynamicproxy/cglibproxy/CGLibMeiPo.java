package com.wwb.pattern.proxy.dynamicproxy.cglibproxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Description TODO
 * @Package: com.wwb.pattern.proxy.dynamicproxy.cglibproxy
 * @ClassName CGLibProxy
 * @author: wuwb
 * @date: 2019/8/19 14:15
 */
public class CGLibMeiPo implements MethodInterceptor {

	public Object getInstance(Class<?> clazz) throws Exception {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(clazz);
		enhancer.setCallback(this);
		return enhancer.create();
	}

	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		//业务的增强
		before();
		Object obj = methodProxy.invokeSuper(o,objects);
		after();
		return obj;
	}
	private void before(){
		System.out.println("我是媒婆：我要给你找对象，现在已经拿到你的需求");
		System.out.println("开始物色");
	}
	private void after(){
		System.out.println("如果合适的话，就准备办事");
	}
}