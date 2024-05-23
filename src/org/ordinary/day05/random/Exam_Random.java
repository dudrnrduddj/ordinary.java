package org.ordinary.day05.random;

import java.util.Random;

public class Exam_Random {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		for(int i = 0; i < 30; i++) {
			int num = rand.nextInt(10); //rand.nextInt(10) => 0~9의 범위
			System.out.print(num);
		}
		
		// 25 부터 35 사이의 랜덤한 수를 출력하시오
		// rand.nextInt(11) + 25 // 25~35 출력
		
		// 1 또는 2 랜덤한 수를 출력하도록 하시오
		// rand.nextInt(2) + 1 // 1, 2 출력
		
		// 1 ~ 10 사이의 랜덤한 수를 구하시오
		// rand.nextInt(10) : 0 ~ 9 사이의 랜덤한 수
		for(int i = 0; i < 20; i++) {
			int num = rand.nextInt(10) + 1;
			System.out.print(num+" ");
		}
		System.out.println();
		
		for(int i = 0; i < 5; i++) {
//			0 ~ 9사이의 값
			int randNum = (int)(Math.random()*10); // Math - 내장클래스로 따로 import할 필요 없음.
//			1 ~ 10 사이의 값을 원하면 위 식에 + 1을 해주면 됨.
			System.out.println(randNum);			
		}
		
		for(int i = 0; i < 10; i++) {
			int r = (int)(Math.random() * 11 + 25);
			System.out.print(r + " ");
			}
	}

}
