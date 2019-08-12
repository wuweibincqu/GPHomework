package com.wwb.factory.base;



/**
 * @Description TODO
 * @Package: com.wwb.factory.simplefactory
 * @ClassName OperationSub
 * @author: wuwb
 * @date: 2019/8/12 11:07
 */
@SuppressWarnings("all")
public class OperationSub extends Operation {
	@Override
	public double getResult() {
		return getNumberA() - getNumberB();
	}
}
