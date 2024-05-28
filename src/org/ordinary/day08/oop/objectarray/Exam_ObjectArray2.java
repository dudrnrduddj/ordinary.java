package org.ordinary.day08.oop.objectarray;

import java.util.Scanner;

public class Exam_ObjectArray2 {

	public static void main(String[] args) {
		// 여러개의 책이 존재하는데 그 책의 정보를 여러개 저장하려고 함.
		// 책은 3권까지 저장할 수 있도록 하고 제목과 저자가 입력받아 저장할 수 있는
		// 프로그램을 작성하시오.
		
		Scanner scanner = new Scanner(System.in);
		Book[] bookArr = new Book[3];
		
		for(int i = 0; i < bookArr.length; i++) {
			System.out.println("===="+(i+1)+"번째 책"+"====");
			System.out.print("제목 : ");
			String title = scanner.nextLine();
			System.out.print("저자 : ");
			String author = scanner.nextLine();
			
			
			bookArr[i] = new Book(title, author);
		}
		int i = 0;
		for(Book book : bookArr) {
			System.out.println("-----------------------");
			System.out.print((++i)+"번째 책 : "+book.author+"\t"+book.title);
			System.out.println();
			System.out.println(book.toString());
		}
	}
}
