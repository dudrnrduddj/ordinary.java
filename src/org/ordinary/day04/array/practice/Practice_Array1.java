package org.ordinary.day04.array.practice;
//길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여 
//순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요. 

public class Practice_Array1 {

	public static void main(String[] args) {
		
		int[] nums = new int[10];
	
		for(int i = 0; i < nums.length; i++) {
			nums[i] = i + 1;
			System.out.print(nums[i]+" ");
		}
	
	}

}