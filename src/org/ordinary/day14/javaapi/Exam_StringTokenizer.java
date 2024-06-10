package org.ordinary.day14.javaapi;

import java.util.StringTokenizer;

public class Exam_StringTokenizer {

	public static void main(String[] args) {
		String query = "name=james&addr=seoul&age=22";
		String[] words = query.split("[&=]"); // 정규 표현식'[]' 대괄 안에 문자의 집합을 나타냄.
											  // 예를들어 [aeiou]는 소문자 모음에 일치하는 문자임. 
		 for(String word : words) {
			 System.out.println(word + " ");
		 }
		 System.out.println();
		 
		 StringTokenizer st = new StringTokenizer(query, "&=");
		 while(st.hasMoreElements()) {
			 System.out.println(st.nextToken()); // newxtToken()는 StringTokenizer 객체에서 다음 토큰을 반환함.
			 									 // 보통 hasMoreTokens() 메소드와 함께 사용함.
			 									 // 만약 더이상 토큰이 없다면 NoSuchElementException이 발생할 수 있음.
		 }

	}

}
