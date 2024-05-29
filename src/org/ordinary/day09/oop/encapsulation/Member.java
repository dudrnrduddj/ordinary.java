package org.ordinary.day09.oop.encapsulation;

public class Member {
//	Member라는 클래스 안에서 실행하기엔 Member클래스의 성격과 맞지 않음
	
//	public static void main(String[] args) {
//		// -> member라는 이름의 변수는 stack에 할당
//		// -> new Member()로 생성된 객체는 heap에 동적으로 할당
//		// 생성된 각각의 참조변수를 통해 객체의 멤버에 접근이 가능
//		Member member = new Member(); 
//		member.name = "스쿠나";
//		member.age = 35;
//		Member member2 = new Member();
//		member2.name = "사토루";
//		member2.age = 30;
//		System.out.println(member.name + member.age);
//		System.out.println(member2.name + member2.age);
//		System.out.println(member.job); // null : String은 객체타입이므로 null
//		
//	}
	
	// 멤버변수(필드)
	// 다른 패키지에서도 접근 가능하도록 public 키워드 써줌.
	private String name;
	private char gender;
	private int age;
	private String education;
	private long salary;
	private String job;
	private String property;
	private String phoneNumber;
	private String address;
	private boolean single;
	private String children;
	
	public Member() {}
	
	// 멤버메소드(메소드)
	public void registerMember() {}
	public void doHeart() {}
	public void sendMessage() {}
	public void doPromise() {}
}
