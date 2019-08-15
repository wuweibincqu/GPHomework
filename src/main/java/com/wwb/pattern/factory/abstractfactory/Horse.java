package com.wwb.pattern.factory.abstractfactory;

/**
 * @Description TODO
 * @Package: com.wwb.pattern.factory.abstractfactory
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
