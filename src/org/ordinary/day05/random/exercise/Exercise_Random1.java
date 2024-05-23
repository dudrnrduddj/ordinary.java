package org.ordinary.day05.random.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise_Random1 {
	public static void main(String[] args) {
//		동전 앞뒤 맞추기!
//		=== 동전 앞 뒤 맞추기 ===
//		숫자를 입력해주세요(1. 앞면 / 2. 뒷면) : 1
//		맞췄습니다.
		Scanner scanner = new Scanner(System.in);

//		Random random = new Random();
		
		while(true) {
			System.out.print("숫자를 입력해주세요(1.앞면/ 2.뒷면) : ");
			int num = scanner.nextInt();
			
			if(num == 1 || num == 2) {

				int coin = (int)(Math.random()*2 + 1);
//				int coin = random.nextInt(2) + 1;
				
				if(num == coin) {
					System.out.println("맞췄습니다.");
					break;
				}else {
					System.out.println("틀렸습니다.");
					continue;
				}
			}else {
				System.out.println("1 또는 2를 눌러주세요");
			}
			
		}
		
		
		
		
	}
}
