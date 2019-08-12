package com.wwb.factory.abstractfactory;

/**
 * @Description TODO
 * @Package: com.wwb.factory.abstractfactory
 * @ClassName XMFarm
 * @author: wuwb
 * @date: 2019/8/12 16:50
 */
public class XMFarm implements Farm {
	@Override
	public Animal newAnimal() {
		return new Horse();
	}

	@Override
	public Plant newPlant() {
		return new Vegetables();
	}
}
