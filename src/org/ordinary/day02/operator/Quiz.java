package org.ordinary.day02.operator;

public class Quiz {

	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		int c = (++a) + b; // a=6, b=10, c=16
//		
		int d = c / a; // d=2
		int e = c % a; // e=4
		int f = e++; //f=4
		//e=5
		int g = (--b) + (d--); //b=9, d=2, g=11
		//d=1
		int h = 2;
		int i = a++ + b / (--c / f) * (g-- - d) % (++e + h); //6 + 3 * 10 % 8
// i=12
		System.out.println("a : " + a); // 7
		System.out.println("b : " + b); // 9
		System.out.println("c : " + c); // 15
		System.out.println("d : " + d); // 1
		System.out.println("e : " + e); // 6
		System.out.println("f : " + f); // 4
		System.out.println("g : " + g); // 10
		System.out.println("h : " + h); // 2
		System.out.println("i : " + i); // 12
	}

}
