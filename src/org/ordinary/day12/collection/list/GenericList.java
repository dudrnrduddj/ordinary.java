package org.ordinary.day12.collection.list;

public class GenericList<T> {
	Object[] objects;
	int size;
	
	public GenericList() {
		objects = new Object[3];
		size = 0;
	}
	
	public void add(T object) {
		objects[size] = object;
		size++;
	}
	
	
	public T get(int index) {
		return (T)objects[index];
	}
	
	
	public int size() {
		return this.size;
	}
	
	public void clear() {
		objects = new Object[3];
		size = 0;
	}
}
