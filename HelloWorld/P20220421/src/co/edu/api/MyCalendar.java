package co.edu.api;

import java.util.Calendar;

public class MyCalendar {

	public static void main(String[] args) {

		String y = "2020";
		String m = "06";	//"06" 또는 "6" 으로
		
		showCal(y, m);
		
	}
	
	public static void showCal(String year, String month) {
		
		//달력출력
		
		Calendar today = Calendar.getInstance();
		int y = Integer.parseInt(year);
		int m = Integer.parseInt(month);
		today.set(y, m-1);	//에러.......//set() Int형만 받음
		System.out.println(today.get(Calendar.YEAR) + "년" +
				today.get(Calendar.MONTH) + "월");

		String[] days = {"Sun", "Mon", "Tue", "Wed", "Thr", "Fir", "Sat"};
		for(int i=0; i<days.length; i++) {
			System.out.printf("%4s", days[i]);
		}
		
		System.out.println("==============================");
		
		
		
	}

}
