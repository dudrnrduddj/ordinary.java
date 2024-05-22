package org.ordinary.day01.inputSc;

import java.util.Scanner;

public class Exam_ScannerTest {
	public static void main(String[] args) {
//	 system.in은 객체로 어떤 데이터가 흐르는 통로역할을 해줌. => 키보드의 입력 데이터를 프로그램으로 흐르게 함
//	 단, 데이터는 바이트 코드 데이터이기 때문에 각각의 바이트코드를 형변환시켜주어야 하는데, 그것은 굉장히 번거롭기때문에
//	 Scanner 객체를 생성해서 활용하는 것임!!
		
//		System.out.println("Test");
		Scanner scanner = new Scanner(System.in);
		scanner.nextInt();
		
		System.out.println("하나의 수를 입력해주세요.");
		int a = 100;
		System.out.println("a의 값 : " + a);
		
	}
}
