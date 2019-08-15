package com.wwb.pattern.factory.methodfactory;

import com.wwb.pattern.factory.base.Operation;
import com.wwb.pattern.factory.base.OperationMul;

/**
 * @Description TODO
 * @Package: com.wwb.pattern.factory.methodfactory
 * @ClassName MulFactory
 * @author: wuwb
 * @date: 2019/8/12 13:50
 */
public class MulFactory implements IFactory {
	@Override
	public Operation createOperation() {
		return new OperationMul();
	}
}
