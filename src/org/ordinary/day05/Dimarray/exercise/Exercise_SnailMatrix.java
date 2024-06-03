package org.ordinary.day05.Dimarray.exercise;

public class Exercise_SnailMatrix {

	public static void main(String[] args) {
		//	 
		//1 - array[i][j] 5
		//2 - array[j][i] 5
		//3 - array[i][j] 4
		//4 - array[j][i] 4
		//5 - array[i][j] 3
		//6 - array[j][i] 3
		//7 - array[i][j] 2
		//8 - array[j][i] 2
		//9 - array[i][j] 1
		
		int[][] array = new int[5][5];
		int k = 1;
		
		for(int i = 0; i < 3; i++) {
			if(i == 0) {
				for(int j = 4; j >= 0; j--) {
					array[i][j] = k++;
				}
				
				k--;
				
				for(int j = 0; j < array.length; j++) {
					array[j][i] = k++;
				}
				
			}else if(i == 1){
				for(int j = i; j < array.length; j++) {
					array[5-i][j] = k++;
				}
				k--;
				for(int j = 4; j > 0; j--) {
					array[j][5-i] = k++;
				}
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
