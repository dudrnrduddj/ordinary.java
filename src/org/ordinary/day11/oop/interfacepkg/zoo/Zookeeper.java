package org.ordinary.day11.oop.interfacepkg.zoo;

public class Zookeeper{

	public void feed(FoodInterface animal) {
		System.out.println("feed" + animal.animalFood());
	}

//	public void feed(Lion lion) {
//		System.out.println("feed gazel");
//	}
//
//	public void feed(Tiger tiger) {
//		System.out.println("feed rabbit");
//	}
//	
//	public void feed(Bear bear) {
//		System.out.println("feed honey");
//	}

}
