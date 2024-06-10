package org.ordinary.day15.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_ReadByte {
	public static void main(String[] args) {
		InputStream is = null;

		try {
			is = new FileInputStream("src/org/ordinary/day15/stream/inputstream/reading.txt");
			byte[] readBytes = new byte[3];
			int readCount;
			String result = "";
			while (true) {
				readCount = is.read(readBytes); 
				// read(byte [] b) 입력스트림으로부터 읽은 바이트들을 매개값으로 주어진 바이트배열 b에 저장하고 실제로 읽은 바이트 수를 리턴
				if (readCount == -1) {
					break;
				}

				result += new String(readBytes, 0, readCount); // 0번째부터 readCount까지 readBytes를 문자열로 바꿈.
			}

			System.out.println(result);
			System.out.println((char)readBytes[0]); // -> a출력됨. 마지막 루프에서 저장된 배열의 0번째값임
			// 마지막 루프에서 저장된 배열의 값은 a뿐임 따라서 남은 공간엔 이전에 저장된 데이터가 남아있음
			// 따라서 readBytes[1] => a, readBytes[2] => v가 출력되는 것임!!!

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
