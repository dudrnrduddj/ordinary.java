package org.ordinary.day10.oop.interfaceex;




public class Exam_Interface {

	public static void main(String[] args) {
		
//		PhoneInterface phone = new PhoneInterface();
		// 추상클래스와 마찬가지로 객체 생성 불가
		// 자식 클래스 객체로 업캐스팅하여 사용
		PhoneInterface phone = new SamsungPhone();
		phone.printLogo();
		phone.sendcall();
		
	}
		
			
				

	

}
