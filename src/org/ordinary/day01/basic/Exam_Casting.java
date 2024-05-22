package org.ordinary.day01.basic;

public class Exam_Casting {
	public static void main(String[] args) {
//		강제 타입 변환!
		byte b = 127;
		int i = 100;
		System.out.println(b+i);				 //227
		System.out.println(10/4);				 //2
		System.out.println(10.0/4);				 //2.5
		System.out.println((char)0x12340041);	 //A
		System.out.println((byte)(b+i));		 //-29
		System.out.println((int)(2.9 + 1.8));	 //3.8
		System.out.println((int)2.9 + 1.8);		 //4
		System.out.println((int)2.9 + (int)1.8); //3
		
//		실수와 정수를 연산할때 자동 타입 변환되어 계산된다는 점을 유의하자!
//		정수끼리 연산한 결과가 실수더라도 타입변환을 하지않으면 손실이 일어난다는 점 유의하자!
		// 묵시적 형변환 vs 명시적 형변환
		// ex) 실수 -> 정수 (소수점 이하 값 손실 발생) => 명시적 형변환 필수
		// ex) 정수 -> 실수 (손실 없음) => 묵시적 형변환
	}
	
}
