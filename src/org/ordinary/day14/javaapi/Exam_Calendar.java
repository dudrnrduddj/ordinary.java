package org.ordinary.day14.javaapi;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Exam_Calendar {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance(); // 상속클래스라 new연산자를 사용못해서 내부에서 인스턴스를 얻을수 있도록 메소드 구현되어있음
		
		System.out.println(today);
		System.out.println(today.get(Calendar.YEAR)+"년");
		System.out.println(today.get(Calendar.MONTH)+1+"월"); // 자체적으로 +1 해줘야 한다 함.
		System.out.println(today.get(Calendar.DATE)+"일");
		System.out.println(today.get(Calendar.DAY_OF_MONTH)+"일");		
		System.out.println(today.get(Calendar.HOUR)+"시");	//3시
		System.out.println(today.get(Calendar.HOUR_OF_DAY)+"시"); //15시
		System.out.println(today.get(Calendar.MINUTE)+"분");
		System.out.println(today.get(Calendar.SECOND)+"초");
		System.out.println(today.get(Calendar.MILLISECOND));
		System.out.println(today.get(Calendar.AM_PM)); // 오전 : 0, 오후 : 1
		
		
		
		Calendar startDate = Calendar.getInstance();
		printDate("개강한 날은 ", startDate);
		// 개강한 날은 2024/05/07/화요일(9시) 오전9시00분00초00밀리초

	}
	
	public static void printDate(String msg, Calendar date) {
		SimpleDateFormat trans = new SimpleDateFormat("yyyy/MM/dd/EEEE(h시) a h시 mm분 ss초 SS밀리초");
		String transDate = trans.format(date.getTime());
		System.out.println(msg + transDate);
	}

}
