package org.ordinary.day12.collection.student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	public List<Student> searchListByName(String name) {
		List<Student> searchList = new ArrayList<Student>();
		if(name != null) {
			for(Student search : studentList) {
				if(search.getName().equals(name)) {
					searchList.add(search);
				}
			}
		}
		
		return searchList;
	}
	
	public Student searchOneByName(String name) {
		if(name != null) {
			for(Student search : studentList) {
				if(search.getName().equals(name)) {
					return search;
				}
			}
		}
		
		return null;
	}

	@Override
	public List<Student> selectAllStudents() {
		return studentList;
	}


	@Override
	public void deleteStudent(int index) {
		studentList.remove(index);
	}
	
	public List<Student> reTakeTest(List<Student> studentList) {
		List<Student> retakeTestList = new ArrayList<Student>();
		for(Student std : studentList) {
			double avgScore = (std.getScore1()+std.getScore2())/2;
			if(avgScore < 60) {
				retakeTestList.add(std);
			}
		}
		return retakeTestList;
	}
	
	@Override
	public void modifyStudent(int index, Student student) {
//		studentList.remove(index);
//		studentList.add(index, student);
		studentList.set(index, student); // 대체하는 메소드 set()
	}

	public Map<String, Object> searchModifyStudent(String name) {
		if(name != null) {
			Map<String, Object> result = new HashMap<String, Object>();
			for(int i = 0; i < studentList.size(); i++) {
				Student student = studentList.get(i);
				if(name.equals(student.getName())) {
					result.put("student", student);
					result.put("index", i);
					return result;	// result값 하나 들어가면 바로 출력됨.
				}
			}
		}
		return null;
	}

	public int searchIndexByName(String name) {
		if(name != null) {
			int count = 0;
			for(Student std : studentList) {
				if(name.equals(std.getName())) {
					return count;
				}
				count++;
			}
		}
		return 0;
	}

	public String checkPass(Student student) {
		
		
		return null;
	}
	
	
}
