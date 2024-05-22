package org.ordinary.day04.array.exercise;

import java.util.Scanner;

public class Exercise_Array1 {

	public static void main(String[] args) {
//		배열의 length 필드를 이용하여 배열 크기만큼 정수를
//		입력받고 평균을 구하는 프로그램을 작성하라.
//		단, 배열의 크기는 5이다.
//		정수 입력 : 24
//		정수 입력 : 10
//		정수 입력 : 5
//		정수 입력 : 2
//		정수 입력 : 42
//		평균 : ?
		
		Scanner scanner = new Scanner(System.in);
		
		int intArr[] = new int[5];
		String stringArr[] = {"첫번째","두번째","세번째","네번째","다섯번째"};
		int sum = 0;
		double avg;	// 평균은 실수로 나올 수 있기 때문에 double로 선언
		
		for(int i = 0; i < intArr.length; i++) {			
			System.out.print(stringArr[i] + " 정수 입력 : ");
			intArr[i] = scanner.nextInt();
			sum = intArr[i] + sum;
		}
		avg = (double)sum/intArr.length; // double로 명시적 형변환 시켜주기
										 // 또는 5.0으로 나누어 자동형변환시키기
		System.out.println("평균 : " + avg);
	
		
	}

}
