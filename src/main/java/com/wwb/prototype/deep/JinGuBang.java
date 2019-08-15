package com.wwb.prototype.deep;

import java.io.Serializable;

/**
 * @Description TODO
 * @Package: com.wwb.prototype.deep
 * @ClassName JinGuBang
 * @author: wuwb
 * @date: 2019/8/14 15:43
 */
public class JinGuBang implements Serializable{
	protected float h = 100;
	protected float d = 50;

	public void big() {
		h *= 2;
		d *= 2;
	}

	public void small() {
		h /= 2;
		d /= 2;
	}

	/*@Override
	public String toString() {
		return "JinGuBang{" +
				"h=" + h +
				", d=" + d +
				'}';
	}*/
}
