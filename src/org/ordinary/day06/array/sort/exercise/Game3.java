package org.ordinary.day06.array.sort.exercise;

import java.util.Scanner;

public class Game3 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("배열의 크기 입력 : ");
		int arrSize = scanner.nextInt();
		
		int[] arrInt = new int[arrSize];
		
		for(int i = 0; i < arrSize; i++) {
			arrInt[i] = (int)(Math.random()*100+1);
		}
		
		int sum = 0;
		
		for(int a : arrInt) {
			sum = sum+a;
		}
		
		
		if(arrSize < 0) {
			System.out.println("배열의 크기는 양수로 입력해야 합니다!");
		}else if(arrSize >= 0) {
			System.out.printf("sum = %d", sum);
		}
		
	}

}
