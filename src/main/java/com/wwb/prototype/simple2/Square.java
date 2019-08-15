package com.wwb.prototype.simple2;

/**
 * @Description TODO
 * @Package: com.wwb.prototype.simple2
 * @ClassName Square
 * @author: wuwb
 * @date: 2019/8/14 15:00
 */
public class Square extends Shape {
	public Square() {
		type = "Square";
	}

	@Override
	void draw() {
		System.out.println("Inside Square::draw() method.");
	}
}
