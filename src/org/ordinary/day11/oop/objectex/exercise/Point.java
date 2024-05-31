package org.ordinary.day11.oop.objectex.exercise;

public class Point {
	int x;
	int y;
	
	@Override
	public boolean equals(Object obj) { // 업캐스팅
		Point point = (Point) obj; // 다운캐스팅
		
		return point.x == this.x && point.y == this.y;
//		if(point.x == this.x && point.y == this.y) {
//			return true;
//		}else {
//			return false;
//		}
	}
	public Point() {}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
