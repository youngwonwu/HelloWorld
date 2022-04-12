package co.edu.condition;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("피자의 종류를 입력하세요");
		String result = scn.nextLine();	//nextLine: 입력한 문자열 출력
		int price = 0;
		switch(result) {
//		case "콤비네이션":
//			price = 20000; break;
//		case "슈퍼슈프림":
//			price = 20000; break;
		case "콤비네이션":
		case "슈퍼슈프림":
			price = 20000; break;
		case "포테이토":
			price = 15000; break;
		case "쉬림프":
			price = 25000; break;
		default :
			price = 0;
		}
		System.out.println("피자 " + result + "의 값은 " + price);
	}

}
