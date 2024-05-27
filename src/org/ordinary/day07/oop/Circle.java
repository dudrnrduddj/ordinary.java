package org.ordinary.day07.oop;

public class Circle {
	// 반지름
	// 이름
	public double radius;
	public String name;
	private double privateRadius;
	private String privateName;
	
	public String getName() {
		return privateName;
	}

	public void setName(String privateName) {
		this.privateName = privateName;
	}

	public double getRadius() {
		return privateRadius;
	}
	
	public void setRadius(double privateRadius) {
		this.privateRadius = privateRadius;
	}

	// 넓이 구하기
	public double getArea() {	// return을 쓰면 public 옆에 return값과 같은 데이터타입을 써야함.
		return 3.14 * this.radius * this.radius;
	}

	public double getPrivateArea() {
		return 3.14 * privateRadius * privateRadius;
	}
	
	
}
