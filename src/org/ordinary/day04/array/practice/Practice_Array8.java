package org.ordinary.day04.array.practice;

import java.util.Scanner;

//3이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고
//, 중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요. 
//단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고 다시 정수를 받도록 하세요.

public class Practice_Array8 {
	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		int[] arr;

		while(num < 3|| num % 2 == 0) {
			System.out.print("3이상의 홀수 자연수를 입력하세요 : ");
			num = scanner.nextInt();
			arr = new int[num];
			
			if(num < 3 || num % 2 == 0) {
				System.out.println("다시 입력하세요");
			}else {
				int j = 0;
				for(int i = 0; i < num; i++) {
					if(i < (num+1)/2) {
						System.out.print(j+1+", ");
						j++;
					}else {
						j--;
						if(i == num-1) {
							System.out.print(j);
						}else {						
							System.out.print(j + ", ");
						}
					}
				}
				break;
			}
		}
		
		
	}

}
