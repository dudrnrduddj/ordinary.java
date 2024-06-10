package org.ordinary.day15.stream.bufferedstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_BufferedStream {

	public static void main(String[] args) {
		// 문자, 바이트 기반 스트림 객체를 선택하면 됨
		// 데이터의 형태에 따라 적합한 것 선택!
		Reader reader = null; // 문자 기반
//		InputStream is = null; // 바이트 기반
		
		BufferedReader bReader = null; // 보조스트림
		
		int readCount;
		try {
			reader = new FileReader("src/org/ordinary/day15/stream/bufferedstream/Exam_BufferedStream.java");
			bReader = new BufferedReader(reader);// 주 스트림객체를 매개변수로 넣어줌
			
			char[] cBuf = new char[1024];
			readCount = bReader.read(cBuf); // 보조스트림의 메소드 사용
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
				bReader.close(); // close 시키는 순서는 상관없음.
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
