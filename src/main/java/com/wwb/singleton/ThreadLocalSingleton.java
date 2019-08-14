package com.wwb.singleton;

/**
 * @Description ThreadLocal 线程单例
 * @Package: com.wwb.singleton
 * @ClassName ThreadLocalSingleton
 * @author: wuwb
 * @date: 2019/8/13 19:15
 */
@SuppressWarnings("all")
public class ThreadLocalSingleton {
	private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance =
			new ThreadLocal<ThreadLocalSingleton>(){
				@Override
				protected ThreadLocalSingleton initialValue() {
					return new ThreadLocalSingleton();
				}
			};
	private ThreadLocalSingleton(){}
	public static ThreadLocalSingleton getInstance(){
		return threadLocalInstance.get();
	}
}
