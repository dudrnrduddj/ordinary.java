package org.ordinary.day07.oop;

// 접근지정자(제한자)
// 종류 : public, protected, default, private
class Sample{		// class에도 접근제한자 사용할 수 있다.
	
	public int a;	// public
	private int b;	// private
	int c;			// default
	
}


public class Exam_Access {

	public static void main(String[] args) {
		Sample smp = new Sample();
		smp.a = 507;
//		smp.b = 1023; // The field sample.b is not visible
		smp.c = 2024;
	}

}
