package org.ordinary.day12.collection.set;

public class Student {
	// 이름
	// 점수1
	// 점수2
	private String name;
	private int score1;
	private int score2;
	
	public Student() {}
	
	public Student(String name, int score1, int score2) {
		this.name = name;
		this.score1 = score1;
		this.score2 = score2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore1() {
		return score1;
	}

	public void setScore1(int score1) {
		this.score1 = score1;
	}

	public int getScore2() {
		return score2;
	}

	public void setScore2(int score2) {
		this.score2 = score2;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", score1=" + score1 + ", score2=" + score2 + "]";
	}
	
	@Override
	public int hashCode() {
		return (this.name+this.score1+this.score2).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
//			return this.hashCode() == std.hashCode();
			if(this.name.equals(std.name) && this.score1 == std.score1 && this.score2 == std.score2) {
				return true;
			}
			else {
				return false;
			}
		}else {
			return false;
		}
	}
}


