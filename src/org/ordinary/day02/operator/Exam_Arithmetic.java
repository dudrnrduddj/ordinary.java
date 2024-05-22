package org.ordinary.day02.operator;

import java.util.Scanner;

public class Exam_Arithmetic {
	public static void main(String[] args) {
//		산술 연산
//		+, -, *, /, %
//		% : 나머지를 구해주는 연산자
//		문제1
//		초 단위의 정수를 입력받고, 몇 시간, 몇 분, 몇 초인지 출력하는 프로그램을 작성하여라.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("초 단위의 정수를 입력해주세요 : ");
		int time = scanner.nextInt();
		int hour;
		int min;
		int sec;
		
		hour = time / 3600;
		min = (time % 3600) / 60;
		sec = (time % 3600) % 60;
		System.out.println(time + "초는 " + hour + "시간, " + min + "분, " + sec + "초이다."  );
	}
}