package org.ordinary.day08.oop.score;

import java.util.Scanner;

public class ScoreProgram {
	public static void main(String[] args) {
//		======메인 메뉴======
//		1. 성적입력
//		2. 성적출력
//		3. 종료
//		선택 : 
		Scanner scanner = new Scanner(System.in);
		int kor = 0;
		int eng = 0;
		int math = 0;

		end: while (true) { // 반복문에 이름지정
			System.out.println("======메인 메뉴======");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 종료");
			System.out.println("선택 :");
			
			int choice = scanner.nextInt();
			
			switch (choice) {
			
			case 1:
				System.out.println("======성적입력======");
				System.out.print("국어 : ");
				kor = scanner.nextInt();
				System.out.print("영어 : ");
				eng = scanner.nextInt();
				System.out.print("수학 : ");
				math = scanner.nextInt();
				
				break;
			case 2:
				System.out.println("======성적출력======");
				System.out.println("국어 : " + kor + "점");
				System.out.println("영어 : " + eng + "점");
				System.out.println("수학 : " + math + "점");
				System.out.println("총점 : " + (kor + eng + math) + "점");
				System.out.println("평균 : " + (kor + eng + math)/3 + "점");
				break;
			case 3:
				System.out.println("프로그램이 종료되었습니다.");
				break end;
			default:
				System.out.println("1~3 사이의 숫자를 입력해주세요.");
			}
		}
	}
}
