package org.ordinary.day02.control.condition.exercise;

import java.util.Scanner;

public class Exercise_If2 {

	public static void main(String[] args) {
//		문제2
//		커피메뉴를 입력받고 가격을 알려주는 프로그램을 작성하시오
//		주문하시겠어요? 가격을 알려드립니다.
//		(에스프레소, 카푸치노, 카페라떼, 아메리카노)
//		메뉴를 입력해주세요 : 에스프레소
//		2500원입니다.(가격은 임의로 정하기)
//		메뉴를 입력해주세요 : 자바칩프라프치노
//		없는 메뉴입니다.
		
		
//		****equals()를 사용해서 비교해야함!****
		
//		문자열리터럴 생성 시 변수에 초기화하지 않더라도 메모리공간을 할당 받는지? => 메모리공간에 할당이 됨 단, 변수의 이름은 지정되지 않은것!
		
//		euqals를 써야하는 이유가 scanner에서 생성되는 값은 heap메모리에
//		문자열리터럴은 constant pool에 저장되기 때문인지
		
		// => 맞는 말임, heap메모리에서 생성되는지는 문서를 봐야 알 수 있겠지만, 어찌됐든 리터럴은 constant pool에 저장되고
		// scanner에 의해 입력된 문자열은 새로운 변수에 객체로써 할당되기 때문에 동등연산자를 사용할 수 없음. (동등연산자는 기본값을 제외하고 주소값을 비교)
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("주문하시겠어요? 가격을 알려드립니다.");
		System.out.print("메뉴를 입력해주세요 : ");
		String name = scanner.next();
		
		if(name.equals("에스프레소")) {
			System.out.println("에스프레소는 2500원입니다.");
		}else if(name.equals("카푸치노")) {
			System.out.println("카푸치노는 4000원입니다.");
		}else if(name.equals("카페라떼")) {
			System.out.println("카페라떼는 3500원입니다.");
		}else if(name.equals("아메리카노")) {
			System.out.println("아메리카노는 3000원입니다.");
		}else {
			System.out.println("없는 메뉴입니다.");
		}
		
		// string.contains("") -> 해당 문자열에 ""가 포함되면 true를 return한다.
		
	
	}

}
