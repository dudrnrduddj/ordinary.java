package org.ordinary.day12.collection.list;

import java.util.ArrayList;
import java.util.List;

public class Exam_ListCollection {
	// List 는 순서가 중요하고 중복을 허용하는 경우에 사용
	public static void main(String[] args) {
		// List 인터페이스 존재
		// List 인터페이스를 구현하여 만든 클래스가 존재
		// ArrayList 클래스라고 하면 이것을 사용한다.
		List<String> list = new ArrayList<String>();
		// ArrayList로 타입선언 해도 되지만 위의 형태가 흔히 쓰이는 형태임.
		
		// add() : 원하는 index에 값 추가
		list.add("김만규");
		list.add("김지혁");
		list.add("양희준");
		list.add("오정민");
		list.add("김태우");
		list.add("이용재");
		list.add("조홍빈");
		
		list.add(2, "조승효"); // index값을 부여해주면 그 자리로 추가됨.
		
		
		
		System.out.println(list.get(0));
		System.out.println(list.get(5));
		// size() : 배열의 크기
		System.out.println("크기 : " + list.size());
		int listSize = list.size()-1;
		System.out.println("마지막 값 : " + list.get(listSize));
		
		// remove() : index에 해당하는 값 삭제
		list.remove(listSize); // index값에 해당하는 값을 지워줌.
		list.remove(3); // 중간 값을 빼도 됨.

		// clear() : 다 삭제
		list.clear();
		
		
		// for-each문으로 출력
		int i = 0;
		for(String item : list) {
			System.out.println(i + item);
			i++;
		}
		
		// isEmpty() : 배열이 비어있는지 확인(true/false)
		System.out.println("isEmpty() : " + list.isEmpty() + ", size() : " + list.size());
		
		
	}
	
	
	public void genericSample() {
		// 제네릭을 쓰면 형변환하지 않아도 됨.
		GenericList<String> strList = new GenericList<String>();
		// '<>' 를 통해 타입의 형변환이 필요없게 된다.
		strList.add("김정욱");
		strList.add("이현주");
		strList.add("강신욱");
		
		String a1 = strList.get(0);
		String a2 = strList.get(1);
		String a3 = strList.get(2);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		ObjectList obj = new ObjectList();
		obj.add("개강");
		obj.add("프로젝트");
		obj.add("종강");
		
		String start = (String) obj.get(0);
		String project = (String) obj.get(1);
		String end = (String) obj.get(2);
		System.out.println(start);
		System.out.println(project);
		System.out.println(end);
	}
	
	public void objectListSample() {
		ObjectList objList = new ObjectList();
		objList.add(5.7);
		objList.add(1023);
		objList.add("종강");
		double start = (double) objList.get(0);
		int end = (int) objList.get(1);
		String msg = (String) objList.get(2);
		System.out.println(start);
		System.out.println(end);
		System.out.println(msg);
	}

	public void intListSample() {
		IntList nums = new IntList();
		nums.add(5);
		nums.add(7);
		nums.add(1023);

		System.out.println(nums.get(0));
		System.out.println(nums.get(1));
		System.out.println(nums.get(2));
		System.out.println("크기 : " + nums.size());
		nums.clear();
		System.out.println("크기 : " + nums.size());
	}

}
