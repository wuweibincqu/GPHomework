package com.wwb.pattern.proxy.dynamicproxy.gpproxy;

import java.lang.reflect.Method;

/**
 * @Description TODO
 * @Package: com.wwb.pattern.proxy.dynamicproxy.gpproxy
 * @ClassName GPInvocationHandler
 * @author: wuwb
 * @date: 2019/8/19 9:16
 */
public interface GPInvocationHandler {

	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable;
}
