package org.ordinary.day02.operator.exercise;

import java.util.Scanner;

public class Exercise_Logical2 {

	public static void main(String[] args) {
		
		char a = 'A' + 1; // char는 아스키코드로 맵핑되어 있어 숫자화 되어있음
		System.out.println("문자 : " + a);

//		***문제4
//		입력받은 문자가 대문자인지 소문자인지 확인하세요!
//		변수 word에 초기화
//		문자를 입력해주세요 : a
//		문자 출력 : a
//		영어 대문자 확인 : true
//		몇부터 몇까지의 숫자인가? : 65 ~ 90(대문자)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자를 입력해주세요 : ");
		char word = sc.next().charAt(0);	
//		nextChar()같은 메서드는 따로 없고 next().charAt(0)으로
//		문자열의 0번째자리의 char를 추출하는 메서드를 이용했다!
		String result = word >= 65 && word <= 90 ? "대문자입니다.":"소문자입니다.";
		System.out.println("영어 대문자 확인 : " + result);
	}

}
