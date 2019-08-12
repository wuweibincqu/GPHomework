package com.wwb.factory.base;

/**
 * @Description TODO
 * @Package: com.wwb.factory.simplefactory
 * @ClassName OperationMul
 * @author: wuwb
 * @date: 2019/8/12 11:18
 */
public class OperationMul extends Operation {
	@Override
	public double getResult() {
		return getNumberA() * getNumberB();
	}
}
