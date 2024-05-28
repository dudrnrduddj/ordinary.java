package org.ordinary.day08.oop.objectarray;

public class Circle {
	public int radius;
	
	public Circle() {} // 생성자
	
	public Circle(int radius) { // 생성자 오버로딩
		this.radius = radius;
	}
	
	public double getArea() {
		double area = 3.14 * this.radius * this.radius;
		return area;
	}
}
