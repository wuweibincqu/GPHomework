package com.wwb.pattern.proxy.order;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description TODO
 * @Package: com.wwb.pattern.proxy.order
 * @ClassName OrderServiceDynamicProxy
 * @author: wuwb
 * @date: 2019/8/15 14:10
 */
public class OrderServiceDynamicProxy implements InvocationHandler {

	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy");

	private Object target;

	public Object getInstance(Object target) {
		this.target = target;
		Class<?> clazz = target.getClass();
		return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		before(args[0]);
		Object obj = method.invoke(this.target, args);
		after();
		return obj;
	}

	public void before(Object target) {
		try {
			System.out.println("proxy before method");
			Long createTime = (Long)target.getClass().getMethod("getCreateTime").invoke(target);
			Integer year = Integer.valueOf(sdf.format(new Date(createTime)));
			DynamicDataSourceEntry.set(year);
			System.out.println("静态代理类自动分配到【DB_" + DynamicDataSourceEntry.get() + "】数据源处理数据。");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void after() {
		System.out.println("proxy after method");
	}
}
