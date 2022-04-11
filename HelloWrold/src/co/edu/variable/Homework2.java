package co.edu.variable;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		
		//영수증
		//물건의 가격과 현금
		//[현금] 10000원
		//[물건가격] 7500원
		//[부가세] 750원
		//[잔돈] 2500원
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("현금 금액을 입력하세요");
		int money = scn.nextInt();
		System.out.println("물건 가격을 입력하세요");
		int product = scn.nextInt();
		int result = 0;
		double surtax;
		
		result = money - product;
		if (result > 0)
		{
			System.out.println("잔돈은 " + result + "입니다.");
		}

		surtax = product / 1.1;
		result = (int) (product - surtax);
		if (result > 0)
		{
			System.out.println("부가세는 " + result + "입니다.");
		}

	}

}
