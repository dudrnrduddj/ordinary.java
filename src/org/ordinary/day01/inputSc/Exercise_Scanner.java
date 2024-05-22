package org.ordinary.day01.inputSc;

import java.util.Scanner;

public class Exercise_Scanner {
	public static void main(String[] args) {

		// 이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요.
//		Kim Seoul 20 65.1 true
//		이름은 Kim, 도시는 Seoul, 나이는 20살 체중은 65.1kg, 독신 여부는 true입니다.
		
//		틀린답변!
//		Scanner scannerName = new Scanner(System.in);
//		Scanner scannerCity = new Scanner(System.in);
//		Scanner scannerAge = new Scanner(System.in);
//		Scanner scannerWeight = new Scanner(System.in);
//		Scanner scannerSolo = new Scanner(System.in);
		
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요.");	
		
		Scanner scanner = new Scanner(System.in);	// 하나의 객체에 정보를 담고있음
		String name = scanner.next();		// 각각의 메서드에 의해 토큰단위로 정보를 순서대로 가져감
		String city = scanner.next();		// 토큰은 띄어쓰기 단위로 구분된 값들임.
		int age = scanner.nextInt();
		double weight = scanner.nextDouble();
		boolean solo = scanner.nextBoolean();
		
		System.out.println("이름은 " + name + ", 도시는 " + city +
	", 나이는 " + age +" , 체중은 " + weight + "kg, 독신 여부는 " + solo +"입니다.");
//		Scanner는 키 입력을 공백으로 구분된 토큰 단위로 끊어 읽는다!!
//		여기서!! 토큰이란 사용자가 입력한 키값들 공백이 없는 하나하나의 값들을 의미
//		만약 공백을 포함한 한 라인 전체를 하나의 토큰으로 입력시키고 싶다면 scanner.nextLine()을 사용해보자!
		
		scanner.close();
//		메모리의 누수나 손실을 방지시키기 위해 마무리로 닫아줘야한다!
//		하지만 자원을 다 사용하기 전에 닫아버리지 않도록 주의하자!
		
//		실전에선 scanner보단 html에서 form태그로 입력받는 경우가 많다..
//		scanner는 가볍게 연습느낌
	}
}
