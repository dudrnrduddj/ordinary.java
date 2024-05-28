package org.ordinary.day08.oop.score;

import java.util.Scanner;

public class ScoreProgram2 {
	static int kor, eng, math;	// 멤버 변수 (필드)
	

	public static void main(String[] args) {
		finish: while (true) {
			int choice = printMenu();

			switch (choice) {
			case 1:
				inputScore();
				break;
			case 2:
				printScore();
				break;
			case 3:
				displayMessage("프로그램을 종료합니다.");
				break finish;
			default:
				displayMessage("1 ~ 3 사이의 수를 입력해주세요.");
			}
		}
	}
	
	private static void displayMessage(String message) {
		System.out.println(message);
	}

	// 멤버 메소드
	private static void printScore() {
		System.out.println("======성적출력======");
		System.out.println("국어 : " + kor + "점");
		System.out.println("영어 : " + eng + "점");
		System.out.println("수학 : " + math + "점");
		System.out.println("총점 : " + (kor + eng + math) + "점");
		System.out.println("평균 : " + (kor + eng + math)/3 + "점");
		
	}
	private static void inputScore() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("======성정입력======");
		System.out.print("국어 : ");
		kor = scanner.nextInt();
		System.out.print("영어 : ");
		eng = scanner.nextInt();
		System.out.print("수학 : ");
		math = scanner.nextInt();
	}

	public static int printMenu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("======메인메뉴======");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.println("선택 >> ");
		int choice = scanner.nextInt();
		return choice;
	}

}
