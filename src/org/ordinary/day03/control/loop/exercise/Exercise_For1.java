package org.ordinary.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_For1 {

	public static void main(String[] args) {
//		정수 하나를 입력받아서 그 수가 1 ~9 사이의 수일 때만
//		그 수의 구구단을 출력하세요.
//		단, 조건이 맞지 않으면 "1 ~ 9 사이의 양수를 입력하여야 합니다"를 출력하세요.

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int dan = sc.nextInt();

		if (dan >= 1 && dan <= 9) {
			for (int i = 1; i < 10; i++) {
				int result = dan * i; // for문 안에서 쓰이는 지역변수
				System.out.println(dan + " * " + i + " = " + result);
			}
		} else {
			System.out.println("1 ~ 9 사이의 양수를 입력하여야 합니다");
		}
	}
}
