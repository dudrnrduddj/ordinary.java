package org.ordinary.cafe;

import java.util.Scanner;

public class View {
	
	
	
	// 메뉴 - 변수
	
	//초기화면 - 메소드
	public int initialScreen() {
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println("◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇");
		System.out.println("◇◆       welcome to the cafe      ◇◆");
		System.out.println("◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇");
		System.out.println("");
		System.out.println("	  1.포장	     2.매장");
		System.out.println();
		System.out.println();
		System.out.println("			  번호를 눌러주세요");
		
		System.out.print("			  선택 : ");
		int orderType = scanner.nextInt();
		System.out.println("◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇");
		return orderType;
	}
	
	// 메뉴 - 메소드
	public int menuScreen(Manage manage) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇");
		System.out.println("◇◆              Menu              ◇◆");
		System.out.println("◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇");
		
		for(int i = 0; i < manage.menu.length; i++) {
			System.out.println("◇  " + manage.menu[i].getName());
			System.out.println("◇  가격 : " + manage.menu[i].getPrice()+"원");
			System.out.println("◇  상품 번호 : " + manage.menu[i].getNum());
			if(i != 2) {
				System.out.println();
			}
		}
		System.out.println("			  번호를 눌러주세요");
		System.out.print("			  선택 : ");
		int itemNum = scanner.nextInt();
		return itemNum;							// itemNum -> 상품정보 저장(index)
	}
	
	
	// 메뉴 디테일 - 메소드
	public Item itemDetailScreen(int itemNum, Manage manage, Item selectedItem) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇");
		System.out.println("◇◆             Option             ◇◆");
		System.out.println("◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇");
		
		System.out.println("◇  " + manage.menu[itemNum-1].getName());
		System.out.println("◇  온도 : 1.Hot 2.Ice" );
		System.out.println("			  번호를 눌러주세요");
		System.out.print("			  선택 : ");
		int iceOrHot = scanner.nextInt();
		System.out.println("◇  사이즈 : 1.Small 2.Large");
		System.out.println("			  번호를 눌러주세요");
		System.out.print("			  선택 : ");
		int cupSize = scanner.nextInt();
		System.out.println("◇  샷 추가: 1.One 2.Two");
		System.out.println("			  번호를 눌러주세요");
		System.out.print("			  선택 : ");
		int addShot = scanner.nextInt();
		
		selectedItem.setItemDetail(iceOrHot, cupSize, addShot);
		
		return selectedItem;
	}

	// 장바구니 메뉴
	public void selectedMenuScreen(Item selectedItem) {
		System.out.println("◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇");
		System.out.println("◇◆              장바구니             ◇◆");
		System.out.println("◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇");
		
		System.out.println("◇ " + selectedItem.getName());
		System.out.println("◇ 가격:\t" + selectedItem.getPrice()+"원");
		System.out.println("◇ 온도:\t" + (selectedItem.getIceOrHot() == 1 ? "Hot":selectedItem.getIceOrHot() == 2 ? "Ice" : "1(Hot) 또는 2(Ice)를 눌러주세요"));
		System.out.println("◇ 사이즈:\t" + (selectedItem.getCupSize() == 1 ? "Small":selectedItem.getIceOrHot() == 2 ? "Large" : "1(Small) 또는 2(Large)를 눌러주세요"));
		System.out.println("◇ 샷추가:\t" + (selectedItem.getAddShot() == 1 ? "One":selectedItem.getIceOrHot() == 2 ? "Two" : "1(One) 또는 2(Two)를 눌러주세요"));
//		System.out.println("                      ◇ 개수 : " + count);
	}

	
	
	//옵션 선택된 거 장바구니에 추가 / 취소
	// 아메리카노
	// 온도 : HOT
	// 사이즈 : Large
	// 샷 추가 : One
	
	// 장바구니 목록 -> 디테일 정보를 받아온 item 배열
	// 장바구니 추가
	// 장바구니 삭제
	// 장바구니 선택취소

	
}















