package org.ordinary.day05.exception.exercise;

import java.util.Scanner;

public class Exercise_Exception1 {
	public static void main(String[] args) {
		// 문제1
		// 정수를 0으로 나누는 경우에 "0으로 나눌 수 없습니다!"를
		// 출력하고 다시 입력 받는 프로그램을 작성하여라.
		
		Scanner scanner = new Scanner(System.in);
		int randomNum = (int)(Math.random()*100 + 1);
		int result;
		
		while(true) {
			System.out.print("정수를 입력하세요 : ");
			
			
			try {				
				int num = scanner.nextInt();
				result = randomNum / num;
			}catch (ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다!");
				continue;
			}
			System.out.printf("몫은 %d 입니다.", result);
			break;
			
		}
		
	}

}
