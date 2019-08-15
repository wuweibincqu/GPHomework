package com.wwb.pattern.factory.factorymethod;

/**
 * @Description TODO
 * @Package: com.wwb.pattern.factory.factorymethod
 * @ClassName HorseFarm
 * @author: wuwb
 * @date: 2019/8/12 17:07
 */
public class HorseFarm implements AnimalFarm {
	@Override
	public Animal newAnimal() {
		return new Horse();
	}
}
