package com.wwb.pattern.factory.base;

/**
 * @Description TODO
 * @Package: com.wwb.pattern.factory.simplefactory
 * @ClassName OperationAdd
 * @author: wuwb
 * @date: 2019/8/12 11:03
 */
public class OperationAdd extends Operation {

	@Override
	public double getResult() {
		return getNumberA() + getNumberB();
	}
}
