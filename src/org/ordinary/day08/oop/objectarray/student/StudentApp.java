package org.ordinary.day08.oop.objectarray.student;

public class StudentApp {
	public static void main(String[] args) {
		
		ManageStudent manage = new ManageStudent();
		
		View view = new View();
		
		end:
		while(true) {
			int choice = view.printMenu();
			Student [] students = null;
			switch (choice) {
				case 1:
					students = view.displayInput();
					manage.inputInfo(students);
					break;
				case 2:
					students = manage.printInfo();
					view.displayInfo(students);
					break;
				case 3:
					view.printMessage("종료되었습니다.");
					break end;
				default:
					view.printMessage("1~3사이의 숫자를 입력해주세요.");
					break;
			}
		}
	}
}
