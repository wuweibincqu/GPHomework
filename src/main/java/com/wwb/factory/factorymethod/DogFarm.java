package com.wwb.factory.factorymethod;

/**
 * @Description TODO
 * @Package: com.wwb.factory.factorymethod
 * @ClassName DogFarm
 * @author: wuwb
 * @date: 2019/8/12 17:08
 */
public class DogFarm implements AnimalFarm {
	@Override
	public Animal newAnimal() {
		return new Dog();
	}
}
