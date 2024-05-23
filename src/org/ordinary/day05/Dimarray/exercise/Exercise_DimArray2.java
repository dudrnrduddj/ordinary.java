package org.ordinary.day05.Dimarray.exercise;

public class Exercise_DimArray2 {
	public static void main(String[] args) {

		int[][] array = new int[5][5];
		
//		int k = 1;
//		
//		for(int i = 0; i < array.length; i++, k++) {
//			int h = k;
//			for(int j = 0; j < array[i].length; j++) {
//				array[i][j] = h;
//				h+=5;
//			}
//		}
		
		// 정답!
		int k = 1;
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				array[j][i] = k++;
			}
		}
		
		
		
		for(int[] a : array) {
			for(int b : a) {
				System.out.print(b + "\t");
			}
			System.out.println();
		}
		
	}

}
