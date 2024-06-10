package org.ordinary.day15.stream.exercise;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Exam_TextFileCopy {

	public static void main(String[] args) {
		// c:\\windows\\system.ini 을 복사해서
		// c:\\Temp\\system.txt 로 만들어주세요. 단 문자기반 스트림을 사용하세요.
		Reader reader = null;
		Writer writer = null;
		
		try {
			reader = new FileReader("c:\\windows\\system.ini");
			writer = new FileWriter("c:\\Temp\\system.txt");
			char[] cBuf = new char[10];
			int readCount;
			while((readCount = reader.read(cBuf)) != -1) {
				writer.write(cBuf, 0, readCount);
				writer.flush();	// 남은 버퍼를 비우는 역할을 함.
			}
			System.out.println("복사가 완료되었습니다.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
			writer.close(); // 내부적으로 flush()를 호출한다.
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		// 반복문을 통해서 데이터의 전체를 안전하게 읽어오도록 하는 것이 좋으며 flush, close를 통해
		// 남은버퍼를 처리하는 로직을 만드는 것이 좋다.
		
	}

}
