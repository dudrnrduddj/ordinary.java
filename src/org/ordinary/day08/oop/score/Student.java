package org.ordinary.day08.oop.score;

import java.util.Scanner;

public class Student {
	// 멤버 필드
	int kor;
	int eng;
	int math;
	
	//생성자
	public Student() {
		
	}
	
	// 멤버 메소드
	
	// 메뉴 출력
	public int printMenu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("======메인메뉴======");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.println("선택 >> ");
		int choice = scanner.nextInt();
		return choice;
	}
	// 성적 입력
	public void inputScore() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("======성정입력======");
		System.out.print("국어 : ");
		kor = scanner.nextInt();
		System.out.print("영어 : ");
		eng = scanner.nextInt();
		System.out.print("수학 : ");
		math = scanner.nextInt();
	}
	// 성적 출력
	public void printScore() {
		System.out.println("======성적출력======");
		System.out.println("국어 : " + kor + "점");
		System.out.println("영어 : " + eng + "점");
		System.out.println("수학 : " + math + "점");
		System.out.println("총점 : " + (kor + eng + math) + "점");
		System.out.println("평균 : " + (kor + eng + math)/3 + "점");
		
	}
	// 메시지 출력
	public void displayMessage(String message) {
		System.out.println(message);
	}

}
