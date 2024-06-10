package org.ordinary.day15.stream.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Exam_FileCopy {

	public static void main(String[] args) {
		// C드라이브에 있는 파일을 다른 폴더로 복사해보자~!
		// C:\temp\Image20240610143526.png -> E:\Copy\copied.png
		
		InputStream is = null;
		OutputStream os = null;
		
		try {
			is = new FileInputStream("C:\\Temp\\Image20240610143526.png");
			os = new FileOutputStream("C:\\temp사진복사\\copied.png");
			
			byte[] readByte = new byte[1024];
			int readCount;
			
			while((readCount = is.read(readByte)) != -1) {
				os.write(readByte, 0, readCount);
				os.flush();
			}
			
			System.out.println("사진 복사가 완료되었습니다.");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
