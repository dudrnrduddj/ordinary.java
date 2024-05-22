package org.ordinary.day03.control.condition.exercise;

import java.util.Scanner;

public class Exercise_Switch2 {

	public static void main(String[] args) {
	
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력해주세요 : ");
		int score = scanner.nextInt();
		String grade;
		
		switch (score / 10) {
			case 9: case 10:
				grade = "A";
				break;
			case 8:
				grade = "B";
				break;
			case 7:
				grade = "C";
				break;
			case 6:
				grade = "D";
				break;
			
			default:
				grade = "F";
				break;
		}
		
		if(score >= 0 && score <= 100) {
			System.out.printf("학점은 %s입니다.", grade);
		}else {
			System.out.println("0 ~ 100 사이의 수를 입력하세요");
		}
		
		
	}

}
