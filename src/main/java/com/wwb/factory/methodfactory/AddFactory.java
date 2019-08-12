package com.wwb.factory.methodfactory;

import com.wwb.factory.base.Operation;
import com.wwb.factory.base.OperationAdd;

/**
 * @Description TODO
 * @Package: com.wwb.factory.methodfactory
 * @ClassName AddFactory
 * @author: wuwb
 * @date: 2019/8/12 13:49
 */
public class AddFactory implements IFactory {
	@Override
	public Operation createOperation() {
		return new OperationAdd();
	}
}
