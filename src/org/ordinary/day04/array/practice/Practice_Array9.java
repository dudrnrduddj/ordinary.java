package org.ordinary.day04.array.practice;

import java.util.Scanner;

//사용자가 입력한 값이 배열에 있는지 검색하여 
//있으면 “OOO 치킨 배달 가능“, 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요. 
//단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.

public class Practice_Array9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] menu = {"치킨1","치킨2","치킨3","치킨4"};

		int count = 0;
		String name;
		
		while(count < 1) {
			System.out.print("치킨 이름을 입력하세요 : ");
			name = scanner.next();
			
			for(int i = 0; i < menu.length; i++) {
				if(menu[i].equals(name)) {
					System.out.println(name + " 치킨 배달 가능");
					count++;
					break;
				}	
			}
			
			if(count < 1) {
				System.out.println(name+" 치킨은 없는 메뉴입니다.");
			}
		}
	}
}
