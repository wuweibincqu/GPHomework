package com.wwb.singleton;

/**
 * @Description 懒汉式单例  方法加锁
 * @Package: com.wwb.singleton
 * @ClassName LazySimpleSingleton
 * @author: wuwb
 * @date: 2019/8/13 11:47
 */
public class LazySimpleSingleton {

	private static LazySimpleSingleton instance = null;

	private LazySimpleSingleton(){}

	public synchronized static LazySimpleSingleton getInstance() {
		if (instance == null) {
			instance = new LazySimpleSingleton();
		}
		return instance;
	}
}
