package com.wwb.pattern.factory.simplefactory;

import com.wwb.pattern.factory.base.*;

/**
 * @Description TODO
 * @Package: com.wwb.pattern.factory.simplefactory
 * @ClassName OperationFactory
 * @author: wuwb
 * @date: 2019/8/12 11:23
 */

public class OperationFactory {

	public static Operation createOperate(Class clazz) throws Exception {
		/*Operation oper = null;
		switch (operate) {
			case "+":
				oper = new OperationAdd();
				break;
			case "-":
				oper = new OperationSub();
				break;
			case "*":
				oper = new OperationMul();
				break;
			case "/":
				oper = new OpreationDiv();
				break;
		}
		return oper;*/
		return (Operation)clazz.newInstance();
	}
}
