package org.ordinary.day06.array.sort.exercise;

import java.util.Scanner;

public class MotelProgram {

	public static void main(String[] args) {

		System.out.println("모텔 관리 프로그램 v1.0");
		
		

		Scanner scanner = new Scanner(System.in);

		String[] menuArr = {"입실", "퇴실", "방보기", "종료"};
		
		
		for(int i = 0; i < menuArr.length; i++) {
			System.out.print(i+1 + "."+ menuArr[i]+"\t");
		}
		System.out.println();
		System.out.print("선택 > ");
		int menuNum = scanner.nextInt();
		
		
		if(menuNum-1 == 0) {
			System.out.println("-"+menuArr[0]+"-");
		}else if(menuNum-1 == 1) {
			System.out.println("-"+menuArr[1]+"-");
		}else if(menuNum-1 == 2) {
			System.out.println("-"+menuArr[2]+"-");
		}else if(menuNum-1 == 3) {
			System.out.println("-"+menuArr[3]+"-");
		}else {
			System.out.println("다시 입력해주세요");
//			continue;
		}
		
		
		boolean empty = true;
		int[] roomArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		//3. 방보기
		
		for(int i = 0; i < roomArr.length-1; i++) {
			if(roomArr[i] == 0) {				// 비어있으면 
				empty = false;
			}else {
				empty = true;
			}
			
			if(empty) {
				System.out.println(roomArr[i] + "번방이 현재 비어있습니다");
			}else{
				if(i == 0) {
					System.out.println("1번방이 현재 비어있지않습니다.");										
				}else {
					System.out.println(roomArr[i-1]+1 + "번방이 현재 비어있지않습니다.");					
				}
			}			
		}
	}

}
