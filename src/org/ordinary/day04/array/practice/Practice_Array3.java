package org.ordinary.day04.array.practice;
//사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고 
//1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요. 

import java.util.Scanner;

public class Practice_Array3 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.print("배열의 크기를 정해주세요 : ");
		int numsLength = scanner.nextInt();
		
		int[] nums = new int[numsLength];
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = i + 1;
			System.out.print(nums[i]+" ");
		}
	}

}
