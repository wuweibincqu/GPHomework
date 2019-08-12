package com.wwb.factory.abstractfactory;

/**
 * @Description TODO
 * @Package: com.wwb.factory.abstractfactory
 * @ClassName Horse
 * @author: wuwb
 * @date: 2019/8/12 16:42
 */
public class Horse implements Animal {
	@Override
	public void eat() {
		System.out.println("马儿吃草！");
	}
}
