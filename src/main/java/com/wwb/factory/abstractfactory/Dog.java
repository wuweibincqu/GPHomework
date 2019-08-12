package com.wwb.factory.abstractfactory;

/**
 * @Description TODO
 * @Package: com.wwb.factory.abstractfactory
 * @ClassName Dog
 * @author: wuwb
 * @date: 2019/8/12 16:45
 */
public class Dog implements Animal {
	@Override
	public void eat() {
		System.out.println("狗儿啃骨头");
	}
}
