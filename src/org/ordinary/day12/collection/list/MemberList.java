package org.ordinary.day12.collection.list;

class Member{}

public class MemberList {
	Member [] members;
	int size;
	
	public MemberList() {
		this.members = new Member[3];
		this.size = 0;
	}
		
	public void add(Member member) {
		this.members[this.size] = member;
		this.size++;
	}
	
	public Member get(int index) {
		return this.members[index];
	}
	
	public int size() {
		return this.size;
	}
	
	public void clear() {
		this.members = new Member[3];
		this.size = 0;
	}
	
//	배열의 한계...
//	배열은 1개의 데이터타입에 대해서
//	여러개의 데이터를 넣을 수 있음.
//	-> 1개의 데이터타입에 대해서만 넣을 수 있는 것이 배열의 한계임...
}
