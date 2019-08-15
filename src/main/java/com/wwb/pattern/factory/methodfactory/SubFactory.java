package com.wwb.pattern.factory.methodfactory;

import com.wwb.pattern.factory.base.Operation;
import com.wwb.pattern.factory.base.OperationSub;

/**
 * @Description TODO
 * @Package: com.wwb.pattern.factory.methodfactory
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
