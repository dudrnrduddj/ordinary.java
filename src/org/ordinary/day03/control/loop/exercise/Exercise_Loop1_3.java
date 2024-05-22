package org.ordinary.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_Loop1_3 {

	public static void main(String[] args) {
		// 1부터 사용자에게 입력 받은 수까지의 정수들의 합을 for문을 이용하여 출력하세요.    
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자 하나를 입력하세요 : ");
		int num = scanner.nextInt();
		
		System.out.print(num + "까지의 계산식 : ");
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			if(i == num) System.out.print(i+"=");
			else System.out.print(i+"+");
			sum += i;
		}
		System.out.println(sum);
		System.out.printf("%d까지의 정수의 합 : %d\n", num, sum);
	}

}
