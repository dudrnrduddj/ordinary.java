package org.ordinary.day11.oop.objectex;

class Member{
	String name;
	int age;
	String email;
	String phone;
	String address;
	
	public Member() {}	// 기본생성자를 쓰는 습관 
	
	public Member(String name, int age, String email, String phone, String address) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}
	
	@Override		//toString 오버라이딩해서 많이 씀. 데이터 잘 입력되었는지 잘 받아왔는지 확인하는 용도로 많이씀.
	public String toString() {
		return "이름 : " + name + ", 나이 : " + age + ", 이메일 : " + email + ", 전화번호 : " + phone + ", 주소 : " + address;
	}
}



public class Exam_ObjectProperty {
	
	public static void print(Object obj) {
		System.out.println("클래스 이름 : " + obj.getClass().getName());
		System.out.println("해시 코드값 : " + obj.hashCode());
		// 의미있는 데이터로 만들어 출력하고 싶다면 오버라이딩 필수!
		System.out.println("객체를 문자열로 만들어 출력 : " + obj.toString());
//		System.out.println("객체 출력 : " + obj); // toString() 생략 가능함.
											   // 객체를 출력하면 toString()의 결과로 출력됨.
	}
	
	public static void main(String[] args) {
		print(new Member("일용자", 11, "khuser01@naver.com", "01092920303", "서울시"));
		print(new Member());
		
		String javaStr = "Java";
		String javaStr2 = new String("Java");
		System.out.println("javaStr : " + javaStr.hashCode() + ", javaStr2 : " + javaStr2.hashCode());
		// 해시코드는 똑같이 나오는 이유?
		// -> String 객체 내부에서 hashcode()가 오버라이딩 되어있음
		// 따라서 실제 주소값을 비교하고 싶다면 System.identifyHashCode()를 쓰자.
		System.out.println(System.identityHashCode(javaStr) + " " + System.identityHashCode(javaStr2));
		
		String javaStr3 = "Java";
		
		if(javaStr2 == "Java") {	// 다릅니다
			System.out.println("똑같습니다.");
		}else {
			System.out.println("다릅니다.");
		}
		
		if("Java".equals(javaStr2)) {
			System.out.println("똑같습니다.");
		}else {
			System.out.println("다릅니다.");
		}
		
		
		String result = javaStr == javaStr3 ? "같음" : "다름";
		System.out.println(result);
		String result2 = javaStr3 == javaStr2 ? "같음" : "다름";
		System.out.println(result2);
		String result3 = javaStr3 == "Java" ? "같음" : "다름";
		System.out.println(result3);
		String result4 = javaStr == "JavA" ? "같음" : "다름";
		System.out.println(result4);
		
	}

}
