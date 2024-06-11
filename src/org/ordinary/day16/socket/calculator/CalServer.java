package org.ordinary.day16.socket.calculator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class CalServer {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		int port = 9999;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null; // 보조스트림
		DataOutputStream dos = null; // 보조스트림
		
		try {
			serverSocket = new ServerSocket(port);
			System.out.println("연결을 기다리고 있습니다..");
			socket = serverSocket.accept();
			System.out.println("연결이 완료되었습니다.");
			is = socket.getInputStream(); // 클라이언트에서 서버로
			os = socket.getOutputStream(); // 서버에서 클라이언트로 
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			while(true) {
				String recvMsg = dis.readUTF();
				String[] parts = recvMsg.split(" "); // 계산식 받아와서 띄어쓰기를 기준으로 나누어 배열에 저장
				int num1 = Integer.parseInt(parts[0]);
				int num2 = Integer.parseInt(parts[2]);
				String operator = parts[1];
				String result = "";
				switch (operator) {
				case "+":
					result = num1 + num2+"";
					break;
				case "-":
					result = num1 - num2+"";
					break;
				case "*":
					result = num1 * num2+"";
					break;
				case "/":
					result = num1 / num2+"";
					break;
				case "%":
					result = num1 % num2+"";
					break;
				default:
					break;
				}	
				dos.writeUTF(result);
				dos.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
