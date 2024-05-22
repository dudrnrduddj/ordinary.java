package org.ordinary.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_While2 {

	public static void main(String[] args) {
//		While문을 이용하여 -1 입력될때까지
//		정수를 입력받고
//		-1이 입력되면 입력한 수의 합을 출력하시오.

		Scanner scanner = new Scanner(System.in);

		///////////// 1
		int sum = 0;
		int input = 0;

		while (input != -1) {
			System.out.print("정수 하나 입력 : ");
			input = scanner.nextInt();
			sum = sum + input;
			if (input == -1) {
				sum = sum + 1;
				break;
			}
		}

		System.out.println("-1을 제외한 정수의 합 : " + sum);

		///////////// 2
		int sum1 = 0;
		int input1 = 0;
		Scanner scanner1 = new Scanner(System.in);

		while (input1 != -1) {
			System.out.print("정수 하나 입력 : ");
			input1 = scanner1.nextInt();

			if (input1 == -1) {
				break;
			} else {
				sum1 = sum1 + input1;
			}
		}

		System.out.println("-1을 제외한 정수의 합 : " + sum1);

	}
}
