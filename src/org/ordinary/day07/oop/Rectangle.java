package org.ordinary.day07.oop;

public class Rectangle {
	// 너비와 높이를 입력받아
	// 사각형의 넓이를 출력하는 클래스를 만드시오.
	
	public int height;
	public int width;
	public int area;
	
	public int getArea() {
		return this.height * this.width;
	}
}
