package org.ordinary.day02.operator;

public class Exam_Unary {
	public static void main(String[] args) {
//		단항 연산자
//		a++, ++a -> a = a + 1;
		int a1 = 1;
		System.out.println(++a1); // 2 - 전위연산
		System.out.println(a1++); // 2 - 후위연산
		System.out.println(a1);	  // 3
		
//		문제1
//		a가 10이고, b는 20, c는 30이니다
//		a++;
//		b = (--a) + b;  a=10 b=30
//		c = (a++) + (--b);  c=39 b=29 a=10
//		a, b, c의 값은 얼마일까요?
//		a = 11, b = 29, c = 39
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		a++;
		b = (--a)+ b;
		c = (a++) + (--b);
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		
//		문제2
//		논리형 변수 flag를 true 초기화하고 다음 연산을 수행하고 결과값을 확인해보세요.
//		!!!!flag;
		Boolean flag = true;
		flag = !!!!flag;
		System.out.println(flag);
		
//		문제3
//		정수형 변수 x=100, y=33, z=0 초기화 후 다음 연산수행 후 x,y,z를 출력하세요.
		int x = 100;
		int y = 33;
		int z = 0;
		x--; // 100 다음라인부터 99
		z = x-- + --y; 
		//x=99, y=32, z=131
//		x=98
		x = 99 + x++ + x; // x=296 (99+98+99) x=296
		y = y-- + y + ++y; // 32 31 32 
//		y=95
		
//		x = x++ + x; => x++의 결과가 뒤의 x에 적용이 되야함.
//		후위연산자는 무조건 다음줄에서 적용되는것은 아님.
		
		System.out.println("x : " + x);	// 296
		System.out.println("y : " + y); // 95
		System.out.println("z : " + z); // 131
	}
}
