package org.ordinary.day15.stream.exercise;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class Exam_MemoPad {

	public static void main(String[] args) {
		// 저장할 파일 입력(확장자 제외) : snow
		// 종료는 exit
		// 1 : 오늘은
		// 2 : 눈이
		// 3 : 옵니다.
		// 4 : 펑펑
		// 5 : 옵니다.
		// 6 : exit
		// 파일 저장이 완료되었습니다. F5를 눌러 확인해보세요~
		// snow.txt -> 오늘은 \n 눈이 \n 옵니다 \n 펑펑 \n 옵니다
		
		Writer writer = null;
		Scanner scanner = new Scanner(System.in);

		
		System.out.print("저장할 파일 입력(확장자 제외) : ");
		String fileName = scanner.next();
		try {
			writer = new FileWriter("src/org/ordinary/day15/stream/exercise/"+fileName + ".txt", false); // false는 기존파일을 덮어씌움.
			System.out.println("종료는 exit");
			
			int num = 1;
//			String text = "";
//			String result = "";
			
			// 내가 쓴 방법
//			while(true){
//				System.out.print(num++ + " : ");
//				text = scanner.next();
//				if("exit".equals(text)) { // nullpointerException방지로 "exit"을 앞에 씀. text. 로 접근한다면 text가 혹여나 null이면 예외가발생하기 때문
//					break;
//				}
//				result += text + "\n";
//			}
//			writer.write(result);
//			writer.flush();
			
			for(num = 1;;num++) {
				System.out.print(num + " : ");
				String text = scanner.next();
				if("exit".equals(text)) {
					break;
				}
				writer.write(text + "\n");
				writer.flush();
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("파일 저장이 완료되었습니다. F5를 눌러 확인해보세요~");
		
		//FileWriter의 write()를 사용하면 파일을 열고 데이터를 기존 내용 뒤에 추가하는 형태로 동작한다.
		//만약 이어쓰고 싶은 경우에는 FileWriter의 생성자를 FileWriter(String fileName, boolean append) 형태로 호출하여 두 번째 인자를 true로 설정하면 된다.
		//이렇게 하면 기존의 내용에 새 내용이 이어진다.
		//두번째 인자를 false로 설정하면 기존의 파일 내용이 삭제되고 새로 추가한 내용이 덮어써진다.
		
	}
}
