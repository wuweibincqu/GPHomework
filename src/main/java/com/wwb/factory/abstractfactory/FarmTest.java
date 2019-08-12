package com.wwb.factory.abstractfactory;

/**
 * @Description TODO
 * @Package: com.wwb.factory.abstractfactory
 * @ClassName FarmTest
 * @author: wuwb
 * @date: 2019/8/12 16:53
 */
public class FarmTest {

	public static void main(String[] args) {

		Farm farm1 = new XMFarm();
		Animal animal1 = farm1.newAnimal();
		Plant plant1 = farm1.newPlant();
		animal1.eat();
		plant1.show();

		Farm farm2 = new ZZFarm();
		Animal animal2 = farm2.newAnimal();
		Plant plant2 = farm2.newPlant();
		animal2.eat();
		plant2.show();


	}
}
