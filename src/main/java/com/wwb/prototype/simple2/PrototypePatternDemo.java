package com.wwb.prototype.simple2;

/**
 * @Description TODO
 * @Package: com.wwb.prototype.simple2
 * @ClassName PrototypePatternDemo
 * @author: wuwb
 * @date: 2019/8/14 15:11
 */
public class PrototypePatternDemo {
	public static void main(String[] args) {
		ShapeCache.loadCache();

		Shape cloneShape1 = ShapeCache.getShape("1");
		System.out.println("Shape : " + cloneShape1);

		Shape cloneShape2 = ShapeCache.getShape("2");
		System.out.println("Shape : " + cloneShape2);

		Shape cloneShape3 = ShapeCache.getShape("3");
		System.out.println("Shape : " + cloneShape3);
	}
}
