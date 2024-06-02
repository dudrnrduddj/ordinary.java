package org.ordinary.cafe.complete;

public class Item {
		private String name;
		private int price;
		private int num;
		
		private int iceOrHot;
		private int cupSize;
		private int addShot;
		
		
		
		public Item(String name, int price, int num) {
			this.name = name;
			this.price = price;
			this.num = num;
		}

		public String getName() {
			return this.name;
		}

		public int getPrice() {
			return this.price;
		}

		public int getNum() {
			return this.num;
		}
		
		
		public void setItemDetail(int iceOrHot, int cupSize, int addShot) {
			this.iceOrHot = iceOrHot;
			this.cupSize = cupSize;
			this.addShot = addShot;
		}
		
		public int getIceOrHot() {
			return this.iceOrHot;
		}

		public int getCupSize() {
			return cupSize;
		}

		public int getAddShot() {
			return addShot;
		}
		
		
}
