package org.ordinary.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_Loop2_4 {

	public static void main(String[] args) {
		// 2부터 사용자가 입력한 수까지의 소수를 모두 출력하고 소수의 개수를 출력하세요.
		// 단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = scanner.nextInt();

		int count = 0;
		if(num < 2) {
			System.out.println("잘못 입력하셨습니다.");
		}else {
			System.out.print("2부터 " + num + "까지의 소수 : ");
			
			for(int i = 2; i < num; i++) {
				for(int j = 2; j <= i; j++) {
					if(i % j == 0) {
						count++;
					}
				}
				if(count == 1) {
					System.out.print(" " + i);
				}
				count = 0;
			}	
		}
	}
}
