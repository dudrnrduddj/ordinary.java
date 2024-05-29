package org.ordinary.day09.oop.encapsulation;

public class Book {
	
	public static void main(String[] args) {
		// 필드에 직접 접근 (옳지 않음)
//		Book book = new Book();
//		book.title = "춘향뎐";		//is not visible(다른 클래스에서)
//		book.author = "작자미상";
		
		// 필드에 직접 접근하지 않고 객체 초기화하는 방법
		//생성자를 통해서 초기화
		Book book = new Book("춘향뎐", "작자미상");
		
		// setter() 메소드를 이용한 초기화
		Book bookbook = new Book();
		bookbook.setTitle("춘향뎐");
		bookbook.setAuthor("작자미상");
		
	}
	
	private String title;
	private String author;
	
	public Book() {
		this("", ""); // 공백인 book으로 초기화
	}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	
	//** 필드에 직접 접근하지 못하게 하고 우회해서 접근하게 하려고**
	// setter
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	// getter
	public String getTitle() {
		return this.title;
	}
	public String getAuthor() {
		return this.author;
	}
	
	
	
}

