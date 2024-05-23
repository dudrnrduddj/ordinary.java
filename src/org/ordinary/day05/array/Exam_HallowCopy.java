package org.ordinary.day05.array;

public class Exam_HallowCopy {

	public static void main(String[] args) {
		
//		배열의 복사 중 얕은 복사
		int[] arrs = new int[4];
		for(int i = 0; i < arrs.length; i++) {
			arrs[i] = i*i;
		}
		
		//for-each문
		int[] copy = arrs;
		copy[1] = 11;			// copy의 두번째 값 변경
								

		for(int a : arrs) {		// arrs배열 출력 => copy의 값을 변경했지만 그 주소가 가리키는 곳의 배열 값을 변경한 것이므로
//								arrs의 두번째 값이 변경된 것이라 할 수 있음
			System.out.print(a + " ");
		}
		
		System.out.println();

		for(int s : copy) {		//copy배열 출력
			System.out.print(s+" ");
		}
		
		
	}

}
