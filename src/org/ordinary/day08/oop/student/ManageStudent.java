package org.ordinary.day08.oop.student;

import java.util.Scanner;

public class ManageStudent {
	
	int kor;
	int eng;
	int math;

	public void inputScore() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("======성적입력======");
		System.out.print("국어 : ");
		kor = scanner.nextInt();
		System.out.print("영어 : ");
		eng = scanner.nextInt();
		System.out.print("수학 : ");
		math = scanner.nextInt();
	}

	public void printScore() {
		System.out.println("======성적출력======");
		System.out.println("국어 : " + kor + "점");
		System.out.println("영어 : " + eng + "점");
		System.out.println("수학 : " + math + "점");
		System.out.println("총점 : " + (kor + eng + math) + "점");
		System.out.println("평균 : " + (kor + eng + math)/3 + "점");
		
	}

}
