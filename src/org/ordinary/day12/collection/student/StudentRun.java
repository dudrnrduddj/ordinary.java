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
				List<Student> searchList = manage.searchOneByName(name);
				view.searchStudentInfo(searchList);
				
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
				List<Student> retestStudentList = manage.selectAllStudents();
				List<Student> reTestList = manage.reTakeTest(retestStudentList);
				view.retestList(reTestList);
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
	
	
	
	
}
