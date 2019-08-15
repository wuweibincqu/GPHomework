package com.wwb.prototype.simple2;

/**
 * @Description TODO
 * @Package: com.wwb.prototype.simple2
 * @ClassName Shape
 * @author: wuwb
 * @date: 2019/8/14 14:52
 */
public abstract class Shape implements Cloneable {

	private String id;
	protected String type;

	abstract void draw();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	@Override
	public Object clone() {
		Object clone = null;

		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}

	@Override
	public String toString() {
		return "Shape{" +
				"id='" + id + '\'' +
				", type='" + type + '\'' +
				'}';
	}
}
