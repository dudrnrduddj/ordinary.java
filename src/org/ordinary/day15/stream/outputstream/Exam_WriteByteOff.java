package org.ordinary.day15.stream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_WriteByteOff {

	public static void main(String[] args) {
		OutputStream os = null;
		
		try {
			os = new FileOutputStream("src/org/ordinary/day15/stream/outputstream/writing3.txt");
			byte[] data = "마지막 입출력".getBytes();
			os.write(data, 0, 3); // 기본 인코딩이 UTF-8로 설정되어있을 경우 한글은 한글자당 3byte씩 계산됨.
			os.flush();
			System.out.println("write3 완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
