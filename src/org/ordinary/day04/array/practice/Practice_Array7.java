package org.ordinary.day04.array.practice;

import java.util.Scanner;

// 사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고 배열의 크기만큼 
// 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
// 그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요. 


public class Practice_Array7 {
	public static void main(String[] args) {
		int sum = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = scanner.nextInt();
		
		int[] nums = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			int value = scanner.nextInt();
			nums[i] = value;
			sum = nums[i] + sum;
		}
		for(int i = 0; i < num; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		System.out.print("총합 : " + sum);
		
		
	}

}
