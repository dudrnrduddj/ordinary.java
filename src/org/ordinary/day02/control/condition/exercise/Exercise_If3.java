package org.ordinary.day02.control.condition.exercise;

import java.util.Scanner;

public class Exercise_If3 {

	public static void main(String[] args) {
//		점수를 입력받아 등급을 알려주는 프로그램을 작성하세요
//		점수를 입력해주세요 : 92
//		학점은 A입니다.
//		단, 점수는 0~100 사이의 수를 입력하도록 함.
//		점수를 입력해주세요 : 102
//		0 ~ 100 사이의 수를 입력해주세요
//		커트라인 ( 90 ~ 100 : A, 89 ~ 80 : B, 79 ~ 70 : C, 69 ~ 60 : D, 그 외 F)
		
		String grade;	// 모델 방식으로 코딩하는 것
						// 출력하는 메소드를 줄일 수 있음
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수를 입력해주세요 : ");
		int score = scanner.nextInt();
		
		if(score > 100) {
			System.out.println("0 ~ 100 사이의 수를 입력해주세요");
		}else {
			if(score >= 90) {
				grade = "A";
			}else if(score >= 80) {
				grade = "B";
			}else if(score >= 70) {
				grade = "C";
			}else if(score >= 60) {
				grade = "D";
			}else {
				grade = "F";
			}
			System.out.println("학점은 " + grade + "입니다.");
		}
		
		
	}

}
