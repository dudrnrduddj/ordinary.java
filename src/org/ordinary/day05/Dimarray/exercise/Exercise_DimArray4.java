package org.ordinary.day05.Dimarray.exercise;

public class Exercise_DimArray4 {
	public static void main(String[] args) {

		int[][] array = new int[5][5];
		
		
		// 정답!
		int k = 1;
		
		for(int i = 0; i < array.length; i++) {
			if(i % 2 == 1) {
				for(int j = array[i].length-1; j >= 0; j--, k++) {
					array[i][j] = k;					
				}
			}else {
				for(int j = 0 ; j < array[i].length; j++, k++) {
					array[i][j] = k;
					
				}
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
