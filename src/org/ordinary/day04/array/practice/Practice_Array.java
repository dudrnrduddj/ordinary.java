package org.ordinary.day04.array.practice;

import java.util.Scanner;

public class Practice_Array {

	public void practice1() {
		//길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여 
		//순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요. 
		int[] nums = new int[10];
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = i + 1;
			System.out.print(nums[i]+" ");
		}
	}

	public void practice2() {
		//길이가 10인 배열을 선언하고 1부터 10까지의 값을 
		//반복문을 이용하여 역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요. 
		int[] nums = new int[10];
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = 10 - i;
			System.out.print(nums[i] + " ");
		}
	}

	public void practice3() {
		//사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고 
		//1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요. 
		Scanner scanner = new Scanner(System.in);
		System.out.print("배열의 크기를 정해주세요 : ");
		int numsLength = scanner.nextInt();
		
		int[] nums = new int[numsLength];
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = i + 1;
			System.out.print(nums[i]+" ");
		}
	}

	public void practice4() {
		//길이가 5인 String배열을 선언하고 
		//“사과”, “귤“, “포도“, “복숭아”, “참외“로 초기화 한 후 배열 인덱스를 활용해서 귤을 출력하세요. 
		String[] fruits = new String[5];
//		String[] fruits = {"사과","귤","포도","복숭아","참외"};
		
//		
//		fruits[0] = "사과";
//		fruits[1] = "귤";
//		fruits[2] = "포도";
//		fruits[3] = "복숭아";
//		fruits[4] = "참외";
		
		System.out.println(fruits[1]);
	}

	public void practice5() {
		//문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 
		//들어가 있는지 개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
		Scanner scanner = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = scanner.next();
		int count = 0;
		
		
		System.out.print("찾을 문자 : ");
		char findChar = scanner.next().charAt(0);
		
		System.out.printf("%s에 %s가 존재하는 위치(인덱스) : ", str, findChar);
		
		char[] charArr = new char[str.length()];
		
		for(int i = 0; i < str.length(); i++) {
			charArr[i] = str.charAt(i);
			if(findChar == charArr[i]) {
				count++;
				System.out.print(i+ " ");
			}
		}
		System.out.println();
		System.out.println(findChar + " 개수 : " + count);
	}

	public void practice6() {
		//“월“ ~ “일”까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아 
		//입력한 숫자와 같은 인덱스에 있는 요일을 출력하고 
		//범위에 없는 숫자를 입력 시 “잘못 입력하셨습니다“를 출력하세요.
		String[] weekends = {"월", "화", "수", "목", "금", "토", "일"};
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = scanner.nextInt();
		
		if(num >= 0 && num <=6) {
			System.out.println("해당 인덱스의 요일은 "+weekends[num] + "요알 입니다.");
		}else {
			System.out.println("잘못 입력하셨습니다");
		}
	}

	public void practice7() {
		// 사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고 배열의 크기만큼 
		// 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
		// 그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요. 
		int sum = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = scanner.nextInt();
		
		int[] nums = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			int value = scanner.nextInt();
			nums[i] = value;
			sum = nums[i] + sum;
		}
		for(int i = 0; i < num; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		System.out.print("총합 : " + sum);
	}

	public void practice8() {
		//3이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고
		//, 중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요. 
		//단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고 다시 정수를 받도록 하세요.
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		int[] arr;

		while(num < 3|| num % 2 == 0) {
			System.out.print("3이상의 홀수 자연수를 입력하세요 : ");
			num = scanner.nextInt();
			arr = new int[num];
			
			if(num < 3 || num % 2 == 0) {
				System.out.println("다시 입력하세요");
			}else {
				int j = 0;
				for(int i = 0; i < num; i++) {
					if(i < (num+1)/2) {
						System.out.print(j+1+", ");
						j++;
					}else {
						j--;
						if(i == num-1) {
							System.out.print(j);
						}else {						
							System.out.print(j + ", ");
						}
					}
				}
				break;
			}
		}
	}

	public void practice9() {
		//사용자가 입력한 값이 배열에 있는지 검색하여 
		//있으면 “OOO 치킨 배달 가능“, 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요. 
		//단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.
		Scanner scanner = new Scanner(System.in);

		String[] menu = {"치킨1","치킨2","치킨3","치킨4"};

		int count = 0;
		String name;
		
		while(count < 1) {
			System.out.print("치킨 이름을 입력하세요 : ");
			name = scanner.next();
			
			for(int i = 0; i < menu.length; i++) {
				if(menu[i].equals(name)) {
					System.out.println(name + " 치킨 배달 가능");
					count++;
					break;
				}	
			}
			
			if(count < 1) {
				System.out.println(name+" 치킨은 없는 메뉴입니다.");
			}
		}
	}

	public void practice10() {
		//주민등록번호 성별자리 이후부터 *로 가리고 출력하세요.
		//단, 원본 배열 값은 변경 없이 배열 복사본으로 변경하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
		String idNum = sc.next();
		
		char [] idNums = new char[idNum.length()];
		
		for(int i = 0; i < idNums.length; i++) {
			idNums[i] = idNum.charAt(i);
		}
		
		char[] copy = new char[idNums.length];	// 새로운 배열을 생성시키는게 핵심!!
//		char[] copy = idNums;	// 이렇게 할 경우 참조값을 복사하므로 두 배열이 동일한 배열을 가리키게 되어
//								   데이터의 수정 시 원하지않는 값의 변화가 일어날 수 있음.
		
		for(int i = 0; i < copy.length; i++) {
			if(i < 8) {
				copy[i] = idNums[i];				
			}else {
				copy[i] = '*';
			}
		}
		
		
		for(char c : copy) {		// for-each문 활용
			System.out.print(c);
		}
	}

	public void practice11() {
		// 로또 번호 자동 생성기 프로그램을 작성하는데 중복 값 없이 오름차순으로 정렬하여 출력하세요.
int[] num = new int[6];
		
		
		for(int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random()*45) + 1;

			for(int j = 0; j < i; j++) {	
				if(num[i] == num[j]) {
					i--;
					break;
				}
			}
		}
		
		for(int i = 0; i < num.length; i++) {
			for(int j = i+1; j < num.length; j++) {
				if(num[i] > num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		

		
		System.out.print("로또 번호 : ");
		
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}

	public void practice12() {
		//문자열을 입력 받아 문자열에 
		//어떤 문자가 들어갔는지 배열에 저장하고 문자의 개수와 함께 출력하세요. 
		Scanner scanner = new Scanner(System.in);

		System.out.print("문자열 : ");
		String str = scanner.next();
		
		char[] charArr = new char[str.length()];
		
		System.out.print("문자열에 있는 문자 : ");
		
		for(int i = 0; i < str.length(); i++) {
			
			for(int j = 0; j < str.length(); j++) {
				
				if(charArr[i] == charArr[j]) {
					if(i < j || i > j) {
						charArr[i] = str.charAt(i);				
					}	
				}else {
					charArr[i] = str.charAt(i);
				}
			}
			

		}
		
		for(int i = 0; i < charArr.length; i++) {
			if(i == str.length() - 1) {
				System.out.println(charArr[i]);
			}else {
				System.out.print(charArr[i] + ", ");				
			}
		}
		System.out.print("문자 개수 : " + charArr.length);
		
	}

}
