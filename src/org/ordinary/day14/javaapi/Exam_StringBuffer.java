package org.ordinary.day14.javaapi;

public class Exam_StringBuffer {

	public static void main(String[] args) {
		String data1 = "Hello";
		String data2 = " ";
		String data3 = "Java";
		//문자열 연결
		String result1 = data1.concat(data2).concat(data3);
		System.out.println("연결된 문자열 : " + result1);
		
		// StringBuffer 이용해서 연결 (메모리 절약)
		StringBuffer stb = new StringBuffer();
		stb.append(data1).append(data2).append(data3); // append()는 문자열 뒤에 문자열을 추가할 때 쓰임.
		System.out.println("연결된 문자열 : " + stb.toString());
		

	}

}
