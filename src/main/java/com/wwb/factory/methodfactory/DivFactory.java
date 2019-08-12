package com.wwb.factory.methodfactory;

import com.wwb.factory.base.Operation;
import com.wwb.factory.base.OpreationDiv;

/**
 * @Description TODO
 * @Package: com.wwb.factory.methodfactory
 * @ClassName DivFactory
 * @author: wuwb
 * @date: 2019/8/12 13:51
 */
public class DivFactory implements IFactory {
	@Override
	public Operation createOperation() {
		return new OpreationDiv();
	}
}
