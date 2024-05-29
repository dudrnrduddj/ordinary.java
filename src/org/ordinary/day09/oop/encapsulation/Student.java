package org.ordinary.day09.oop.encapsulation;

public class Student {
	private String name;
	private int score1;
	private int score2;
	
	public Student(String name, int score1, int score2) {
		this.name = name;
		this.score1 = score1;
		this.score2 = score2;
	}	
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setScore1(int score) {
		this.score1 = score;
	}
	public void setScore2(int score) {
		this.score2 = score;
	}
	//getter
	public String getName() {
		return this.name;
	}
	public int getScore1() {
		return this.score1;
	}
	public int getScore2() {
		return this.score2;
	}
		
}
