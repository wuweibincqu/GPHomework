package com.wwb.factory.test;

import com.wwb.factory.base.Operation;
import com.wwb.factory.base.OperationAdd;
import com.wwb.factory.methodfactory.AddFactory;
import com.wwb.factory.methodfactory.IFactory;
import com.wwb.factory.methodfactory.SubFactory;
import com.wwb.factory.simplefactory.OperationFactory;
import org.junit.Test;

/**
 * @Description TODO
 * @Package: com.wwb.factory.test
 * @ClassName OperationTest
 * @author: wuwb
 * @date: 2019/8/12 13:54
 */
public class OperationTest {

	/**
	 * @Description 测试简单工厂，添加新功能时违背开闭原则
	 * @param 
	 * @return void
	 * @throws 
	 **/
	@Test
	public void testOperation() throws Exception {
		Operation operate = OperationFactory.createOperate(OperationAdd.class);
		operate.setNumberA(8);
		operate.setNumberB(2);
		double result = operate.getResult();
		System.out.println(result);
	}

	/**
	 * @Description 工厂方法模式
	 * @param
	 * @return void
	 * @throws
	 **/
	@Test
	public void testMethodFactory() throws Exception {
		//IFactory factory = new AddFactory();
		IFactory factory = new SubFactory();
		Operation operation = factory.createOperation();
		operation.setNumberA(8);
		operation.setNumberB(2);
		double result = operation.getResult();
		System.out.println(result);
	}
}
