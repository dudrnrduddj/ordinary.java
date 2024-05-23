package org.ordinary.day04.array.practice;

import java.util.Scanner;

//주민등록번호 성별자리 이후부터 *로 가리고 출력하세요.
//단, 원본 배열 값은 변경 없이 배열 복사본으로 변경하세요.

public class Practice_Array10 {
	public static void main(String[] args) {

//     *********내 코드*********
//		강의내용과 일치!
		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("주민등록번호(-포함) : ");
//		String id = scanner.next();
//		char[] idArr = new char[id.length()];
//		
//		for(int i = 0; i < idArr.length; i++) {
//			idArr[i] = id.charAt(i);
//		}
//		
//		char[] idArrCopy = new char[idArr.length];
//		
//		for(int i = 0; i < idArrCopy.length; i++) {
//			if(i < 8) {
//				idArrCopy[i] = idArr[i];
//				System.out.print(idArrCopy[i]);
//			}else {
//				idArrCopy[i] = '*';
//				System.out.print(idArrCopy[i]);
//			}
//		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
		String idNum = sc.next();
		
		char [] idNums = new char[idNum.length()];
		
		for(int i = 0; i < idNums.length; i++) {
			idNums[i] = idNum.charAt(i);
		}
		
		char[] copy = new char[idNums.length];	// 새로운 배열을 생성시키는게 핵심!!
//		char[] copy = idNums;	// 이렇게 할 경우 참조값을 복사하므로 두 배열이 동일한 배열을 가리키게 되어
//								   데이터의 수정 시 원하지않는 값의 변화가 일어날 수 있음.
		
		for(int i = 0; i < copy.length; i++) {
			if(i < 8) {
				copy[i] = idNums[i];				
			}else {
				copy[i] = '*';
			}
		}
		
		
		for(char c : copy) {		// for-each문 활용
			System.out.print(c);
		}
		
		
	}
}
