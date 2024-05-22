package org.ordinary.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_Loop1_6 {

	public static void main(String[] args) {
		// 사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
		// 단, 9를 초과하는 숫자가 들어오면 “9 이하의 숫자만 입력해주세요”를 출력하세요.
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int dan = scanner.nextInt();
		
		if(dan > 0 && dan <= 9) {
			for(int j = dan; j <= 9; j++) {
				for(int i = 1; i <= 9; i++) {
					int result = j * i;
					System.out.println(j + " * " + i + " = " + result);	
				}
			}
		}else if(dan < 1) {
			System.out.println("1이상의 숫자를 입력해주세요");
		}else{
			System.out.println("9이하의 숫자를 입력해주세요");
		}
	}
}
