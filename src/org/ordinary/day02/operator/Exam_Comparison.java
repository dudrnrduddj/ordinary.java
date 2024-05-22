package org.ordinary.day02.operator;

public class Exam_Comparison {
	public static void main(String[] args) {
//		비교 연산자
//		equal => '=' (X) '=='(O)
		
		int num1 = 50;
		int num2 = 30;
		boolean result;
		result = (num1 > num2);	// true
		result = (num1 < num2); // false
		result = (num1 == num2); // false
		result = (num1 != num2); // true
		System.out.println("result : " + result);
		
		
	}
}
