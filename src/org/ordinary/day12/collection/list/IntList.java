package org.ordinary.day12.collection.list;

public class IntList {
	int[] nums;
	int size;
	
	public IntList() {
		this.nums = new int[3];
		this.size = 0;
	}
	
	public void add(int num) {
		this.nums[size] = num;
		this.size++;
	}
	
	public int get(int index) {
		return this.nums[index];
	}
	
	public int size() {
		return this.size;
	}
	
	public void clear() {
		// 1. for문 돌면서 초기화
		// 2. 배열 자체 초기화
		nums = new int[3];
		size = 0;
	}
	
	
}
