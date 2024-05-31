package org.ordinary.day11.oop.member;

public class ManageMember {

	Member[] members;
	int index;
	
	//필드 초기화를 생성자에서
	public ManageMember() {
		members = new Member[5];
		index = 0;
	}
	
	// 회원 정보 저장
	public void insertMember(Member member) {
		if(index < members.length) {
			members[index] = member;
			index++;
		}
	}
	
	public Member [] getAllMembers() {
		return members;
	}
	
	public Member searchOneByEmail(String email) {
		for(Member member : members) {
			if(member != null && email.equals(member.getMemberEmail())) {
				return member;
			}
		}
		return null;
	}

	public void deleteAllMembers() {
		// 다지운다는 건 비우는 것, 배열을 비운다
		// 어떻게 비울까? 배열을 어떻게 비울까?
		// 초기상태로 만들기
		members = new Member[5];
		index = 0;
		
//		for(Member member : members) {
//			member = null;
//		}
		
	}

	public void updateMember(Member member) {
		int i = 0;
		for(Member mOne : members) {
			if(mOne != null) {
				String memberEmail = mOne.getMemberEmail();
				if(memberEmail.equals(member.getMemberEmail())) {
					members[i] = member;
				}
			}
			i++;
		}
	}
}
