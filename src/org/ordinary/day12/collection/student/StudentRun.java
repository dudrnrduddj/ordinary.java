package org.ordinary.day12.collection.student;

import java.util.List;
import java.util.Map;

public class StudentRun {
	public static void main(String[] args) {
		
		ManageStudent manage = new ManageStudent();
		ViewStudent view = new ViewStudent();
		
		end:
		while(true) {
			int input = view.printMenu();
		
			switch (input) {
			case 1:
				Student student = view.inputStudent();
				manage.registerStudent(student);
				break;
			case 2:
				String name = view.inputOneByName("검색");
				List<Student> searchList = manage.searchListByName(name);
				if(searchList.size() == 0) {
					System.out.println("일치하는 학생이 없습니다.");
				}else {
					view.searchStudentInfo(searchList);
				}
				break;
			case 3:
				List<Student> studentList = manage.selectAllStudents();
//				if(studentList != null) { => studentList는 arraylist가 있기때문에 null이 당연히 아님!
				//만약 이 코드를 쓰고 싶다면 manage.selectAllStudents()에서 조건문을 주어 empty면 return null이 되도록 해주면 됨.
				if(!studentList.isEmpty()) { // => isEmpty()로 배열안에 데이터가 존재하는지를 체크하기
					// 또는 size()로 크기가 0인지 체크
					view.displayInput(studentList);
				}else {
					view.displayMsg("회원정보가 없습니다.");
				}
				break;
			case 4:
				name = view.inputOneByName("수정");
//				int index = manage.searchIndexByName(name);
//				Student std = manage.searchModifyStudent(name);

				// 백엔드 프로그래밍에서 많이 사용하는 방식!! 
				Map<String, Object> result = manage.searchModifyStudent(name);
				Student std  = view.modifyStudent((Student)result.get("student"));
				manage.modifyStudent((int)result.get("index"), std);
				break;
				
			case 5:
				name = view.inputOneByName("삭제");
				int deleteIndex = manage.searchIndexByName(name);
				manage.deleteStudent(deleteIndex);
				break;
			case 6:
				name = view.inputOneByName("재평가 여부를 확인");
				student = manage.searchOneByName(name);
				String passResult = checkPass(student);
				view.displayMsg(passResult);
//				List<Student> reTestList = manage.reTakeTest(retestStudentList);
//				view.retestList(reTestList);
				break;
			case 0:
				view.displayMsg("프로그램을 종료합니다.");
				break end;
			default:
				view.displayMsg("메뉴를 다시 선택해주세요");
				break;
			}
			
			}
		
		}
		
	// controller 안에서 데이터를 처리하는 메소드!
	
	public static String checkPass(Student student) {
		int first = student.getScore1();
		int second = student.getScore2();
		double avg = (first + second) / 2.0; //2로 나누게 되면 정수로 형변환됨.
		if(avg >= 60) {
			if(first < 40) {
				return "1차 시험 재평가";
			}else if(second < 40) {
				return "2차 시험 재평가";
			}else {
				return "모두 통과입니다.";
			}
		}else {
			String result = "";
			if(first < 60) {
				result += "1차 시험 재평가\n";
			}
			if(second < 60) {
				result += "2차 시험 재평가";
			}
			return result;
		}		
	}
}

