package org.ordinary.day08.oop.objectarray;

public class Exam_ObjectArray1 {

	public static void main(String[] args) {
		Circle donut = new Circle(10);
		System.out.println("도넛의 넓이 : " + donut.getArea());
		Circle pizza = new Circle(7);
		System.out.println("피자의 넓이 : " + pizza.getArea());
		
		Circle[] cArrs = new Circle[5];
		cArrs[0] = donut;	// 주소값이 참조됨.
		cArrs[1] = pizza;
		cArrs[3] = new Circle(15);
		System.out.println("======배열 초기화 후 출력======");
		System.out.println(cArrs[0].getArea());
		System.out.println(cArrs[1].getArea());
//		System.out.println(cArrs[2].getArea()); // NullPointerException
		System.out.println(cArrs[3].getArea());
	}

}
