package org.ordinary.cafe.complete;

public class Run {

	public static void main(String[] args) {
		
		View view = new View();
		Manage manage = new Manage();
		
		
			int orderType = view.initialScreen();	// 초기화면에서 ordertype return
			manage.setOrderType(orderType);	// 그 값 private변수에 저장
			
			// orderType 에따른 메뉴창 
			switch (orderType) {
			case 1:
				
				
				int itemNum = view.menuScreen(manage);	// itemNum 저장 (상품 인덱스), 상품상세정보 창 + 정보 저장
				Item selectedItem = new Item(manage.menu[itemNum-1].getName(), manage.menu[itemNum-1].getPrice(), manage.menu[itemNum-1].getNum());
				
				
				selectedItem = view.itemDetailScreen(itemNum, manage, selectedItem); 
				// 각 item에 디테일정보 초기화 및 새로운 객체배열에 장바구니상품 추가
				manage.insertselectedItem(selectedItem);; // 장바구니 상품 개수 증가
				
				
				view.selectedMenuScreen(selectedItem);	// 장바구니 스크린
				break;
				
			case 2:
				view.menuScreen(manage);
				break;

			default:
				System.out.println("1(포장) 또는 2(매장)를 눌러주세요");
				break;
			}
		
	
	
	
	}

}
