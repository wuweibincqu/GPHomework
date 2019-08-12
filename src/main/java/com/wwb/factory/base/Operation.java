package com.wwb.factory.base;

/**
 * @Description TODO
 * @Package: com.wwb.factory.simplefactory
 * @ClassName Operation
 * @author: wuwb
 * @date: 2019/8/12 11:01
 */
public abstract class Operation {

	private double numberA;
	private double numberB;

	public double getNumberA() {
		return numberA;
	}

	public void setNumberA(double numberA) {
		this.numberA = numberA;
	}

	public double getNumberB() {
		return numberB;
	}

	public void setNumberB(double numberB) {
		this.numberB = numberB;
	}

	public abstract double getResult() throws Exception;
}
