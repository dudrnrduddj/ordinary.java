package org.ordinary.day02.printbasic;

public class Exam_PrintSample {

	public static void main(String[] args) {
		System.out.println("이것이 원래 쓰던거");
		System.out.print("이게 조금 다른거 \n"); // 개행이 없어서 \n
		
		
//		형식 문자
//		1. 정수 : %d
//		2. 실수 : %f -> 소수점 자리 수 정하고 싶으면 %.1f 이런식으로 (.숫자) 넣어주기
//		3. 문자 : %c
//		4. 문자열 : %s
		System.out.printf("정수 출력 : %d \n", 1023);
		System.out.printf("문자열 출력 : %s \n", "일공이삼");
		System.out.printf("정수 출력 : %d, 문자열 출력 : %s",1023, "일공이삼");
	
		System.out.printf("개강날짜 : %.2f, 종강날짜 : %.4f \n", 5.7, 10.23);
	}
}
