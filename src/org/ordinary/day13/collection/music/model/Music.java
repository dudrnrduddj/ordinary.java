package org.ordinary.day13.collection.music.model;

public class Music implements Comparable<Music>{
	// 곡명, 가수명 (title, singer)
	
	private String title;
	private String singer;
	
	public Music() {}
	
	public Music(String title, String singer) {
		this.title = title;
		this.singer = singer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	@Override
	public int compareTo(Music o) {
		
		return this.title.compareTo(o.getTitle()); // 1, 0, -1
	}
	
	// String 클래스는 이미 Comparable<String> 인터페이스를 구현하고 있다.
	// 따라서 String 객체는 기본적으로 CompareTo() 메소드를 사용할 수 있다.
	// 그런데 경우에 따라서 각 클래스에서 implements Comparable<T>를 구현해준 뒤
	// compareTo()메소드를 재정의 해주면 각 객체에서도 메소드를 사용할 수 있게 된다.
	
	// 여기서 중요한건 Collections.sort()메소드 인데 이 메소드는 내부적으로 정렬을 해주는 기능이 있는데
	// 이 안에서 compareTo()메소드를 호출하여 정렬을 해주기 때문에 반드시 compareTo()메소드의 재정의가
	// 필요했던 것이다.
	// -chat gpt-
	// Collections.sort() 메서드는 리스트를 정렬하기 위해 내부적으로 각 객체의 compareTo 메서드를 호출하여 비교합니다.
	
	
	// comparable 인터페이스 vs comparator 인터페이스
	//	위치:
	//Comparable: 클래스 자체에 구현.
	//Comparator: 별도의 클래스에 구현.
		
	//비교 메소드:
	//Comparable: compareTo 메소드.
	//Comparator: compare 메소드.
		
	//유연성:
	//Comparable: 하나의 자연 순서.
	//Comparator: 여러 가지 사용자 정의 순서.
	//	
	
}
