package co.edu.variable;

import java.util.Scanner;
//java.lang

public class IfExample3 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("첫번째 정수를 입력하세요.");
		num1 = scn.nextInt();	//사용자입력값을 읽고 int형 반환
		System.out.println("두번째 정수를 입력하세요.");
		num2 = scn.nextInt();
		
		//System.out.println("입력값은 " + num1 + "입니다.");
		
		//큰 수에서 작은 수를 뺀 결과값을 result에 저장
		//result 출력
		int result;
		if(num1 > num2) {
			result = num1 - num2;
		} else {
			result = num2 - num1;
		}
		System.out.println("차이는 " + result);

	}

}
