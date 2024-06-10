package org.ordinary.day15.stream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_Write {

	public static void main(String[] args) {
		OutputStream os = null;
		
		try {
			// 파일을 만들게 됨.
			os = new FileOutputStream("src/org/ordinary/day15/stream/outputstream/writing.txt");
			byte[] input = "헬로우 입출력".getBytes(); // getBytes() byte배열로 만들어주는 메소드
			for(int i = 0; i < input.length; i++) {
				os.write(input[i]);
			}
			os.flush();	// 버퍼비우기
			os.close();	// 자원해제
			System.out.println("파일 쓰기 완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
