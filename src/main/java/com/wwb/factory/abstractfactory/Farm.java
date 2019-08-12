package com.wwb.factory.abstractfactory;

/**
 * @Description TODO
 * @Package: com.wwb.factory.abstractfactory
 * @ClassName IFactory
 * @author: wuwb
 * @date: 2019/8/12 15:16
 */
public interface Farm {

	Animal newAnimal();
	Plant newPlant();
}
