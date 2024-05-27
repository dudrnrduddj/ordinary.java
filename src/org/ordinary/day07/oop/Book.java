package org.ordinary.day07.oop;

public class Book {
	
	public String title;
	public String author;
	
	public Book() {
		this("", ""); // 공백인 book으로 초기화
	}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	
	
}

