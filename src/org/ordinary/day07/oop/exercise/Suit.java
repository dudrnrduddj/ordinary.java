package org.ordinary.day07.oop.exercise;

public class Suit {
	
	public static void main(String[] args) {
		Suit suit = new Suit(100);
	}
		int size;
		String brand;
		int price;
		
		public Suit(int size) {
			this(size, "Hazzys");		//1. 인자 두개인 생성자 호출  -> 스택에서 세번째로 완료됨.
			System.out.println("Suit(int) 호출");
		}
		
		public Suit(int size, String brand) {
			this(size, brand, 100000);	// 2. 인자 세 개인 생성자 호출 -> 스택에서 두번째로 완료됨.
			System.out.println("Suit(int, String) 호출");
		}
		
		public Suit(int size, String brand, int price) {	// 3. 스택에서 가장 먼저 완료됨.
			this.size = size;
			this.brand = brand;
			this.price = price;
			System.out.println("Suit(int, String, int) 호출");
		}
}
