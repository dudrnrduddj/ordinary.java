package org.ordinary.day10.oop.abstractex.exercise;

public class GoodCalculator extends Calculator{

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int substract(int a, int b) {
		if(a >= b) {
			return a-b;
		}else {
			return b-a;
		}
		
	}

	@Override
	public double average(int[] a) {
		int sum = 0;
		for(int array : a) {
			sum += array;
		}
		return (double)sum/a.length;	// 정수끼리의 연산이라 반드시 double로 업캐스팅 해야함
	}

}
