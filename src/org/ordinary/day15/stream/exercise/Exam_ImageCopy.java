package org.ordinary.day15.stream.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Exam_ImageCopy {

	public static void main(String[] args) {
		// C:\Windows\Web\Wallpaper\Theme1\img3.jpg 를
		// C:\Temp\copyimg.jpg 로 복사
		
		InputStream is = null;
		OutputStream os = null;
		
		try {
			is = new FileInputStream("C:\\Windows\\Web\\Wallpaper\\Theme1\\img3.jpg");			
			// 해당 파일에서 바이트 단위로 데이터를 읽기 위한 스트림 객체
			os = new FileOutputStream("C:\\temp\\copyimg.jpg");
			byte[] byteImages = new byte[1024];
			int readCount;
			while(true) {
				readCount = is.read(byteImages);
				// 미리 생성한 is(stream 객체)에서 데이터를 읽어와 byteImages 배열에 저장하고, 실제로 읽은 바이트 수를 반환함.
				
				if(readCount == -1) break;
				os.write(byteImages, 0, readCount);
				// 데이터가 저장된 byteImages 배열을 os에 출력
				os.flush();
			}
			System.out.println("복사가 완료되었습니다.");
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
