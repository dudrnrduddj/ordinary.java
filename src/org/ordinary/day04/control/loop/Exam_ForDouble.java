package org.ordinary.day04.control.loop;

public class Exam_ForDouble {
	public static void main(String[] args) {
//		중첩 for문 - for문 안의 for문
//		문법
//		for( ) {
//			for( ){
//			}
//		}
//		for문에 증감식은 복합대입연산자를 이용한 식을 써도 된다.
//		ex) i*= 2, i+=2
//		증감식 자리를 비워나도 되는데 그러면 무한반복이 일어나기에 
//		한바퀴가 지나면 증감이되도록 식을 안쪽에서라도 써줘야함.
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				int result = i * j;
				System.out.println(i + " * " + j + " = " + result);
			}
		}
	}
}
