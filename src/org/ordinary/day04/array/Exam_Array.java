package org.ordinary.day04.array;

public class Exam_Array {

	public static void main(String[] args) {
		int num; // 변수의 선언
		num = 1; // 변수의 초기화
		
		int[] nums;// 배열의 선언
		nums = new int[5];// 배열의 생성(할당) -> 동적메모리
		nums[0] = 1;// 배열의 초기화
		nums[2] = 3;
//		초기화하지 않으면 초기값으로 0이 저장되어있음
		
		// array.length -> 배열의 길이를 알 수 있음.
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		

	}
}