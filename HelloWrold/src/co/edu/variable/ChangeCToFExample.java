package co.edu.variable;

import java.util.Scanner;

public class ChangeCToFExample {

	public static void main(String[] args) {
		
		//Scanner 클래스를 활용
		//화씨 온도를 입력하면 섭씨 온도를 계산 출력
		//소수 첫번째 자리까지만 출력
		//섭씨온도 <--> 화씨온도
		
		Scanner scn = new Scanner(System.in);
		
		int f;
		System.out.println("화씨온도를 입력하세요.");
		f = scn.nextInt();
		double c = 5/9.0 * (f-32);
		System.out.printf("화씨온도 %d 섭씨온도는 %.1f 입니다.", f, c);

	}

}
