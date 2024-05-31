package org.ordinary.day11.oop.member;

import java.util.Scanner;

public class ViewMember {

	public int mainMenu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("======회원관리 프로그램======");
		System.out.println("1.회원가입");
		System.out.println("2.회원검색");
		System.out.println("3.회원 전체정보 조회");
		System.out.println("4.회원정보수정");
		System.out.println("5.회원정보삭제");
		System.out.println("0.프로그램 종료");
		System.out.print("메뉴 선택 : ");
		int input = scanner.nextInt();
		return input;
	}

	public void displayMessage(String msg) {
		System.out.println(msg);
	}

	public Member inputMember() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("======회원가입======");
		System.out.print("이름 : ");
		String memberName = scanner.next();
		System.out.print("이메일 : ");
		String memberEmail = scanner.next();
		System.out.print("전화번호 : ");
		String memberPhone = scanner.next();
		scanner.nextLine();
		System.out.print("주소 : ");
		String memberAddress = scanner.nextLine();
		Member member = new Member(memberName, memberEmail, memberPhone, memberAddress);

		return member;
	}
	
	
	public void printAllMembers(Member[] members) {
		System.out.println("======회원 전체정보 출력=======");
		for(Member member : members) {
			if(member != null) {
				System.out.println(member.toString());
			}
		}
	}

	public String inputEmail(String category) {
		Scanner scanner = new Scanner(System.in);
		System.out.print(category + "할 이메일입력 : ");
		String email = scanner.next();
		return email;
	}
	
	

	public void printOneMember(Member member) {
		System.out.println("=======회원 검색 결과=========");
		System.out.println("이름 : " + member.getMemberName());
		System.out.println("이메일 : " + member.getMemberEmail());
		System.out.println("전화번호 : " + member.getMemberPhone());
		System.out.println("주소 : " + member.getMemberAddress());
	}

	public Member modifyMember(String email) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름 : ");
		String memberName = scanner.next();
		System.out.print("전화번호 : ");
		String memberPhone = scanner.next();
		scanner.nextLine();
		System.out.print("주소 : ");
		String memberAddress = scanner.nextLine();
		Member member = new Member(memberName, email, memberPhone, memberAddress);
		
		return member;
	}
	
	public void modifyMember(Member member) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름 : ");
		String memberName = scanner.next();
		System.out.print("전화번호 : ");
		String memberPhone = scanner.next();
		scanner.nextLine();
		System.out.print("주소 : ");
		String memberAddress = scanner.nextLine();
		member.setMemberName(memberName);
		member.setMemberPhone(memberPhone);
		member.setMemberAddress(memberAddress);
	}

	
		
	}
