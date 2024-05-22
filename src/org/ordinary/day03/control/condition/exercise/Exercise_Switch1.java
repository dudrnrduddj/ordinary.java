package org.ordinary.day03.control.condition.exercise;

import java.util.Scanner;

public class Exercise_Switch1 {

	public static void main(String[] args) {
//		커피메뉴를 입력받고 가격을 알려주는 프로그램을 작성하시오
//		주문하시겠어요? 가격을 알려드립니다.
//		(에스프레소, 카푸치노, 카페라떼, 아메리카노)
//		메뉴를 입력해주세요 : 에스프레소
//		2500원입니다.(가격은 임의로 정하기)
//		메뉴를 입력해주세요 : 자바칩프라프치노
//		없는 메뉴입니다.
		
		System.out.println("주문하시겠어요? 가격을 알려드립니다.");
		System.out.println("(에스프레소, 카푸치노, 카페라떼, 아메리카노)");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("메뉴를 입력해주세요 : ");
		String menu = scanner.next();
		int price;
		
//		switch문으론 문자열 비교가 == 연산자와 다른 이유
//		-> switch문은 컴파일 시 코드형태를 보면 case에서 equals를 사용하여 문자열을 비교함을 볼 수 있다. 따라서 주소값과 상관없이 문자열의 값만을 비교할 수 있던 것이다.
		switch (menu) {
		case "에스프레소":
			price = 2500;
			break;
		case "카푸치노":
			price = 4000;
			break;
		case "카페라떼":
			price = 3500;
			break;
		case "아메리카노":
			price = 3000;
			break;
		default:
			price = 0;
			break;
		}
		
//		if(menu.equals("에스프레소") ||menu.equals("카푸치노") || menu.equals("카페라떼") || menu.equals("아메리카노")) {
//			System.out.printf("%s는 %d원입니다.",menu,price);			
//		}else {
//			System.out.println("없는 메뉴입니다.");
//		}
		
//		↓↓↓↓↓↓
//		↓↓↓↓↓↓ 더 간단한 코드
		
		if(price != 0) {
			System.out.printf("%s는 %d원입니다.",menu,price);			
		}else {
			System.out.println("없는 메뉴입니다.");
		}
		
	}

}
