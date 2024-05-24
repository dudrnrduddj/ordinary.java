package org.ordinary.day06.array.sort;
public class Exam_InsertionSort {

	public static void main(String[] args) {
		// 삽입정렬
		// 정렬 알고리즘 중에 하나, 가장 간단하고 기본이 되는 알고리즘
		// 배열의 N번 인덱스값을 0번에서 n-1번 인덱스까지 비교~!
		// N은 1부터 시작
		// {2, 5, 4, 1, 3}
		
		int [] array = {2, 5, 4, 1, 3};
		for(int i = 1; i < array.length; i++) {
			for(int j = i; j > 0; j--) {
				if(array[j-1] < array[j]) {
					int temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
				}
			}
		}
		for(int arr : array) {
			System.out.print(arr + " ");
		}
		System.out.println();
		
//		  초기식, 조건식, 증감식의 변화로 조금씩 다른 형태의 코드를 만들 수 있음!
//-------------------------------원리 --------------------------------
		// 핵심은 => 숫자가 왼쪽으로 한칸씩 한칸씩 스위칭되며 왼쪽의 숫자와 비교되는 것
		// 첫번째 : 5와 2를 비교 -> 교환 X
		// 결과 : {2, 5, 4, 1, 3}
		// 4와 비교 시작
		// 두번째 : 4와 5비교 -> 교환 O
		// 		  4와 2비교 -> 교환 X
		// 결과 : {2, 4, 5, 1, 3}
		// 세번째 : 1과 4비교 -> 교환 O
		//		: 1과 5비교 -> 교환 O
		// 		: 1과 2비교 -> 교환 O
		// 결과 : {1, 2, 4, 5, 3}
		// 네번째 : 3과 5를 비교 -> 교환 O
		// 		  3과 4를 비교 -> 교환 O
		// 		  3과 2를 비교 -> 교환 X
		// 		  3과 1를 비교 -> 교환 X
		// 결과 : {1, 2, 3, 4, 5}
		
		int[] arrs = {2, 5, 4, 1, 3};
		
		for(int i = 1; i < arrs.length; i++) {
			for(int j = i; j > 0; j--) {
				if(arrs[j-1] > arrs[j]) {
					int temp = arrs[j];
					arrs[j]= arrs[j-1];
					arrs[j-1] = temp;
				}
			}
		}
		
		for(int a : arrs) {
			System.out.print(a+" ");
		}

	}
}
