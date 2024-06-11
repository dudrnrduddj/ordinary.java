package org.ordinary.day16.socket.calculator.practice;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Practice_CalClient {
	public static void main(String[] args) {
		Socket socket = null;
		int port = 7777;
		String address = "127.0.0.1";
		OutputStream os = null;
		InputStream is = null;
		DataOutputStream dos = null;
		DataInputStream dis = null;
		Scanner scanner = new Scanner(System.in);
		try {
			socket = new Socket(address, port);
			System.out.println("서버와의 연결이 완료되었습니다.");
			os = socket.getOutputStream();
			System.out.println(socket);
			dos = new DataOutputStream(os);
			is = socket.getInputStream();
			dis = new DataInputStream(is);
			while(true) {
				System.out.print("계산식(빈칸으로 띄어 입력, 예 24 + 32) >> ");
				String sendMsg = scanner.nextLine();
				dos.writeUTF(sendMsg);
				dos.flush();
				if("exit".equals(sendMsg)) break;
				String resultMsg = dis.readUTF();
				System.out.println("계산결과 : " + resultMsg);				
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				is.close();
				os.close();
				socket.close();
				dis.close();
				dos.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
