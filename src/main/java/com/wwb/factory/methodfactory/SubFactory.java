package com.wwb.factory.methodfactory;

import com.wwb.factory.base.Operation;
import com.wwb.factory.base.OperationSub;

/**
 * @Description TODO
 * @Package: com.wwb.factory.methodfactory
 * @ClassName SubFactory
 * @author: wuwb
 * @date: 2019/8/12 13:50
 */
public class SubFactory implements IFactory {
	@Override
	public Operation createOperation() {
		return new OperationSub();
	}
}
