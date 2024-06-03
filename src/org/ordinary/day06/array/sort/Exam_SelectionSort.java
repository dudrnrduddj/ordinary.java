package org.ordinary.day06.array.sort;

public class Exam_SelectionSort {

	public static void main(String[] args) {

//		선택정렬이란?
//		배열을 전부 검색하여 최소값을 고르고 왼쪽부터 채워나가는 정렬
//		특징 : 데이터의 양이 적을 때 좋은 성능을 보여주는 정렬
//		데이터 양이 많을 때 급격한 성능 저하를 보임.
//		배열의 n번 인덱스값을 n+1 ~ 마지막 인덱스까지 비교함.
//		{2, 5, 4, 1, 3}
//		첫번째 결과 : {1, 5, 4, 2, 3}
//		두번째 결과 : {1, 2, 4, 5, 3}
//		세번째 결과 : {1, 2, 3 ,5, 4}
//		네번째 결과 : {1, 2, 3, 4, 5}
		
		int[] arrs = {2, 5, 4, 1, 3};
		
//		int min = 0;
//		
//		for(int i = 0; i < arrs.length; i++) {
//			for(int j = i + 1; j < arrs.length; j++) {
//				if(arrs[min] > arrs[j]) {
//					min = j;
//				}
//			}
//			int temp  = arrs[i];
//			arrs[i] = arrs[min];
//			arrs[min] = temp;
//		}
		//int min = 0; -> int min = i; ???
		
		
		
		
		// 연습해봄
		
		for(int i = 0; i < arrs.length-1; i++) {
			int min_index = i;
			
			for(int j = i + 1; j < arrs.length; j++) {
				if(arrs[min_index] > arrs[j]) {
					min_index = j;
				}
			}
			int temp = arrs[min_index];
			arrs[min_index] = arrs[i];
			arrs[i] = temp;
		}
		
		for(int a : arrs) {
			System.out.print(a+" ");
		}
	}
}
