package co.edu.variable;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		
		//오렌지 127개
		//10개씩 담을 수 있는 상자
		//5개씩 담을 수 있는 상자
		//10개씩 담을 수 있는 상자 ???개,
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("오렌지 개수를 입력하세요");
		int orange, result, box1, box2;
		orange = scn.nextInt();
		result = 0;
		box1 = 10;
		box2 = 5;
		
		result = orange / box1;
		if (result > 0) {
			System.out.println("10개씩 담을 수 있는 상자 : " + result + "개");
		}
		
		orange = orange % box1;
		result = orange / box2;
		if (result > 0) {
			System.out.println("5개씩 담을 수 있는 상자 : " + result + "개");
		}

	}

}
