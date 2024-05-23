package org.ordinary.day05.Dimarray;

public class Exam_DimArray {
//////  2차원 배열 선언과 할당 및 출력  //////
	public static void main(String[] args) {

		int num = 0; //변수
		int[] nums = new int[10]; //배열
		int[][] dimNums = new int[4][2]; // 2차원 배열
		
		System.out.println("행의 길이 : " + dimNums.length);
		System.out.println("열의 길이 : " + dimNums[0].length);
//			dimNums[index]의 길이
		int k = 1;
		int[][] arrs = new int[4][4];
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++, k++) {
				arrs[i][j] = k;
			}
		}
		
////////// for 버전
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
				System.out.print(arrs[i][j] + "\t");				
			}
			System.out.println();
		}
		
		System.out.println();
		
///////// for-each 버전
		for(int[] i : arrs) {
			for(int j : i) {
				System.out.print(j + "\t");				
			}
			System.out.println();
		}
		
		
		
	}

}
