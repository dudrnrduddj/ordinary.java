package org.ordinary.day09.oop.inheritance.point;

public class ColorPoint extends Point{
	private String color;
	
	// 부모 생성자가 먼저 호출, 상속받은 경우 부모의 생성자부터 호출함.
	public ColorPoint() {
		super();
	}
	public ColorPoint(int x, int y, String color) {
		super(x, y); // 부모로 접근
//		this.x = x; // is not visible (private)
//		this.y = y;	// is not visible (private)
		this.color = color;
	}
	
	public void showColorPoint() {
		super.showPoint();
		System.out.println(this.color + "색의 점입니다.");
	}
	
	
//	 메모리구조
//	ColorPoint 객체를 생성하면 먼저 Point생성자가 먼저 호출되어 생성되고 그다음 colorPoint객체가 생성됨
//	colorPoint객체를 넘어서 point객체까지 포함하는 영역이 형성이됨
// 
//	-> 	자식 클래스의 객체를 생성할 때, 먼저 부모 클래스의 객체가 생성됩니다.
//    	자식 클래스의 객체는 부모 클래스의 객체를 포함하는 형태로 메모리에 할당됩니다.
	
}
