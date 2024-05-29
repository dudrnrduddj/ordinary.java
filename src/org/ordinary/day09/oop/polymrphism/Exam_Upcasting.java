package org.ordinary.day09.oop.polymrphism;


class Person{
	String name;
	String idSt;
}

class Student extends Person{
	String grade;
	String department;
	
	public Student(){}
	
}

class Worker extends Person{}
class Doctor extends Person{}


public class Exam_Upcasting {
	public static void main(String[] args) {
		Person person = new Person();
		Student student = new Student();
		person = student;
		person = new Worker();
		person = new Doctor();
	}

}
