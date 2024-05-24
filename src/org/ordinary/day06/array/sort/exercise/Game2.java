package org.ordinary.day06.array.sort.exercise;

import java.util.Scanner;

public class Game2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1 ~ 100 사이의 정수를 입력하세요 : ");
		int num = scanner.nextInt();
	
		int count = 0;
		
		if(num > 100 || num < 1) {
			System.out.println("1부터 100사이의 정수를 입력하세요!");
		}else {
			for(int i = 2; i < num; i++) {
				if(num % i == 0) {
					count++;
				}
			}
			
			if(count != 0) {
				System.out.println(num + "은(는) 소수가 아닙니다.");
			}else {
				System.out.println(num + "은(는) 소수입니다.");			
			}
		}

	}

}
