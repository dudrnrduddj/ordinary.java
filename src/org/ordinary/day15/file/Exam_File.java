package org.ordinary.day15.file;

import java.io.File;
import java.io.IOException;

public class Exam_File {

	public static void main(String[] args) {
		// 파일 객체화
		// 파일정보를 자바응용프로그램에서 사용할 수 있음.
		File folderMake = new File("src/org/ordinary/day15/file/sample");
		if(!folderMake.exists()) {
			folderMake.mkdir();
			System.out.println("폴더가 만들어졌습니다.");
		}else {
			System.out.println("이미 폴더가 존재합니다.");
		}
		
		
	}
	
	public void fileMake() {
		File fileMake = new File("src/org/ordinary/day15/file/sample.txt");
		if(!fileMake.exists()) {
			try {
				fileMake.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("파일이 만들어졌습니다.");
		}else {
			System.out.println("이미 파일이 존재합니다.");
		}
	}
	
	
	public void fileBasic() {
		File file = new File("C:\\temp\\copyimg.jpg");
		String fileName = file.getName();
		String filePath = file.getPath();
		String fileParent = file.getParent();
		System.out.println("파일 이름 : " + fileName);
		System.out.println("파일 경로 : " + filePath);
		System.out.println("부모 폴더 : " + fileParent);
		
		System.out.println("파일이 존재하는가? : " + file.exists());
		System.out.println("파일이 맞는가? : " + file.isFile());
		System.out.println("폴더가 맞는가? : " + file.isDirectory());
	}
	
}
