package com.wwb.singleton;

/**
 * @Description 懒汉式单例 + 双重检查锁
 * @Package: com.wwb.singleton
 * @ClassName LazyDoubleCheckSingleton
 * @author: wuwb
 * @date: 2019/8/13 13:58
 */
public class LazyDoubleCheckSingleton {

	private static LazyDoubleCheckSingleton instance;

	private LazyDoubleCheckSingleton(){}

	public static LazyDoubleCheckSingleton getInstance() {
		if (instance == null) {
			synchronized (LazyDoubleCheckSingleton.class) {
				if (instance == null) {
					instance = new LazyDoubleCheckSingleton();
				}
			}
		}
		return instance;
	}
}
