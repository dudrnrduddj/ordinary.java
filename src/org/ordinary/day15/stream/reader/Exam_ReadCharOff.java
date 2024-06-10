package org.ordinary.day15.stream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_ReadCharOff {

	public static void main(String[] args) {
		Reader reader = null;
		try {
			reader = new FileReader("src/org/ordinary/day15/stream/reader/reading.txt");
			int readCount;
			char [] cBuf = new char[3];
			String result = "";
			while ((readCount = reader.read(cBuf, 1, 2)) != -1) {
				// cbuf 배열에 인덱스 1부터 2개의 데이터를 읽어 저장
				result += new String(cBuf, 0, readCount);
				// cbuf의 인덱스 0부터 2개의 데이터를 문자열로 변환해서 누적합 시킴
				System.out.println(result);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
