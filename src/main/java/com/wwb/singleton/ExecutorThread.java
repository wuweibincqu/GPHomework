package com.wwb.singleton;

/**
 * @Description TODO
 * @Package: com.wwb.singleton
 * @ClassName ExecutorThread
 * @author: wuwb
 * @date: 2019/8/13 13:24
 */
@SuppressWarnings("all")
public class ExecutorThread implements Runnable {
	/**
	 * When an object implementing interface <code>Runnable</code> is used
	 * to create a thread, starting the thread causes the object's
	 * <code>run</code> method to be called in that separately executing
	 * thread.
	 * <p>
	 * The general contract of the method <code>run</code> is that it may
	 * take any action whatsoever.
	 *
	 * @see Thread#run()
	 */
	@Override
	public void run() {
		/*LazySimpleSingleton singleton = LazySimpleSingleton.getInstance();
		System.out.println(Thread.currentThread().getName() + "." + singleton);*/

		LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
		System.out.println(Thread.currentThread().getName() + "." + instance);
	}
}
