package org.ordinary.day08.oop.student.practice;

public class StudentApp {

	public static void main(String[] args) {
		// 화면 출력
		// 선택 - > 입력
//				- > 출력
//				-> 종료
//		
		View view = new View();
		Score score = new Score();
		end:
		while(true) {
			int choice = view.printMenu();

			switch (choice) {
				case 1:
					score.input();
					break;
				case 2:
					score.output(); 
					break;
				case 3:
					view.printMsg("종료되었습니다.");
					break end;
				default:
					view.printMsg("1 ~ 3의 숫자를 입력해주세요.");
					break;
			}
		}

	}

}
