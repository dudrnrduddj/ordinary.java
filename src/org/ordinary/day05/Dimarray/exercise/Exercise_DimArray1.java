package org.ordinary.day05.Dimarray.exercise;

public class Exercise_DimArray1 {
	public static void main(String[] args) {

		int[][] array = new int[5][5];
		// 핵심은 반복문의 초기식, 조건식, 증감식의 변화를 주어 배열의 순서를 변형 시키는 것임!!
		// 단순 식의 계산을 추가하는 것은 문제에서 원하는 답이 아님!
		
////////// 내 답변 -> 아쉬움.
//		int k = 1;
//		for(int i = 0; i < array.length; i++, k++) {
//			for(int j = 0; j < array[i].length; j++) {
//				array[i][j] = 5 * k - j;
//			}
//		}
		
////////// 정답!
		int k = 1;
		for(int i = 0; i <array.length; i++) {
			for(int j = array.length-1; j >= 0;j--, k++) {
				array[i][j] = k;
			}
		}
		
		
		for(int[] a : array) {
			for(int b : a) {
				System.out.print(b+"\t");
			}
			System.out.println();
		}
		
		
	}

}
