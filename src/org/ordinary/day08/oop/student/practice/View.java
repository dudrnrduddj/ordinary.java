package org.ordinary.day08.oop.student.practice;

import java.util.Scanner;

public class View {

	public void printMsg(String message) {
		System.out.println(message);
	}

	public int printMenu() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("====메인 메뉴====");
		System.out.println("1. 성적 입력");
		System.out.println("2. 성적 출력");
		System.out.println("3. 종료");
		System.out.print("선택 >> ");
		int choiceNum = scanner.nextInt();
		return choiceNum;
	}

}
