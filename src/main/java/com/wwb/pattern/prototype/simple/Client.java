package com.wwb.pattern.prototype.simple;

/**
 * @Description TODO
 * @Package: com.wwb.pattern.prototype.simple
 * @ClassName Client
 * @author: wuwb
 * @date: 2019/8/14 14:18
 */
public class Client {

	public static ConcretePrototype startClone(Prototype prototype) {
		return (ConcretePrototype)prototype.clone();
	}

}
