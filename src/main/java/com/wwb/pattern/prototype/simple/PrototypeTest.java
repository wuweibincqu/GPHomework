package com.wwb.pattern.prototype.simple;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Description 自定义浅克隆
 * @Package: com.wwb.pattern.prototype.simple
 * @ClassName PrototypeTest
 * @author: wuwb
 * @date: 2019/8/14 14:21
 */
public class PrototypeTest {

	@Test
	public void testPrototype() {
		ConcretePrototype prototype = new ConcretePrototype();
		prototype.setAge(18);
		prototype.setName("詹三");
		List hobbies = new ArrayList();
		Collections.addAll(hobbies, "吃饭", "睡觉", "发呆");
		prototype.setHobbies(hobbies);

		ConcretePrototype copy = Client.startClone(prototype);

		System.out.println(prototype);
		System.out.println(copy);

		System.out.println("原对象中的引用类型的地址：" + prototype.getHobbies());
		System.out.println("克隆对象中的引用类型的地址：" + copy.getHobbies());
		//true
		System.out.println("引用对象地址比较：" + (prototype.getHobbies() == copy.getHobbies()));

	}
}
