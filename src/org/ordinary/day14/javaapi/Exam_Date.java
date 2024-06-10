package org.ordinary.day14.javaapi;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Exam_Date {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		// SimpleDateFormat 객체 생성
		// 형식문자의 대/소문자 의미 다르니 주의!
		SimpleDateFormat trans1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		SimpleDateFormat trans2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss:SS");
		// format메소드 활용
		String transDate1 = trans1.format(date);
		String transDate2 = trans2.format(date);
		System.out.println("형식 변환1 : " + transDate1);
		System.out.println("형식 변환2 : " + transDate2);
		
		Calendar calendar; //  나라마다 달력의 표현이 다르므로 추상클래스로 만듬
		
		calendar = new GregorianCalendar(); // Calendar를 상속받고 있는 클래스 중 하나
		System.out.println(calendar.getTime());
		String changed = trans1.format(calendar.getTime());
		System.out.println("GregorianCalendar 날짜 변환 : " + changed);
		
		
		
		
	}
}
