package org.ordinary.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_Loop2_3 {

	public static void main(String[] args) {
		// 위 문제와 모든 것이 동일하나, 입력한 수가 2보다 작은 경우
		// “잘못 입력하셨습니다.”를 출력하면서 다시 사용자가 값을 입력하도록 하세요.
		int num;
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.print("숫자를 입력하세요 : ");
			
			num = scanner.nextInt();
			
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
			
		}while(num < 2);
			
		
	}

}
