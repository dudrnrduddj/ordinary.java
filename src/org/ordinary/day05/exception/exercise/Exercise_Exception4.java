package org.ordinary.day05.exception.exercise;

public class Exercise_Exception4 {

	public static void main(String[] args) {
		// 문제4
		// 문자열을 정수로 변환할 때
		// 발생하는 NumberFormatException을
		// 처리하는 프로그램을 작성하라.
		
		
		String[] strArr = {"507", "10.23"};
		
		int result1 = Integer.parseInt(strArr[0]);
		System.out.println(result1);
		try {
			int result2 = Integer.parseInt(strArr[1]);
			System.out.println(result2);
		}catch (NumberFormatException e) {
			System.out.println("해당 문자열은 정수로 변환할 수 없습니다.");
		}
		
		
	}

}
