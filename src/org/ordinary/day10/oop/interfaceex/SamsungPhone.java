package org.ordinary.day10.oop.interfaceex;

public class SamsungPhone implements PhoneInterface{

	@Override
	public void printLogo() {
		System.out.println("===== SAMSUNG =====");
		
	}

	@Override
	public void sendcall() {
		System.out.println("===== S-PHONE CALL =====");
		
	}

}
