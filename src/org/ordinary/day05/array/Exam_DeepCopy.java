package org.ordinary.day05.array;

public class Exam_DeepCopy {

	public static void main(String[] args) {
//		배열 복사 중 깊은 복사
		int[] arrs = {0, 1, 4, 9};
		int[] copy = new int[4];	// new연산자로 배열 생성
		
		for(int i = 0; i < arrs.length; i++) {
			copy[i] = arrs[i];
		}
		
		copy[1] = 11;		// arrs와 copy는 아예 다른 주소값을 가진 배열을 가리키기 때문에
							// copy배열의 값을 변경해도 arrs에는 전혀 지장이 없다.
		for(int i : copy) {
			System.out.print(i + " ");
		}
		System.out.println();
		for(int i : arrs) {
			System.out.print(i + " ");
		}
		
	}

}
