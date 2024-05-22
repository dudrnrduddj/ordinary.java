package org.ordinary.day02.operator;


public class Exam_Logical {
	public static void main(String[] args) {
//		논리연산자 예제
//		남자이면서 평균평점 4.3이상인 사람 - and
//		컴퓨터공학과 또는 경영학과인 사람 - or
		boolean result1, result2, result3, result4;
//		boolean result2;
//		boolean result3;
//		boolean result4;
		
//		AND -> &&, OR -> ||
		int num1 = 50;
		int num2 = 30;
		
		result1 = (num1 == num2) && (num1 < num2);
		System.out.println("결과값1 : " + result1);
		
		result2 = (num1 < num2) || (num1 == num2);
		System.out.println("결과값2 : " + result2);
		
		result3 = (num1 > num2) && (num1 != num2);
		System.out.println("결과값3 : " + result3);
		
		result4 = (num1 > num2) || (num1 != num2);
		System.out.println("결과값4 : " + result4);
		
		
//		논리 연산자의 특징!!
//		and 의 경우 앞의 식이 false라면 뒤의 식의 결과와 상관없이 결과는 false이므로 뒤의 식은 아예 진행을 하지않음!
//		or의 경우 앞의 식이 true라면 뒤의 식의 결과와 상관없이 결과는 true이므로 뒤의 식은 아예 진행을 하지않음!
		
//		***문제1
//		a=50, b=30을 입력받아 다음과 같은 식을 작성하였을 때 결과값을 예상해보고 출력해보자.
		int a = 50;
		int b = 30;
		boolean resultA1 = a != b && a < b; // false
		System.out.println("resultA1 : " + resultA1);
		boolean resultA2 = a < b || a == b; // false
		System.out.println("resultA2 : " + resultA2);
		boolean resultA3 = a > b && a != b; // true
		System.out.println("resultA3 : " + resultA3);
		boolean resultA4 = a > b || a == b; // true 
		System.out.println("resultA4 : " + resultA4);
		
//		***문제2
		int c = 70;
		int d = 55;
		boolean resultB1 = c==d || c++<100;		//true
		// c=71
		System.out.println("resultB1 : " + resultB1);
		
		boolean resultB2 = c<d && --d<55;		//false
		// d=55 
//		and의 경우 앞이 false라 뒤는 연산을 진행하지 않음! 따라서 --d는 진행 X
		System.out.println("resultB2 : " + resultB2);
		
		boolean resultB3 = c!=d && d--<c++;		//true
		// c=72 d=54
		System.out.println("resultB3 : " + resultB3);
		
		boolean resultB4 = c++ != d || d++ >= 85; //true
		System.out.println("resultB4 : " + resultB4);
//		c=73, d=54
//		 => or의 경우 앞의 결과가 true면 뒤는 연산X -> 따라서 d++ 진행 X
		System.out.println(c); // 73
		System.out.println(d); // 54
		
		
		
	}
}
