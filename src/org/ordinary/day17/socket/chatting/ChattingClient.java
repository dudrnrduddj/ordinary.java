package org.ordinary.day17.socket.chatting;

import java.io.*;
import java.net.*;
import java.util.*;

public class ChattingClient {
	public static void main(String[] args) {
		// address를 192.168.60.214(희준 ip주소)로 주면 서버로 통신 가능
		String address = "127.0.0.1";
		int port = 9999;
		Socket socket = null;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		try {
			socket = new Socket(address, port);
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			System.out.println("서버와 연결이 완료되었습니다.");
			while(true) {
				String recvMsg = dis.readUTF();
				if("end".equals(recvMsg)) break;
				System.out.println("서버(상대) >> " + recvMsg);
				System.out.print("클라이언트(나) >> ");
				String sendMsg = scanner.nextLine();
				dos.writeUTF(sendMsg);
				dos.flush();
				if("end".equals(sendMsg)) break;
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
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
