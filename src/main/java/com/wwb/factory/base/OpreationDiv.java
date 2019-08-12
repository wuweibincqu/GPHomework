package com.wwb.factory.base;

/**
 * @Description TODO
 * @Package: com.wwb.factory.simplefactory
 * @ClassName OpreationDiv
 * @author: wuwb
 * @date: 2019/8/12 11:19
 */
public class OpreationDiv extends Operation {
	@Override
	public double getResult() throws Exception {
		if (getNumberB() == 0) {
			throw new Exception("除数不能为0！");
		}
		return getNumberA() / getNumberB();
	}
}
