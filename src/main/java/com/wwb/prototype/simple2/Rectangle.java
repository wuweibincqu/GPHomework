package com.wwb.prototype.simple2;

/**
 * @Description TODO
 * @Package: com.wwb.prototype.simple2
 * @ClassName Rectangle
 * @author: wuwb
 * @date: 2019/8/14 14:58
 */
public class Rectangle extends Shape {

	public Rectangle(){
		type = "Rectangle";
	}

	@Override
	void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}
}
