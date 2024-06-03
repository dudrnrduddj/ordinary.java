package org.ordinary.day07.oop;

class StaticSample{
	public int num;
	public static int input;
	public void sampleMethod() {}
	public void goodMethod() {}
	public static void originMethod() {
		input = 2024;
	}
}


public class Exam_Static {

	public static void main(String[] args) {
		// static 레벨의 클래스멤버에 바로 접근이 가능하다.
		StaticSample.input = 1023;
		StaticSample.originMethod();
		System.out.println(StaticSample.input);
		
		// 
		StaticSample smp = new StaticSample();
		smp.num = 507;
		smp.sampleMethod();
		smp.goodMethod();
		
		// static 영역의 변수는 static레벨로 참조하라는 경고문
		smp.originMethod(); //The static method originMethod() from the type
//						      StaticSample should be accessed in a static way
	}

}
