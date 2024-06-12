package org.ordinary.day17.socket.baseball;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class BaseballServer {

	public static void main(String[] args) {
//		서버소켓을 생성하였습니다.
//		클라이언트의 접속을 기다립니다.

//		클라이언트가 접속했습니다.
//		1 4 5 -> 랜덤
//		서버 준비 완료
//		받기 : 2 3 6
//		받기 : 1 3 6
//		받기 : 1 4 6
//		...

		ServerSocket serverSocket = null;
		Socket socket = null;
		int port = 7777;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		byte strike;
		byte ball;

		try {
			System.out.println("서버소켓을 생성하였습니다.");
			serverSocket = new ServerSocket(port);
			System.out.println("클라이언트의 접속을 기다립니다.");
			socket = serverSocket.accept();
			System.out.println("클라이언트가 접속했습니다.");

			// 게임 셋팅 랜덤 넘버
			String[] nums = new String[3];

			for (int i = 0; i < nums.length; i++) {
				nums[i] = (int) (Math.random() * 9 + 1) + "";
				for(int j = 0; j < i; j++)
					if (nums[i].equals(nums[j])) {
						i--;
						break;
					}
			}
			System.out.print("삼진 : ");
			for(String n : nums) {
				System.out.print(n+" ");
			}
			System.out.println();
			System.out.println("서버 준비완료");
			is = socket.getInputStream();
			dis = new DataInputStream(is);
			os = socket.getOutputStream();
			dos = new DataOutputStream(os);
			while (true) {
				strike = 0;
				ball = 0;
				String recvNums = dis.readUTF();
				System.out.println("받기 : " + recvNums);
				String[] recvNumArray = recvNums.split(" ");

				for (int i = 0; i < nums.length; i++) {
					for (int j = 0; j < recvNumArray.length; j++) {
						if (nums[i].equals(recvNumArray[j]) && i == j) {
							strike++;
							break;
						} else if (nums[i].equals(recvNumArray[j]) && i != j) {
							ball++;
							break;
						}
					}
				}
				
				byte[] strikeInfo = new byte[2];
				strikeInfo[0] = strike;
				strikeInfo[1] = ball;
				
				dos.write(strikeInfo);
				dos.flush();
				if (strike == nums.length) break;
				
			}

		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
