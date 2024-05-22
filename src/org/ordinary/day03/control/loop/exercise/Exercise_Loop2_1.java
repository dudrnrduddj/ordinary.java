package org.ordinary.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_Loop2_1 {

	public static void main(String[] args) {
		// 1부터 사용자에게 입력 받은 수까지 중에서
		// 1) 2와 3의 배수를 모두 출력하고
		// 2) 2와 3의 공배수의 개수를 출력하세요.
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = scanner.nextInt();
		
		///2의배수
		System.out.print("2의 배수 : ");
		for(int i = 1; i <= num/2; i++) {
			if(i != num/2) {
				System.out.print(i * 2 + ", ");
			}else {
				System.out.println(i * 2);
			}
		}
		///3의배수
		System.out.print("3의 배수 : ");
		for(int i = 1; i <= num/3; i++) {
			if(i != num/3) {
				System.out.print(i * 3 + ", ");
			}else {
				System.out.println(i * 3);
			}
		}
		////2와3의 공배수 개수
		int count = 0;
		for(int i = 1; i <= num/2; i++) {
			for(int j = 1; j <= num/3; j++) {
				if(2 * i == 3 * j) {
					count++;
				}
			}
		}
		System.out.print("2와 3의 공배수의 개수 : " + count + "개");		
	}
}
