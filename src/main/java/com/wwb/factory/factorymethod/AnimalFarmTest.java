package com.wwb.factory.factorymethod;

/**
 * @Description TODO
 * @Package: com.wwb.factory.factorymethod
 * @ClassName AnimalFarmTest
 * @author: wuwb
 * @date: 2019/8/12 17:08
 */
public class AnimalFarmTest {

	public static void main(String[] args) {

		AnimalFarm farm = new HorseFarm();
		Animal animal = farm.newAnimal();
		animal.eat();

		AnimalFarm farm2 = new DogFarm();
		Animal animal2 = farm2.newAnimal();
		animal2.eat();
	}
}
