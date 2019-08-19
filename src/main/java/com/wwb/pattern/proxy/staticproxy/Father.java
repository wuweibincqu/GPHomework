package com.wwb.pattern.proxy.staticproxy;

import com.wwb.pattern.proxy.Person;

/**
 * @Description TODO
 * @Package: com.wwb.pattern.proxy.staticproxy
 * @ClassName Father
 * @author: wuwb
 * @date: 2019/8/15 11:40
 */
public class Father implements Person {

	private Son son;

	public Father(Son son) {
		this.son = son;
	}

	@Override
	public void findLove() {
		System.out.println("父母物色对象");
		this.son.findLove();
		System.out.println("双方满意，步入围城");
	}
}
