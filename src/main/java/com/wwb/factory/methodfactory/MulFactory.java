package com.wwb.factory.methodfactory;

import com.wwb.factory.base.Operation;
import com.wwb.factory.base.OperationMul;

/**
 * @Description TODO
 * @Package: com.wwb.factory.methodfactory
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
