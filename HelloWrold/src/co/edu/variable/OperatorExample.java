package co.edu.variable;

import java.util.Scanner;

public class OperatorExample {

	public static void main(String[] args) {
		
		//나머지 : %
		//6/4 => 몫 : 1, 나머지 2
//		int result = 6 / 4;
//		int result2 = 6 % 4;
//		
//		int value = 5;
//		if (value % 2 == 0) {
//			System.out.println("짝수입니다.");
//		} else {
//			System.out.println("홀수입니다.");
//		}
		
		
		//75300원
		//5만원 => ?개, 1만원 => ?개, 5천원 => ?개
		//1천원 => ?개, 5백원 => ?개, 1백원 => ?개
		//75300원 5만원 1개, 1만원 2개, 5천원 1개, 1백원 3개
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("금액을 입력하세요");
		int money = scn.nextInt();
		int result;
		int fiftyth = 50000;
		int tenth = 10000;
		int fiveth = 5000;
		int hundred = 100;
		
		result = money / fiftyth;
		if (result > 0) {
			System.out.println("오만원권" + result + "매");
		}
		money = money % fiftyth;
		result = money / tenth;
		if (result > 0) {
			System.out.println("만원권" + result + "매");
		}
		money = money % tenth;
		result = money / fiveth;
		if (result > 0) {
			System.out.println("오천원권" + result + "매");
		}
		money = money % fiveth;
		result = money / hundred;
		if (result > 0) {
			System.out.println("백원" + result + "개");
		}

	}

}
