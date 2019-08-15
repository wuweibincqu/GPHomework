package com.wwb.pattern.factory.abstractfactory;

/**
 * @Description TODO
 * @Package: com.wwb.pattern.factory.abstractfactory
 * @ClassName Vegetables
 * @author: wuwb
 * @date: 2019/8/12 16:47
 */
public class Vegetables implements Plant {
	@Override
	public void show() {
		System.out.println("蔬菜成熟啦！");
	}
}
