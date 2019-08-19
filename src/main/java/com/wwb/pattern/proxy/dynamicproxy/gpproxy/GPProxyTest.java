package com.wwb.pattern.proxy.dynamicproxy.gpproxy;

import com.wwb.pattern.proxy.Person;

/**
 * @Description TODO
 * @Package: com.wwb.pattern.proxy.dynamicproxy.gpproxy
 * @ClassName GPProxyTest
 * @author: wuwb
 * @date: 2019/8/19 10:30
 */
@SuppressWarnings("all")
public class GPProxyTest {
	public static void main(String[] args) {
		try {
			Person obj = (Person)new GPMeipo().getInstance(new Customer());
			System.out.println(obj.getClass());
			obj.findLove();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
