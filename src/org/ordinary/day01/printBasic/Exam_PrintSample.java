package org.ordinary.day01.printBasic;

import java.util.Scanner;

public class Exam_PrintSample {
	public static void main(String[] args) {
		System.out.println("지금까지는 쓰던 출력 명령어 - println 개행 O");
		System.out.print("지금까지와는 다른 출력 명령어 - print 개행 X");
		System.out.print("지금까지와는 다른 출력 명령어 - print 개행 X - 수동개행 \n");
		System.out.print("지금까지와는 다른 출력 명령어 - \nprint 개행 X");
		// 수동개행 -> 문자열 안에 \n		
		
		// 이런식으로 개행없는 print를 이용해서 자연스러운 문장 만들 수 있음!
		Scanner sc = new Scanner(System.in);
		System.out.print("하나의 수 입력 : ");
		int num = sc.nextInt();
		
//		printf() 메소드
		System.out.printf("정수 출력 : %d", 57);
		// 넣고자 하는 값을 ','뒤에 입력 그리고 앞에서 %를 이용해서 값을 받아와서 바로 출력시킬 수 있음!
	}
}
