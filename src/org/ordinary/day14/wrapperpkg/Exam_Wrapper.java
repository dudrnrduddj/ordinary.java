package org.ordinary.day14.wrapperpkg;

public class Exam_Wrapper {

	public static void main(String[] args) {
		int num = 10;
		num = 1023; // num은 기본값으로 0이 들어감
		if(num != 0) {}
		// null값을 넣고싶으면?
		Integer numInstance = null; // 객체로 생성해서 null값을 넣을 수 있게 함.
		if(numInstance != null) {}
		numInstance = Integer.valueOf(57);
		numInstance = 1023;	// 오토-박싱(auto-boxing)
		
		// primitive 변수에 객체로 생성한 numInstance 값을 넣고 싶다면?
		num = numInstance.intValue(); 
		num = numInstance; // 오토-언박싱(auto-unboxing) // '그냥 넣는걸 허락할게~'의 의미
		
		// --Wrapper Class--
		// int -> Integer
		// double -> Double
		// char -> Character
		// ...
		
		// Wrapper Class의 쓰임새 예시들..
		String openDay = "20240507";
		int openDate = Integer.parseInt(openDay);
		
		System.out.println(Character.toLowerCase('A'));
		System.out.println(Character.toUpperCase('a'));
		char c1 = '5', c2 = 'F';
		if(Character.isDigit(c1)) {
			System.out.println(c1 + "은 숫자");
		}
		if(Character.isAlphabetic(c2)) {
			System.out.println(c2 + "는 영문자");
		}
		// ================= 문자열로 바꾸기 ===================
		// 1. String.ValueOf(1)
		// 2. +"" 붙이기
		// 3. .toString()
		System.out.println(String.valueOf(1) instanceof String);
		System.out.println(1+"" instanceof String);
		System.out.println(Integer.valueOf(1).toString() instanceof String);
		
		
		
		
	}

}
