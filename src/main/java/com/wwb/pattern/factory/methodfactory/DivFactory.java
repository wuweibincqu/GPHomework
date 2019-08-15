package com.wwb.pattern.factory.methodfactory;

import com.wwb.pattern.factory.base.Operation;
import com.wwb.pattern.factory.base.OpreationDiv;

/**
 * @Description TODO
 * @Package: com.wwb.pattern.factory.methodfactory
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
