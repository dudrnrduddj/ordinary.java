package org.ordinary.day01.basic;

public class Exam_DataType {
	public static void main(String [] args) {
//		System.out.println("출력하는 코드");
		
//		기본형
		/*
		 * 정수, 실수, 문자, 불린
		 * 정수 4가지(byte, short, int, long)
		 * 실수 2가지(float, double)
		 * 문자 char
		 * 불린형 boolean
		 * 
		참조형
		 * 문자열 string
		 */
//		변수 선언 및 초기화(할당)
		boolean result = true;
		char fChar = 'a';
		System.out.println(result);
		System.out.println(fChar);
//		정수 part
		byte bNum = 127; //(-128 ~ 127)
		short sNum = 32767;
		int iNum = 2147483647;
		long lNum = 2147483648L; // long의 경우 리터럴 뒤에 l이나 L을 반드시 표기해야한다.
								 //	기본적으로 정수는 메모리의 크기가 4바이트이기 때문이다.
		 						 // 상수풀에서도 마찬가지이므로 식별자를 써줌으로써 컴파일러에게 명시해주는 것이다.
		
//		실수 part
		float fNum = 23.026F;	 // float의 경우 리터럴 뒤에 f나 F를 반드시 표기해야 한다.
								 // 기본적으로 실수는 double로 인식하기 때문이다.
		double dNum = 23.026;
		
	}
}
