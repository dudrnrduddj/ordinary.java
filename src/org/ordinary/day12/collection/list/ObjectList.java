package org.ordinary.day12.collection.list;

public class ObjectList {
	Object[] objects;
	int size;
	
	public ObjectList() {
		objects = new Object[3];
		size = 0;
	}
	
	public void add(Object object) {
		objects[size] = object;
		size++;
	}
	
	public Object get(int index) {
		return this.objects[index];
	}
	
	public int size() {
		return this.size;
	}
	
	public void clear() {
		objects = new Object[3];
		size = 0;
	}
}
