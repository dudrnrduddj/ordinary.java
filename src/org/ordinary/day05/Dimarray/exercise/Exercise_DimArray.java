package org.ordinary.day05.Dimarray.exercise;

public class Exercise_DimArray {
	// 핵심은 반복문의 초기식, 조건식, 증감식의 변화를 주어 배열의 순서를 변형 시키는 것임!!
	// 단순 식의 계산을 추가하는 것은 문제에서 원하는 답이 아님!
	
	// 1. 첫 시작점이 어딘지 파악 -> 초기식
	// 2. 숫자의 흐름 방향을 파악 -> 증감식
	// 3. 행 또는 열의 고정을 파악 -> 고정된 부분이 바깥 for문
	// 4. 반복문 작성
	public void practice1() {
		
		int[][] array = new int[5][5];
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
	
	public void practice2() {
		int[][] array = new int[5][5];
		
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
	
	public void practice3() {
		int[][] array = new int[5][5];
		
		int k = 1;
		
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
	
	public void practice4() {
		int[][] array = new int[5][5];
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
