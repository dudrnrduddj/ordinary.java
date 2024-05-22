package org.ordinary.day04.control.loop.exercise;

public class Exercise_ForDouble1 {

	public static void main(String[] args) {
//		*
//		**
//		***
//		****
//		*****
//		******
		
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
