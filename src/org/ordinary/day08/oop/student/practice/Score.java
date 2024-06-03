package org.ordinary.day08.oop.student.practice;

import java.util.Scanner;

public class Score {
	int kor, eng, math;
	
	
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("====성적 입력====");
		System.out.println("1. 국어 : ");
		this.kor = scanner.nextInt();
		System.out.println("1. 영어 : ");
		this.eng = scanner.nextInt();
		System.out.println("1. 수학 : ");
		this.math = scanner.nextInt();
	}


	public void output() {
		System.out.println("====성적 출력====");
		System.out.println("1. 국어 : " + this.kor + "점");
		System.out.println("2. 영어 : " + this.eng + "점");
		System.out.println("3. 수학 : " + this.math + "점");
	}
}
