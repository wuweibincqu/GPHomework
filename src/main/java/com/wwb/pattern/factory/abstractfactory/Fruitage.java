package com.wwb.pattern.factory.abstractfactory;

/**
 * @Description TODO
 * @Package: com.wwb.pattern.factory.abstractfactory
 * @ClassName Fruitage
 * @author: wuwb
 * @date: 2019/8/12 16:46
 */
public class Fruitage implements Plant {
	@Override
	public void show() {
		System.out.println("水果结果啦");
	}
}
