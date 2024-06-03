package org.ordinary.day12.collection.student;

import java.util.ArrayList;
import java.util.List;

public class ManageStudent implements ManageInterface{

	private List<Student> studentList;
	
	public ManageStudent() {
		this.studentList = new ArrayList<Student>();
	}
	
	@Override
	public void registerStudent(Student student) {
		studentList.add(student);
	}

	@Override
	public List<Student> searchOneByName(String name) {
		List<Student> searchStudent = new ArrayList<Student>();
		
		for(Student search : studentList) {
			if(search.getName().equals(name)) {
				searchStudent.add(search);
			}
		}
		
		return searchStudent;
	}

	@Override
	public List<Student> selectAllStudents() {
		return studentList;
	}

	@Override
	public void modifyStudent(int index, Student student) {
		studentList.remove(index);
		studentList.add(index, student);
	}

	@Override
	public void deleteStudent(int index) {
		studentList.remove(index);
	}
	
	public List<Student> reTakeTest(List<Student> studentList) {
		List<Student> retakeTestList = new ArrayList<Student>();
		for(Student std : studentList) {
			if(std.getScore1() + std.getScore2() < 150) {
				retakeTestList.add(std);
			}
		}
		return retakeTestList;
	}
	
	
}
