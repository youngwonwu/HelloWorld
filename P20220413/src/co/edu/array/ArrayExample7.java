package co.edu.array;

public class ArrayExample7 {

	public static void main(String[] args) {

//		int lnth = 30;
//		int[] intAry = new int[lnth];
//		
//		for(int i=0; i<intAry.length; i++) {
//			intAry[i] = i + 1;
//		}
//		
////		for(int i=0; i<intAry.length; i++) {
////			System.out.printf("%3d", intAry[i]);
////		}
//		for(int i=0; i<intAry.length; i++) {
//			if(i%7 == 0) {
//				System.out.println();
//			}
//			System.out.printf("%3d", intAry[i]);
//		}
		
		
		String[] days = {"Sun", "Mon", "Tue", "Wed", "Thr", "Fir", "Sat"};
		int month = 6;	// 몇월
		//int lnth = 31;
		int lnth = getLastDay(month);
		int[] intAry = new int[lnth];
		
		//배열값을 지정
		for(int i=0; i<intAry.length; i++) {
			intAry[i] = i + 1;
		}
		
		//요일출력
		for(int i = 0; i<days.length; i++) {
			System.out.printf("%4s", days[i]);
		}
		
		System.out.println();	//줄바꿈
		
//		int spaces = 5;	//이번달 기준으로 공란 5개
		int spaces = getDayInfo(month);
		for(int i = 0; i < spaces; i++) {
			System.out.printf("%4s", "*");
		}
		
		//날짜 출력
		for(int i=0; i<intAry.length; i++) {
			System.out.printf("%4d", intAry[i]);
			if((i+spaces) % 7 == 6) {	//?????????
				System.out.println();	//줄바꿈
			}
			
		}
	}	// main메소드 끝

	public static int getLastDay(int mouth) {
		switch(mouth) {
		case 1:
			return 31;	//마지막날짜
		case 2:
			return 28;
		case 3:
			return 31;
		case 4:
			return 30;
		case 5:
			return 31;
		case 6:
			return 30;
		case 7:
			return 30;
		case 8:
			return 31;
		case 9:
			return 30;
		case 10:
			return 30;	//마지막날짜
		case 11:
			return 31;
		case 12:
			return 30;
		default:
			return 0;
		}
	}
	
	public static int getDayInfo(int mouth) {
		switch(mouth) {
		case 1:
			return 6;
		case 2:
			return 2;
		case 3:
			return 2;
		case 4:
			return 5;	//빈 공간, 요일정보
		case 5:
			return 0;
		case 6:
			return 3;
		case 7:
			return 30;
		case 8:
			return 31;
		case 9:
			return 30;
		case 10:
			return 30;	//마지막날짜
		case 11:
			return 31;
		case 12:
			return 30;
		default:
			return 0;
		}
	}
}
