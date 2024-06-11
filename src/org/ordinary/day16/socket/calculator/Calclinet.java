package org.ordinary.day16.socket.calculator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Calclinet {
	public static void main(String[] args) {
		Socket socket = null;
		String address = "127.0.0.1";
		int port = 9999;
		OutputStream os = null;
		InputStream is = null;
		DataOutputStream dos = null; // 보조스트림
		DataInputStream dis = null;
		Scanner scanner = new Scanner(System.in);
		
		try {
			socket = new Socket(address, port);
			System.out.println("서버와의 연결이 완료되었습니다..");
//			socket.getInputStream();	// 서버에서 클라이언트로
			os = socket.getOutputStream();	// 클라이언트에서 서버로
			is = socket.getInputStream();
			dos = new DataOutputStream(os);
			dis = new DataInputStream(is);
			while(true) {
				System.out.print("계산식(빈칸으로 띄어 입력, 예 24 + 32) >> ");
				String sendMsg = scanner.nextLine();
				dos.writeUTF(sendMsg);
				String recvMsg = dis.readUTF();
				System.out.println("계산결과 : " + recvMsg);				
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				socket.close();
				os.close();
				dos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
