package org.ordinary.day09.oop.inheritance;

import org.ordinary.day09.oop.inheritance.point.Point;

class Super{
	public int pub;
	int def;
	protected int pro;
	private int pri;
}

class Sub extends Super{
	void set() {
		super.pub = 24;
		super.def = 5;
		super.pro = 7;
//		super.pri = 10; // is not visible
	}
}

class ShapePoint extends Point{
	void set() {
		Point p = new Point();
		p.pub = 24; // public이니깐 다른패키지에서도 가능
//		p.def = 57; // default라 다른패키지에서 불가능
//		p.pro = 10; // protected는 같은 패키지 또는 상속일 때 가능
		// p로 접근하려면 같은 패키지일때만 가능
		// 상속관계에서 접근하고 싶으면 패키지 상관없이 super로 접근할 수 있음
		
//		p.pri = 23; // private은 무조건 같은 클래스에서 가능
		
		super.pub = 20; // public은 당연히 됨.
//		super.def = 30; // 다른패키지에선 super를 참조해도 접근 불가
		super.pro = 24; // 상속관계에서 super로 접근 가능함을 볼 수 있다.
//		super.pri = 36; // private은 당연히 안됨.
	}
//		같은 패키지에서는 default와 같이 접근 제한이 없지만,
//		다른 패키지에서는 자식 클래스만 접근을 허용한다.(super)
}

public class Exam_Protected {

}
