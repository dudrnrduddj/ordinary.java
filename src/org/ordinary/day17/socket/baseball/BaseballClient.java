package org.ordinary.day17.socket.baseball;

import java.io.*;
import java.net.*;
import java.util.*;

public class BaseballClient {

	public static void main(String[] args) {
//		클라이언트 소켓을 생성하였습니다.

//		게임 준비 완료
//		숫자 입력(띄어쓰기로 구분) ex) 1 2 3
//		--> 2 3 6
//		0스트라이크 0볼
//		숫자 입력(띄어쓰기로 구분) ex) 1 2 3
//		--> 1 3 6
//		1스트라이크 0볼
//		숫자 입력(띄어쓰기로 구분) ex) 1 2 3
//		--> 1 4 6
//		2스트라이크 0볼
//		숫자 입력(띄어쓰기로 구분) ex) 1 2 3
//		--> 4 5 1
//		0스트라이크 3볼
//		숫자 입력(띄어쓰기로 구분) ex) 1 2 3
//		--> 1 4 5
//		3스트라이크 0볼
//		아웃! 게임종료!

		int port = 7777;
		Socket socket = null;
		String address = "127.0.0.1";
		Scanner scanner = new Scanner(System.in);
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;

		try {
			socket = new Socket(address, port);
			System.out.println("클라이언트 소켓을 생성하였습니다.");
			System.out.println();
			System.out.println("게임 준비 완료");
			os = socket.getOutputStream();
			dos = new DataOutputStream(os);
			is = socket.getInputStream();
			dis = new DataInputStream(is);
			while (true) {
				System.out.println("숫자 입력(띄어쓰기로 구분) ex) 1 2 3");
				System.out.print("--> ");
				String sendNums = scanner.nextLine();

				dos.writeUTF(sendNums);

				byte[] strikeInfo = new byte[2];
				dis.read(strikeInfo);
				int strike = (int) strikeInfo[0];
				int ball = (int) strikeInfo[1];

				System.out.printf("%d스트라이크 %d볼\n", strike, ball);
				if(strike == 3) {
					System.out.println("아웃! 게임종료!");
					break;
				}
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
