package org.ordinary.day08.oop.objectarray;

public class Book {
	// 제목
	// 저자
	String title;
	String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public String toString() {
		return "(" + this.title + ", " + this.author + ")";
	}
	
}
