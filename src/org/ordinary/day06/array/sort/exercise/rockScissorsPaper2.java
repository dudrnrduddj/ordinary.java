package org.ordinary.day06.array.sort.exercise;

import java.util.Scanner;

public class rockScissorsPaper2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		String[] arrStr = {"가위", "바위", "보"};
		
		System.out.println("가위 바위 보 게임을 시작합니다.");
		
		while(true) {
			System.out.print("가위 바위 보 중 한 개를 입력하세요 : ");
			String user = scanner.next();
			int randomNum = (int)(Math.random()*3);
			String computer = arrStr[randomNum];
			System.out.printf("당신은 %s를 냈습니다.\n", user);
			System.out.printf("컴퓨터는 %s를 냈습니다.\n", computer);

			boolean win = false;
		
			if(user.equals(computer)) {
				System.out.println("비겼습니다. 다시 시작합니다.\n");
				continue;
			}
			
			
			if(user.equals("가위")) {
				if(computer.equals("보")) {
					win = true;
				}
			}else if(user.equals("바위")) {
				if(computer.equals("가위")) {
					win = true;
				}
			}else if(user.equals("보")) {
				if(computer.equals("바위")) {
					win = true;
				}
			}
			
			if(win) {
				System.out.println("당신이 이겼습니다!");
				break;
			}else {
				System.out.println("당신이 졌습니다!");
				break;
			}
		}
	}
}

