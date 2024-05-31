package org.ordinary.day11.oop.interfacepkg.zoo;

public class Zoo {
	public static void main(String[] args) {
		
		Zookeeper zkp = new Zookeeper();
		zkp.feed(new Lion());
		zkp.feed(new Tiger());
		zkp.feed(new Bear());
	}
}
