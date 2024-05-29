package org.ordinary.day09.oop.overriding;

public class Line extends Shape{
	@Override
	public void draw() {
		System.out.println("Shape_Line_Overrride");
	}
}
