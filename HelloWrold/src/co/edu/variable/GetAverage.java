package co.edu.variable;

import java.util.Scanner;

public class GetAverage {

	public static void main(String[] args) {
		
		//입력값을 num1, num2, num3
		Scanner scn = new Scanner(System.in);
		
		//정수 연산 => 정수 10, 15, 15 => 40/3 => 13
		//							  40/3.0 => 13.333...
//		double avg;
		
		//결과값 : 입력한 세 정수는 10, 15, 15이고 평균은 13.333... 입니다.
//		int num1, num2, num3;
//		
//		System.out.println("첫번째 정수를 입력하세요");
//		num1 = scn.nextInt();
//		System.out.println("두번째 정수를 입력하세요");
//		num2 = scn.nextInt();
//		System.out.println("세번째 정수를 입력하세요");
//		num3 = scn.nextInt();
//		avg = ( num1 + num2 + num3 ) / 3.0;
//		System.out.println("결과값 : 입력한 세 정수는 " + num1 + ", " + num2+ ", " + num3 + "이고 평균은 " + avg + "입니다.");
		
		
//		int age = 10;
//		String myName = "홍길동";
//		double avg = 40 / 3.0;
//		System.out.printf("이름은 %3s이고 평균은 %.2f이고 나이는 %2d", myName, avg, age);	//책 P90,91

		
		int num1, num2, num3;
		System.out.println("첫번째 정수를 입력하세요");
		num1 = scn.nextInt();
		System.out.println("두번째 정수를 입력하세요");
		num2 = scn.nextInt();
		System.out.println("세번째 정수를 입력하세요");
		num3 = scn.nextInt();
		double avg = ( num1 + num2 + num3 ) / 3.0;
		System.out.printf("결과값 : 입력한 세 정수는 %2d, %2d, %2d이고 평균은 %.3f입니다.", num1, num2, num3, avg);

	}

}
