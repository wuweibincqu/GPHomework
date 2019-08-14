package com.wwb.singleton;

/**
 * @Description 饿汉式单例
 * @Package: com.wwb.singleton
 * @ClassName HungrySingleton
 * @author: wuwb
 * @date: 2019/8/13 11:34
 */
public class HungrySingleton {

	private static final HungrySingleton HUNGRY_SINGLETON = new HungrySingleton();

	/*静态代码块的方式*/
	/*
	private static final HungrySingleton HUNGRY_SINGLETON;

	static {
		HUNGRY_SINGLETON = new HungrySingleton();
	}*/

	private HungrySingleton() {
	}

	public static HungrySingleton getInstance() {
		return HUNGRY_SINGLETON;
	}
}
