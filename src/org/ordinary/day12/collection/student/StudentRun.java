package org.ordinary.day12.collection.student;

import java.util.List;

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
				String name = view.inputOneByName();
				List<Student> searchList = manage.searchOneByName(name);
				view.searchStudentInfo(searchList);
				
				break;
			case 3:
				List<Student> studentList = manage.selectAllStudents();
				view.displayInput(studentList);
				break;
			case 4:
				int modifyIndex = view.inputIndex();
				Student modifyStudent = view.inputStudent();
				manage.modifyStudent(modifyIndex, modifyStudent);
				
				break;
			case 5:
				int deleteIndex = view.inputIndex();
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
