package org.ordinary.day10.oop.abstractex.exercise;

public class CalcRun {

	public static void main(String[] args) {
		
//		GoodCalculator cal = new GoodCalculator();
		Calculator cal = new GoodCalculator(); // 추상클래스의 타입으로 선언!
		int add = cal.add(5, 7);
		int substract = cal.substract(10, 23);
		
//		int[] a = {5, 7, 10, 23};
		double avg = cal.average(new int[]{5, 7, 10, 23});
		
		
		
		System.out.println("합 : " + add);
		System.out.println("차 : " + substract);
		System.out.println("평균 : " + avg);

	}

}
