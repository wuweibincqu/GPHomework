package com.wwb.pattern.prototype.simple;

import java.util.List;

/**
 * @Description TODO
 * @Package: com.wwb.pattern.prototype.simple
 * @ClassName ConcretePrototype
 * @author: wuwb
 * @date: 2019/8/14 14:11
 */
public class ConcretePrototype implements Prototype {

	private int age;
	private String name;
	private List hobbies;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List getHobbies() {
		return hobbies;
	}

	public void setHobbies(List hobbies) {
		this.hobbies = hobbies;
	}

	@Override
	public Prototype clone() {
		ConcretePrototype prototype = new ConcretePrototype();
		prototype.setAge(this.age);
		prototype.setName(this.name);
		prototype.setHobbies(this.hobbies);
		return prototype;
	}
}
