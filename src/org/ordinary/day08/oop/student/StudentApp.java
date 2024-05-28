package org.ordinary.day08.oop.student;

public class StudentApp {

	public static void main(String[] args) {
		ManageStudent manage = new ManageStudent();
		ViewStudent view = new ViewStudent();
		end:
		while(true) {
			int choice = view.printMenu();
			switch (choice) {
				case 1:
					manage.inputScore();
					break;
				case 2:
					manage.printScore();
					break;
				case 3:
					view.displayMessage("프로그램을 종료합니다.");
					break end;
				default:
					view.displayMessage("1 ~ 3 사이의 수를 입력해주세요.");
			}
		}
	}

}
