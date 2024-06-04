package org.ordinary.day12.collection.student;

import java.util.List;
import java.util.Scanner;

class ViewStudent {
	
	public int printMenu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("학생 성적관리 프로그램");
		System.out.println("1. 학생 정보 입력");
		System.out.println("2. 학생 정보 이름 검색");
		System.out.println("3. 학생 정보 전체 출력");
		System.out.println("4. 학생 정보 수정");
		System.out.println("5. 학생 정보 삭제");
		System.out.println("6. 재평가 대상 여부 확인");
		System.out.println("0. 프로그램 종료");
		System.out.print("선택 : ");
		int menu = scanner.nextInt();
		return menu;
	}
	
	public void displayInput(List<Student> student) {
		System.out.println("==== 학생 전체 정보 출력 ====");
		for(Student std : student) {
			System.out.printf("\t이름 : %s\n", std.getName());
			System.out.printf("\t1차 점수 : %d\n", std.getScore1());
			System.out.printf("\t2차 점수 : %d\n", std.getScore2());
			System.out.println("========================");
		}
	}

	public void displayMsg(String string) {
		System.out.println(string);
	}

	public Student inputStudent() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = scanner.next();
		System.out.print("1번째 점수 : ");
		int score1 = scanner.nextInt();
		System.out.print("2번째 점수 : ");
		int score2 = scanner.nextInt();
		
		Student student = new Student(name, score1, score2);
		
		return student;
	}

	public String inputOneByName(String category) { // O
		Scanner scanner  = new Scanner(System.in);
		System.out.println("==== 학생 정보 이름 검색 ====");
		System.out.print(category+"할 이름 : ");
		String name = scanner.next();
		return name;
	}

	public void searchStudentInfo(List<Student> searchList) {
		System.out.println("==== 검색된 학생 정보 ====");
		for(Student std : searchList) {
			if(std != null) {
				System.out.printf("\t이름 : %s\n", std.getName());
				System.out.printf("\t1차 점수 : %d\n", std.getScore1());
				System.out.printf("\t2차 점수 : %d\n", std.getScore2());
				System.out.println("========================");
			}
		}
	}

	
	
	public void retestList(List<Student> reTestList){
		System.out.println("==== 재시험 명단 ====");
		for(Student std : reTestList) {
			if(std != null) {
				System.out.printf("\t이름 : %s\n", std.getName());
				System.out.printf("\t1차 점수 : %d\n", std.getScore1());
				System.out.printf("\t2차 점수 : %d\n", std.getScore2());
				System.out.println("========================");
			}
		}
	}

	public Student modifyStudent(Student std) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("수정할 1차 점수 입력 : ");
		std.setScore1(scanner.nextInt());
		System.out.print("수정할 2차 점수 입력 : ");
		std.setScore2(scanner.nextInt());
		
		return std;
		
	}
	
	
	
	
}
