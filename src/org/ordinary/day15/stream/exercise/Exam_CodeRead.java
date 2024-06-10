package org.ordinary.day15.stream.exercise;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_CodeRead {

	public static void main(String[] args) {
		// Exam_ImageCopy.java 파일을 읽어서 콘솔로 출력해보세요!
		// 문자기반 스트림
		// 1. 입력스트림 사용
		//  - 문자 배열 이용
		// 2. 파일의 경로를 파악
		// 3. System.out.println()으로 출력
		//  - 읽은 것은 문자열로 만들기
		//  - 누적합
		// 4. 자원해제
		
		Reader reader = null;
		try {
			reader = new FileReader("src/org/ordinary/day15/stream/exercise/Exam_ImageCopy.java");
			char[] cBuf = new char[1024]; // 버퍼의 크기 1024로 지정 -> 1KB의 크기를 의미
										  // 1 ~ 8KB의 크기가 적절한 버퍼의 크기로 간주됨.
										  // 작은 버퍼는 한 번에 읽고 쓸 수 있는 데이터 양이 적기 때문에 스트림에서 데이터를 처리하기 위해 더 많은 시스템 호출이 발생
			
			int readCount;
			String result = "";
			
			while(true) {
				readCount = reader.read(cBuf);
				if(readCount == -1) break;
				result += new String(cBuf, 0, readCount);
			}
			
			System.out.println(result);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
