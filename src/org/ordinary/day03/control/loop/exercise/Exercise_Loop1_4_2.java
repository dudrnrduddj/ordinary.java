package org.ordinary.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_Loop1_4_2 {

	public static void main(String[] args) {
		// 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
		// 만일 1 미만의 숫자가 입력됐다면 "1 이상의 숫자를 입력해주세요"를 출력하세요.

		Scanner scanner = new Scanner(System.in);

		
		System.out.print("숫자를 입력해주세요 : ");
		int num1 = scanner.nextInt();

		if (num1 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
		} else {
			System.out.print("숫자를 입력해주세요 : ");
			int num2 = scanner.nextInt();
			if (num2 < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요");
			} else {

				int max;
				int min;

				if (num1 >= num2) {
					max = num1;
					min = num2;
				} else {
					max = num2;
					min = num1;
				}
					if (num1 < 1 || num2 < 1) {
						System.out.println("1 이상의 숫자를 입력해주세요");
					} else {
						System.out.printf("%d와 %d 사이의 숫자입니다. : ", min, max);
						for (int i = min; i <= max; i++) {
							System.out.print(i + " ");
						}
					}
				

			}
		}

	}
}
