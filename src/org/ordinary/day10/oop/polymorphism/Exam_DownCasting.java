package org.ordinary.day10.oop.polymorphism;

class Person{
	String name;
	String id;
	
	public Person() {}
	
	public Person(String name, String id) {
		this.name = name;
		this.id = id;
	}
}


class Student extends Person{
	String grade;
	String department;
	
	public Student() {
		
	}
	
	public Student(String grade, String department) {
		this.grade = grade;
		this.department = department;
	}
}

public class Exam_DownCasting {
	public static void main(String[] args) {
		Person p = new Student("1","2"); // 업캐스팅(상속관계인 경우에 가능)
		
		System.out.println(p.name);
		System.out.println(p.id);
		
		// 업캐스팅되어있어 객체의 멤버에 접근 못함!
//		System.out.println(p.grade);
//		System.out.println(p.department);
		
		// 다운 캐스팅
		
		Student s = (Student)p;
		System.out.println(s.grade);
		System.out.println(((Student)p).department);
		
		
	}

}
