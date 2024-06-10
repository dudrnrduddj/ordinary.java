package org.ordinary.day15.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_Read {
	public static void main(String[] args) {
		InputStream is = null;
		
		//반드시 예외처리가 필요
		try {
			is = new FileInputStream("src/org/ordinary/day15/stream/inputstream/reading.txt"); // 입력스트림 - 읽을 파일 경로를 입력받음
			int readByte = is.read(); // 입력  스트림으로부터 1바이트를 읽고, 읽은 바이트를 정수로 리턴
			System.out.println((char)readByte);
			readByte = is.read(); 
			System.out.println((char)readByte);
			readByte = is.read(); 
			System.out.println((char)readByte);
			// ... 다 읽으면 -1이 출력됨 -> 반복문을 통해 -1을 보면 멈추도록 만들어주자!
			
			do {
				readByte = is.read();
				System.out.println((char)readByte);
			}while(readByte != -1);
			
		}
//		 catch (FileNotFoundException e) {
//			
//			e.printStackTrace();
//		}
		
//		IOException이 부모예외이기 때문에 위의 FileNotFoundException 예외처리는 필요없음.		
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
