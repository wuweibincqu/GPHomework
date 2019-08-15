package com.wwb.pattern.factory.abstractfactory;

/**
 * @Description TODO
 * @Package: com.wwb.pattern.factory.abstractfactory
 * @ClassName ZZFarm
 * @author: wuwb
 * @date: 2019/8/12 16:52
 */
public class ZZFarm implements Farm {
	@Override
	public Animal newAnimal() {
		return new Dog();
	}

	@Override
	public Plant newPlant() {
		return new Fruitage();
	}
}
