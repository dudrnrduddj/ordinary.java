package org.ordinary.day04.control.loop.exercise;

public class Exercise_ForDouble3 {

	public static void main(String[] args) {
//		2단을 세로로 출력, 그 옆에 3단 세로로 출력,
//		그 옆에 4단 세로로 출력
		
		for(int i = 1; i <= 9; i++) {
			for(int dan = 2; dan <= 4; dan++) {
				int result = dan * i;
//				if(result >= 10) {
//					System.out.printf("%d * %d = %d  ", dan, i, result);					
//				}else {
//					System.out.printf("%d * %d = %d   ", dan, i, result);
//				}
				System.out.printf("%d * %d = %d\t", dan, i, result);
//				\t => tab키만큼 띄움 => 균일한 띄어쓰기 가능							
				
			}
			System.out.println();
		}
	}
}