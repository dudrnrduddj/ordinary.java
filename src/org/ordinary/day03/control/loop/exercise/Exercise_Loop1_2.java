package org.ordinary.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_Loop1_2 {

	public static void main(String[] args) {
		//사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
		//단, 입력한 수는 1보다 크거나 같아야 합니다.

		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자 하나를 입력해주세요 : ");
		int num = scanner.nextInt();
		
		if(num >= 1) {
			System.out.print(num + "부터 1까지의 숫자 나열 : ");
			
			for(int i = num; i >= 1; i--) {
				System.out.print(i);
			}
		}else {
			System.out.println("1보다 큰 숫자를 입력해 주세요");
		}
	}

}
