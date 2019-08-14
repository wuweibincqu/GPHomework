package com.wwb.singleton;

import java.io.Serializable;

/**
 * @Description 静态内部类的单例模式
 * @Package: com.wwb.singleton
 * @ClassName LazyInnerClassSingleton
 * @author: wuwb
 * @date: 2019/8/13 14:09
 */
@SuppressWarnings("all")
public class LazyInnerClassSingleton implements Serializable {

	private LazyInnerClassSingleton(){
		if (LazyHolder.LAZY != null) {
			throw new RuntimeException("不允许创建多个实例");
		}
	}

	public static final LazyInnerClassSingleton getInstance() {
		return LazyHolder.LAZY;
	}

	private static class LazyHolder {
		private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
	}

	private Object readResolve() {
		return LazyHolder.LAZY;
	}
}
