package com.wwb.pattern.proxy.dynamicproxy.gpproxy;

import com.wwb.pattern.proxy.Person;

/**
 * @Description TODO
 * @Package: com.wwb.pattern.proxy.dynamicproxy.jdkproxy
 * @ClassName Customer
 * @author: wuwb
 * @date: 2019/8/15 14:04
 */
public class Customer implements Person {


	@Override
	public void findLove() {
		System.out.println("高富帅");
		System.out.println("身高180cm");
		System.out.println("胸大，6 块腹肌");
	}
}
