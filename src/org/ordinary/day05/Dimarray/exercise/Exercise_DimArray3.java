package org.ordinary.day05.Dimarray.exercise;


public class Exercise_DimArray3 {
	public static void main(String[] args) {
		
		int[][] array = new int[5][5];
		
		// 둘다 틀림!
//		int k = 1;
//		int h;
//		for(int i = array.length-1; i >= 0; i--, k++) {
//			h=k;
//			for(int j = 0; j < array[i].length; j++) {
//				array[i][j] = h;
//				h+=5;
//			}
//		}
		
//		for(int i = 0; i < array.length; i++) {
//			int k = 5-i;
//			for(int j = 0; j < array[i].length; j++) {
//				array[i][j] = k;
//				k+=5;
//			}
//		}
//		
		int k = 1;
		
//		50 40 30 20 10
//		51 41 31 21 11
		
		// 1. 첫 시작점이 어딘지 파악 -> 초기식
		// 2. 숫자의 흐름 방향을 파악 -> 증감식
		// 3. 행 또는 열의 고정을 파악 -> 고정된 부분이 바깥 for문
		// 4. 반복문 작성
		
		
		for(int i = 0; i < array.length; i++) {
			for(int j = array.length-1; j >= 0; j--) {
				array[j][i] = k++;
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
