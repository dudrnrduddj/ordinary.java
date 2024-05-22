package org.ordinary.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_Loop2_2 {

	public static void main(String[] args) {
		// 사용자로부터 입력 받은 하나의 값이 소수인지 판별하는 프로그램을 구현하세요.
		// 단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = scanner.nextInt();

		int count = 0;
		if(num < 2) {
			System.out.println("잘못 입력하셨습니다.");
		}else {
			for(int i = 1; i < num; i++) {
				if(num % i == 0) {
					count++;
				}
			}	
		}
		if(count <= 1) {
			if(num >= 2) {
				System.out.println("소수입니다.");
			}
		}else {
			System.out.println("소수가 아닙니다.");
		}

	}

}
