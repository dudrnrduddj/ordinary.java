package org.ordinary.day06.array.sort.exercise;

import java.util.Scanner;

public class Qusetion1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] arrInt = new int[5];
		
		for(int i = 0; i < 5; i++) {
			System.out.print(i+1 + "번째 정수 입력 : ");
			arrInt[i] = scanner.nextInt();
		}
		
		System.out.println("정렬된 결과 : ");
		
		for(int i = 0; i < arrInt.length-1; i++) {
			for(int j = 0; j < (arrInt.length-1) - i; j++) {
				if(arrInt[j] > arrInt[j+1]) {
					int temp = arrInt[j];
					arrInt[j] = arrInt[j+1];
					arrInt[j+1] = temp;
				}
			}
		}
		
		for(int i : arrInt) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.print("정렬 후 첫 번째 수와 마지막 수의 합 : " + (arrInt[0]+arrInt[4]));
	}
}
