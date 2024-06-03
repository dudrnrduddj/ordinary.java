package org.ordinary.day12.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exam_SetCollection {
	public static void main(String[] args) {
		Set<Student> studentSet = new HashSet<Student>();
		studentSet.add(new Student("이세훈", 90, 80));
		studentSet.add(new Student("허태성", 88, 44));
		studentSet.add(new Student("남궁성", 78, 67));
		studentSet.add(new Student("이세훈", 90, 80));

		System.out.println("크기 : " + studentSet.size()); // 4
		// set은 중복이 안된다그랬는데 왜 4일까?
		// 객체의 참조변수가 다르기 때문에 다 다른것으로 인식
		
		// 따라서 그 안의 값들이 똑같음을 알려주기 위한 코드를 추가해줘야함.
		// 해당 클래스에서 hashcode(), equals() 메소드를 오버라이딩 해주자
		
		//**equals와 hashCode의 계약**
		
		//일관된 동작: 객체의 equals 메서드가 true를 반환하는 두 객체는 동일한 hashCode 값을 가져야 합니다. 
		//즉, 두 객체가 논리적으로 동일하면(equals 메서드가 true를 반환하면) 동일한 해시 코드를 반환해야 합니다.
		//
		//동일한 해시 코드: 반대로, 동일한 hashCode 값을 가진 두 객체가 반드시 equals 메서드에서 true를 반환할 필요는 없습니다. 
		//즉, 해시 코드가 같더라도 객체가 반드시 동일할 필요는 없지만, 다른 해시 코드를 가진 두 객체는 반드시 다른 객체로 취급됩니다.

		
		Iterator<Student> it = studentSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}
		// hasNext() 는 다음 요소가 있는지 확인
		// next() 는 현재요소를 반환하고 다음요소로 이동한다.
		// 따라서 반복문 안에서 next()를 사용하지 않으면 무한 반복이 될 수 있음.
		
		
	}
	
	
	
	
	public void setSample() {
		// Collection의 List, Set, Map -> 저장소
		
				// 자료구조의 특성에 따라서 선택하여 사용함.
				// Set
				Set<String> strSet = new HashSet<String>(); // 셋을 이용해서 구현한 클래스 중 HashSet이 있음
				strSet.add("체리");
				strSet.add("딸기");
				strSet.add("사과");
				strSet.add("수박");
				strSet.add("포도");
				strSet.add("딸기");
				
				System.out.println("크기 : " + strSet.size()); // 5
				// 수학의 집합 : 순서가 중요하지 않음, 중복을 허용하지 않음.
				// 중복이 있는 데이터들이 있는데 이것을 set에 넣으면 중복이 제거됨.
				// 순서가 있는 경우에는 index활용할 수 있으나 set처럼 순서가 없으면 지시자를 활용
				// 지시자 => iterator
				Iterator<String> it = strSet.iterator(); // iterator()메소드는 iterator 객체를 반환
				while(it.hasNext()) {// hasNext() => 값이 존재하는지 true/false
					System.out.println(it.next().toString());
				}// set은 자료의 순서가 없기때문에 마치 로또번호를 추첨하듯 존재하면 출력하는 식임.
				
	}
	
}
