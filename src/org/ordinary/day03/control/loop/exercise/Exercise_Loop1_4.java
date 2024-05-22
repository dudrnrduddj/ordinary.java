package org.ordinary.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_Loop1_4 {

	public static void main(String[] args) {
		// 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
		// 만일 1 미만의 숫자가 입력됐다면 "1 이상의 숫자를 입력해주세요"를 출력하세요.
		
	
		Scanner scanner = new Scanner(System.in);

		System.out.print("첫번째 숫자를 입력하세요 : ");
		int num1 = scanner.nextInt();

		if (num1 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
		} else {
			System.out.print("두번째 숫자를 입력하세요 : ");
			int num2 = scanner.nextInt();

			if (num2 < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요");
			} else {
//				입력된 두개의 값중 작은값은 초기식에 큰값은 조건식에 입력되도록 만들어보세요.
//				min, max 변수 활용
				
				if (num1 <= num2) {	// num1, num2의 대소관계 상관없이 결과가 나와야 함.
					for (int i = num1; i <= num2; i++) {
						System.out.print(i + " ");
					}
				} else {
					for (int i = num2; i <= num1; i++) {
						System.out.print(i + " ");
					}
				}
			}
		}

	}
}
