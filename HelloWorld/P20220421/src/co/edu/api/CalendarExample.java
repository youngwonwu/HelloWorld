package co.edu.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
//import java.sql.Date;
import java.util.Calendar;
import java.util.Date;

public class CalendarExample {

	public static void main(String[] args) {

//		Calendar today = Calendar.getInstance();
//		
//		today.set(2021, 1, 1);	//특정 날짜 구하기			//상수필드
//		System.out.println("년도: " + today.get(Calendar.YEAR));
//		System.out.println("월: " + today.get(Calendar.MONTH));	//월은 0월부터 시작함
//		System.out.println("일: " + today.get(Calendar.DAY_OF_MONTH));
//		System.out.println("요일: " + today.get(Calendar.DAY_OF_WEEK));
//		System.out.println("마지막날: " + today.getActualMaximum(Calendar.DATE));
		
		int year = 2020;
		int month = 5;
		
		Calendar today = Calendar.getInstance();
		today.set(year, month-1, 1);
		System.out.println("년도: " + today.get(Calendar.YEAR));
		System.out.println("월: " + today.get(Calendar.MONTH));	//월은 0월부터 시작함
		System.out.println("일: " + today.get(Calendar.DAY_OF_MONTH));
		System.out.println("요일: " + today.get(Calendar.DAY_OF_WEEK));
		System.out.println("마지막날: " + today.getActualMaximum(Calendar.DATE));
		
		System.out.println("----------------------------------------------------------------------");
		
		Date todate = new Date();	//import Calendar;
		todate = new Date("2021/05/05");
		todate.setYear(2022);	//1900+2022 => 3992
		System.out.println(todate.toString());
		
		System.out.println("----------------------------------------------------------------------");
		
		LocalDate ldate = LocalDate.of(2022, 10, 10);
		System.out.println(ldate.toString());
		
		System.out.println("----------------------------------------------------------------------");
		
		LocalTime ltime = LocalTime.of(10, 10, 10);
		System.out.println(ltime.toString());
		
		System.out.println("----------------------------------------------------------------------");
		
//		LocalDateTime ldt = LocalDateTime.now();
//		System.out.println(ldt.toString());
		
//		LocalDateTime ldt = LocalDateTime.now();
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");	//DateTimeFormatter 형식에 맞춰 쓰고 싶으면
//		System.out.println(ldt.format(dtf));
		
		LocalDateTime ldt = LocalDateTime.now();
		ldt = LocalDateTime.of(2022, 10, 5, 10, 20, 30);	//2022년 10월 5일 10시 20분 30초
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");	//DateTimeFormatter 형식에 맞춰 쓰고 싶으면
		System.out.println(ldt.format(dtf));
		
	}

}
