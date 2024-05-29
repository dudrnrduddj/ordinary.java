package org.ordinary.day09.oop.overriding;


public class Exam_Overriding {
	
	static void paint(Shape shape) {
		shape.draw();
	}

	public static void main(String[] args) {

		/* 오버라이딩
		 * 1. 오버라이딩은 상속관계에서 사용
		 * 2. 오버라이딩은 다 똑같고(접근 지정자, 반환형, 메소드명, 매개변수 갯수와 타입)
		 * 실행문장만 재정의 하는것
		 * 3. 오버라이딩이 되면 동적바인딩이 되어 다형성을 이용할 수 있음.
		 */
		// 직접객체선언 후 메서드 사용
//		Shape shape = new Shape();
//		shape.draw();
//		Circle circle = new Circle();
//		circle.draw();
//		Line line = new Line();
//		line.draw();
//		Rectangle rectangle = new Rectangle();
//		rectangle.draw();
		
		// 매개변수 타입 형변환
		Shape shape = new Shape();
		paint(shape);
		Circle circle = new Circle();
		paint(circle);
		Rectangle rectangle = new Rectangle();
		paint(rectangle);
		Line line = new Line();
		paint(line);

	}

}
