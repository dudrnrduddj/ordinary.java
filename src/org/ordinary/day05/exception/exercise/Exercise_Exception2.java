package org.ordinary.day05.exception.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_Exception2 {

	public static void main(String[] args) {
		//문제2
		// 3개의 정수를 입력받아 합을 구하는 프로그램을 작성하여라
		// 사용자가 정수가 아닌 문자를 입력할 때 발생하는
		// InputMismatchException 예외를 처리하여 다시 입력받도록
		// 정수 3개를 입력하세요.
		// 11 2 3
		// 합은 16
		
		Scanner scanner = new Scanner(System.in);
		
		int result = 0;
		
		
		while(true) {
			
			System.out.print("정수 3개를 입력하세요. : ");
			
				for(int i = 0; i < 3; i++) {
					try {
						result += scanner.nextInt();
					}catch(InputMismatchException e){
						scanner.next();						// 써줘야 nextINt에 들어가지 못한 문자가 next()로 들어가 처리가 된다.
						System.out.println("정수를 입력해주세요.");
						i--;		/// 중요!!!! -> 뒤로 감으로써 문자 입력시에 catch로 받고 i 카운트를 한번더 줌으로써 정수 입력기회를 준다.
						continue;	// 따라서 총 3개의 정수가 입력될때까지 catch시켜준다는 것이다.
					}
				}
			System.out.println("합은 " + result);
			break;
		}
	}

}
