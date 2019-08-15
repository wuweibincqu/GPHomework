package com.wwb.pattern.singleton;

import org.junit.Test;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Description TODO
 * @Package: com.wwb.pattern.singleton
 * @ClassName SingletonTest
 * @author: wuwb
 * @date: 2019/8/13 11:53
 */
@SuppressWarnings("all")
public class SingletonTest {

	@Test
	public void testHungrySingleton() {
		HungrySingleton instance1 = HungrySingleton.getInstance();
		HungrySingleton instance2 = HungrySingleton.getInstance();
		System.out.println(instance1);//com.wwb.pattern.singleton.HungrySingleton@22927a81
		System.out.println(instance2);//com.wwb.pattern.singleton.HungrySingleton@22927a81
		System.out.println(instance1 == instance2);//true
	}

	@Test
	public void testLazySimpleSingleton() {
		Thread thread1 = new Thread(new ExecutorThread());
		Thread thread2 = new Thread(new ExecutorThread());
		thread1.start();
		thread2.start();
		System.out.println("END");
	}

	@Test
	public void testReflectLazyInnerCLassSingleton() {
		try {
			//通过反射获取私有构造方法
			Constructor<LazyInnerClassSingleton> constructor = LazyInnerClassSingleton.class.getDeclaredConstructor(null);
			//强制访问
			constructor.setAccessible(true);
			LazyInnerClassSingleton singleton = constructor.newInstance();
			LazyInnerClassSingleton singleton1 = constructor.newInstance();
			System.out.println(singleton == singleton1);
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testSeriableSingleton() {
		SeriableSingleton singleton1 = null;
		SeriableSingleton singleton2 = SeriableSingleton.getInstance();

		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fos = new FileOutputStream("SeriableSingleton.obj");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(singleton2);
			oos.flush();
			oos.close();
			fos.close();

			fis = new FileInputStream("SeriableSingleton.obj");
			ois = new ObjectInputStream(fis);
			singleton1 = (SeriableSingleton) ois.readObject();
			ois.close();
			fis.close();

			//没加readReslove方法
			/*System.out.println(singleton1);//com.wwb.pattern.singleton.SeriableSingleton@5680a178
			System.out.println(singleton2);//com.wwb.pattern.singleton.SeriableSingleton@61e4705b
			System.out.println(singleton1 == singleton2);//false*/

			//添加了readReslove方法
			System.out.println(singleton1);//com.wwb.pattern.singleton.SeriableSingleton@61e4705b
			System.out.println(singleton2);//com.wwb.pattern.singleton.SeriableSingleton@61e4705b
			System.out.println(singleton1 == singleton2);//true

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testSeriableSingleton1() {
		LazyInnerClassSingleton singleton1 = null;
		LazyInnerClassSingleton singleton2 = LazyInnerClassSingleton.getInstance();

		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fos = new FileOutputStream("SeriableSingleton1.obj");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(singleton2);
			oos.flush();
			oos.close();
			fos.close();

			fis = new FileInputStream("SeriableSingleton1.obj");
			ois = new ObjectInputStream(fis);
			singleton1 = (LazyInnerClassSingleton) ois.readObject();
			ois.close();
			fis.close();

			//没加readReslove方法
			/*System.out.println(singleton1);//com.wwb.pattern.singleton.SeriableSingleton@5680a178
			System.out.println(singleton2);//com.wwb.pattern.singleton.SeriableSingleton@61e4705b
			System.out.println(singleton1 == singleton2);//false*/

			//添加了readReslove方法
			System.out.println(singleton1);//com.wwb.pattern.singleton.SeriableSingleton@61e4705b
			System.out.println(singleton2);//com.wwb.pattern.singleton.SeriableSingleton@61e4705b
			System.out.println(singleton1 == singleton2);//true

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testEnumSingleton() {
		EnumSingleton singleton1 = null;
		EnumSingleton singleton2 = EnumSingleton.getInstance();
		singleton2.setData(new Object());

		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fos = new FileOutputStream("EnumSingleton.obj");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(singleton2);
			oos.flush();
			oos.close();
			fos.close();

			fis = new FileInputStream("EnumSingleton.obj");
			ois = new ObjectInputStream(fis);
			singleton1 = (EnumSingleton) ois.readObject();
			ois.close();
			fis.close();

			System.out.println(singleton1.getData());//java.lang.Object@3b22cdd0
			System.out.println(singleton2.getData());//java.lang.Object@3b22cdd0
			System.out.println(singleton1.getData() == singleton2.getData());//true

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
