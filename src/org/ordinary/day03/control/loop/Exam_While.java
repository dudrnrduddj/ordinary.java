package org.ordinary.day03.control.loop;

public class Exam_While {

	public static void main(String[] args) {
//		2. While문
//		문법
//		초기식;
//		While(조건식) {실행문장; 증가식;}
		int i = 0;	// 하나의 while문을 쓰기 위한 변수라 while문이 더 있을때 다른 변수를 선언해줘야한다.
					// for문의경우 지역변수로 선언하기때문에 더 편리
		
		while(i < 10) {
			System.out.print(i);
			i++;
		}
	}

}
