package org.ordinary.day07.oop.run;

import java.util.Scanner;

import org.ordinary.day07.oop.Book;
import org.ordinary.day07.oop.Circle;
import org.ordinary.day07.oop.Member;
import org.ordinary.day07.oop.Rectangle;

public class RunClass {
	public static void main(String[] args) {
		
		RunClass runClass = new RunClass();
		runClass.oopMember();

		// 만약 static 레벨로 메소드를 생성하면 인스턴스를 생성하지 않고 바로 클래스레벨에서 접근 가능하다.
		
	}
	
	
	
	
	public void oopMember() {
		// -> member라는 이름의 변수는 stack에 할당
		// -> new Member()로 생성된 객체는 heap에 동적으로 할당
		// 생성된 각각의 참조변수를 통해 객체의 멤버에 접근이 가능
		Member member = new Member(); 
		member.name = "스쿠나";
		member.age = 35;
		Member member2 = new Member();
		member2.name = "사토루";
		member2.age = 30;
		System.out.println(member.name + member.age);
		System.out.println(member2.name + member2.age);
		System.out.println(member.job); // null : String은 객체타입이므로 null		
	}
	
	public void oopCircle() {
		//Circle의 instance를 이용하여 이름이 moon, 반지름은 5인 Circle의 넓이를 출력해보자.
		Circle moon = new Circle();
		moon.name = "달";
		moon.radius = 5;
		
		System.out.println(moon.name + "의 넓이는 " + moon.getArea());
		
		Circle sun = new Circle();
		sun.name = "해";
		sun.radius = 20;
		
		System.out.println(sun.name + "의 넓이는 " + sun.getArea());
	}
	
	public void oopRectangle() {
		// 너비와 높이를 입력받아
		// 사각형의 넓이를 출력하는 클래스를 만드시오.
		// >> 4 5
		// 사각형의 넓이는 20입니다.
		Scanner scanner = new Scanner(System.in);
		
		Rectangle rec = new Rectangle();
		System.out.print(">> ");
		rec.height = scanner.nextInt();
		rec.width = scanner.nextInt();
		rec.area = rec.getArea();
		System.out.println("사각형의 넓이는 "+rec.area+"입니다.");
	}
	
	public void oopBook() {
		// 생성자 연습
		Book book1 = new Book();	// 기본 생성자 이용해서 객체 생성
		// title, author는 모두 비어있음
		book1.title = "title1";
		book1.author = "author1";
		System.out.println(book1.title + " " + book1.author);
		Book book2 = new Book("title2", "author2");
		System.out.println(book2.title + " " + book2.author);		
	}
	
	public void thisGetterSetter() {
		// this , getter, setter
		
		Circle c = new Circle();
		c.setName("c");
		c.getName();
		c.setRadius(5);
		c.getRadius();
		System.out.println(c.getPrivateArea());
		
		Book emptyBook = new Book();
		System.out.println(emptyBook.author + "empty");
		System.out.println(emptyBook.title + "empty");
		
	}


}
