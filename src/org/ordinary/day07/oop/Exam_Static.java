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
		
		// static 멤버는 static레벨로 접근하는 것이 바람직하다.
		smp.originMethod(); //The static method originMethod() from the type
//						      StaticSample should be accessed in a static way
	}

}
