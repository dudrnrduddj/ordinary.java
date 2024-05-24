package org.ordinary.day06.array.sort;

public class Exam_ArraySort {

	public static void main(String[] args) {
		// 정렬
		// 크기가 5인 배열이 있고 
		// 24 5 7 10 23 -> 5 7 10 23 24
		// 오름차순정렬시키고 싶음
		// -> 어떻게 하면좋을까 하는 사고 -> 알고리즘의 시작
		// 정렬 알고리즘!
		
		// 알고리즘이란 문제해결을 하기 위한 절차나 방법.
		// 프로그래밍 언어로 어떻게 해결할 것인가를 고민해 가는 것
		
		// - 정렬 알고리즘 종류
		// 1. 삽입정렬
		// 2. 선택정렬
		// 3. 버블정렬
		// 4. 퀵정렬
		// 5. 병합정렬
		
		// 24 5 7 10 23 -> 5 7 10 23 24
		// -> 1. 자리바꿈은 어떻게 해결할 것인가?		-> 임시저장할 변수 하나를 선언하자
		// -> 2. 어떤 조건이 만족하면 바꿀 것인가?
		
		int num1 = 5;
		int num2 = 7;
		
		System.out.printf("num1 : %d num2 : %d\n", num1, num2);
		// num1에는 7이 들어가고 num2에는 5가 들어가도록 해야함.
//		num1 = num2;
//		num2 = num1;
//		System.out.printf("num1 : %d num2 : %d\n", num1, num2);
		// 이렇게 되면 둘다 7이됨. 따라서 num1이 초기화되기 전에 num1의 기존의 값을 다른데 저장해야함
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.printf("num1 : %d num2 : %d\n", num1, num2);
		// 이렇게 되면 값의 자리바꿈이 해결됨!
		
		int[] nums = {2, 1, 3};
		// 3 2 1이 되도록 바꿔보세요

		// 3 2 1로 바꾸기 -> 원리
//		temp = nums[0];
//		nums[0] = nums[2];
//		nums[2] = temp;
//		temp = nums[2];
//		nums[2] = nums[1];
//		nums[1] = temp;
		
		int temp1 = 0;
//		for(int i = 0; i < 3; i++) {    
//			for(int j = 0; j < 3; j++) {   
//				if(nums[i] < nums[j] && i < j) {
//					temp1 = nums[i];
//					nums[i] = nums[j];
//					nums[j] = temp1;
//				}
//			}
//		}
		
		// 또는
		
		for(int i = 0; i < nums.length-1; i++) {    
			for(int j = 0; j < nums.length-1; j++) {   
				if(nums[j] < nums[j+1]) {
					temp1 = nums[j+1];
					nums[j+1] = nums[j];
					nums[j] = temp1;
				}
			}
		}
//***** // 내림차순 정렬하고 싶다면 조건문의 부호를 반대로 바꿔주면 됨.
		
		
		
		int[] opens = {24, 5, 7};
		// 5 7 24로 바꿔보세요
		temp = opens[0];
		opens[0] = opens[1];
		opens[1] = temp;
		temp = opens[1];
		opens[1] = opens[2];
		opens[2] = temp;
		
		for(int o : opens) {
			System.out.print(o+" ");
		}
		
		System.out.println();
			
		for(int n : nums) {
			System.out.print(n+" ");
		}
	}

}
