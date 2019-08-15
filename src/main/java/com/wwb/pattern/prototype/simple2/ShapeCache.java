package com.wwb.pattern.prototype.simple2;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * @Description TODO
 * @Package: com.wwb.pattern.prototype.simple2
 * @ClassName ShapeCache
 * @author: wuwb
 * @date: 2019/8/14 15:02
 */
public class ShapeCache {

	private static Hashtable<String, Shape> shapMap = new Hashtable<>();

	public static Shape getShape(String shapeId) {
		Shape cacheShape = shapMap.get(shapeId);
		System.out.println("Shape : " + cacheShape);
		return (Shape) cacheShape.clone();
	}

	/**
	 * 对每种形状都运行数据库查询，并创建该形状
	 * shapeMap.put(shapeKey, shape);
	 * 例如，我们要添加三种形状
	 */
	public static void loadCache() {
		Rectangle rectangle = new Rectangle();
		rectangle.setId("1");
		shapMap.put(rectangle.getId(), rectangle);

		Square square = new Square();
		square.setId("2");
		shapMap.put(square.getId(), square);

		Circle circle = new Circle();
		circle.setId("3");
		shapMap.put(circle.getId(), circle);
	}


}
