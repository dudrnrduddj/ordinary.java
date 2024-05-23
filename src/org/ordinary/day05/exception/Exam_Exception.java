package org.ordinary.day05.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam_Exception {
	
	public static void main(String[] args) {
		// 정수를 0으로 나누는 경우에 "0으로 나눌 수 없습니다!"를 출력하고
		// 다시 입력 받는 프로그램을 작성하여라.
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			int result = 0;				
			int num1 = 0, num2 = 0; // 타입만 한번써야 하고 초기화는 각각 시켜줘야함!!
			
			
			try {
				System.out.println("첫번째 정수 입력 : ");
				num1 = scanner.nextInt();
				System.out.println("두번째 정수 입력 : ");
				num2 = scanner.nextInt();
				result = num1 / num2;
				
			} catch (ArithmeticException e) {		// lang 패키지에 있는 애들은 import 필요없음
				System.out.println("0으로 나눌 수 없습니다.");
				continue;
			} catch (InputMismatchException e) {	// util 패키지에 있는 애들은 import 시켜줘야함.
				System.out.println("정수를 입력해주세요");
				scanner.next();	// 굉장히 중요한 catch구문!!!!	-> 정수 입력하는 순간에 문자를 입력시에 catch구문으로 오게되는데
								// 이때 입력한 문자는 처리되지않은채로 남아있게 되고 continue로 반복이 진행되면 다시 try구문의 scanner.nextInt로 
				continue;		//들어가게 되고 또 다시 에러가 발생하여 위와 같은 동작이 무한반복 되기 때문에
								// 반드시 catch구문 안에서 문자열을 받아줄 수 있는 scanner.next()로 문자열을 할당시켜주고
								// 새로 반복이 진행될때 try구문의 정수를 scanner.nextInt()로 정상적으로 받을 수 있게 된다!
				
			}
			
			System.out.printf("%d을 %d로 나누면 몫은 %d입니다.\n", num1, num2, result);
			break;
		}
		
	}
}
