package org.ordinary.day08.oop.objectarray.student;

import java.util.Scanner;

public class View {
	
	public void printMessage(String string) {
		System.out.println(string);
	}
	
	public int printMenu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("=====메인메뉴=====");
		System.out.println("1.성적입력");
		System.out.println("2.성적출력");
		System.out.println("3.종료");
		System.out.print("선택 : ");
		int choice = scanner.nextInt();
		System.out.println();
		
		return choice;
	}
	
	public Student[] displayInput() {
		Scanner scanner = new Scanner(System.in);
		Student [] students = new Student[3];
		
		for(int i = 0; i < students.length; i++) {
			System.out.print("이름 : ");
			String name = scanner.next();
			System.out.print("첫번째 점수 : ");
			int score1 = scanner.nextInt();
			System.out.print("두번째 점수 : ");
			int score2 = scanner.nextInt();
			students[i] = new Student(name, score1, score2);
		}
		return students;
	}

	public void displayInfo(Student[] students) {
		for(int i = 0; i < students.length; i++) {
			System.out.println("===="+(i+1)+"번째 학생의 정보 출력====");
			System.out.println(students[i].name+" 학생의 첫번째 점수는 "+students[i].score1+"점, 두번째 점수는 "+students[i].score2+"점입니다.");
		}
	}
	
	
	
	
}
