package com.wwb.pattern.prototype.simple2;

/**
 * @Description TODO
 * @Package: com.wwb.pattern.prototype.simple2
 * @ClassName Circle
 * @author: wuwb
 * @date: 2019/8/14 15:01
 */
public class Circle extends Shape {

	public Circle() {
		type = "Circle";
	}

	@Override
	void draw() {
		System.out.println("Inside Circle::draw() method.");
	}
}
