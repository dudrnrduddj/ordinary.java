package org.ordinary.day11.oop.objectex;

class Rectangle{
	int width, height;
	
	public Rectangle() {
		
	}
	
	public Rectangle(int width, int height) {
	this.width = width;
	this.height = height;
	}
	
	@Override
	public boolean equals(Object obj) {
		Rectangle rect = (Rectangle)obj;
		if(width*height == rect.width*rect.height) {
			return true;
		}else {
			return false;
		}
	}
}

public class Exam_RectEquals {

	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle(5, 7);
		Rectangle rect2 = new Rectangle(5, 7);
//		if(rect1 == rect2) {} -> 주소가 다를테니이렇게 비교는 안되겠지
		if(rect1.equals(rect2)) { // 다릅니다. -> equals를 오버라이딩 해주자!
			System.out.println("같습니다.");
		}else {
			System.out.println("다릅니다.");
		}
	}

}
