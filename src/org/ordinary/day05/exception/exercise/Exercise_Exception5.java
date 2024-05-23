package org.ordinary.day05.exception.exercise;

public class Exercise_Exception5 {

	public static void main(String[] args) {
		// 문제5
		// NullPointerException
		String word = "키위";	// 리터럴이기 때문에 동등연산자로 비교가 가능한 모습!
//		String word = new String("키위"); -> word.equals("키위")로 비교해야 함!!
		
		try {
			if(word == "키위") {		// null인데 비교하려하니깐 오류 발생
				System.out.println("맞습니다");
			}else {
				System.out.println("다릅니다");
			}
		}catch (NullPointerException e) {
			System.out.println("null값을 참조하였습니다.");
		}

		
//		checked vs unchecked exception !!!
//		exception의 부모, 자식 관계
//		-> 알아놓기!!
		
//		throwable, throw
		
		
		
	}

}
