package org.ordinary.day09.oop.overriding;

// overriding 연습문제
// 
class SuperClass{
	void paint() {
		draw(); // this.draw() 라 해도 동적바인딩 일어남.
	
	}
	void draw() {
		System.out.println("SuperObject");
	}
}
class SubClass extends SuperClass{
	void paint() {
		super.paint();
		super.draw(); // 부모의 draw메서드를 가리킴
	}
	void draw() {
		System.out.println("Sub Object");
	}
}


public class OverridingExam {

	public static void main(String[] args) {
		SuperClass ex = new SubClass();
		ex.paint();
	}

}
