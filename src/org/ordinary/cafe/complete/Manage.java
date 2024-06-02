package org.ordinary.cafe.complete;

public class Manage {
	// 초기화면 - 변수
	private int orderType;
	private int itemNum;
	Item[] menu;
	Item[] selectedMenu; // 장바구니
	private int selectedItemIndex; // 장바구니 인덱스
	
	public Manage() {
		menu = new Item[3];
		selectedMenu = new Item[5];
		selectedItemIndex = 0;
		menu[0] = new Item("아메리카노", 2000, 1);
		menu[1] = new Item("콜드브루", 3000, 2);
		menu[2] = new Item("카페라떼", 3500, 3);
	}
	
	public void insertselectedItem(Item selectedItem) {
		if(this.selectedItemIndex < this.selectedMenu.length) {
			selectedMenu[this.selectedItemIndex] = selectedItem;
			this.selectedItemIndex++;
		}
	}
	
	

	
	
	public int getSelectedItemIndex() {
		return selectedItemIndex;
	}
	
	
	public void setOrderType(int orderType) {
		this.orderType = orderType;
	}
}
