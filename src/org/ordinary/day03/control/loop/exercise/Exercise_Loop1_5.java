package org.ordinary.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_Loop1_5 {

	public static void main(String[] args) {
//		사용자로부터 입력 받은 숫자의 단을 출력하세요.
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int dan = scanner.nextInt();
		
		if(dan > 0) {
			for(int i = 1; i <= 9; i++) {
				int result = dan * i;
				System.out.println(dan + " * " + i + " = " + result);
			}
		}else {
			System.out.println("1이상의 숫자를 입력해주세요");
		}
		
	}

}
