package org.ordinary.day04.array.practice;

import java.util.Scanner;

//문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 
//들어가 있는지 개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
public class Practice_Array5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = scanner.next();
		int count = 0;
		
		
		System.out.print("찾을 문자 : ");
		char findChar = scanner.next().charAt(0);
		
		System.out.printf("%s에 %s가 존재하는 위치(인덱스) : ", str, findChar);
		
		char[] charArr = new char[str.length()];
		
		for(int i = 0; i < str.length(); i++) {
			charArr[i] = str.charAt(i);
			if(findChar == charArr[i]) {
				count++;
				System.out.print(i+ " ");
			}
		}
		System.out.println();
		System.out.println(findChar + " 개수 : " + count);
		
		
		
	}

}
