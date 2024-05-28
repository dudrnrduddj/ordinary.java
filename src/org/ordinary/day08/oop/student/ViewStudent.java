package org.ordinary.day08.oop.student;

import java.util.Scanner;

public class ViewStudent {

	public int printMenu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("======메인메뉴======");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.print("선택 >> ");
		int choice = scanner.nextInt();
		return choice;
	}

	public void displayMessage(String message) {
		System.out.println(message);
	}

}
