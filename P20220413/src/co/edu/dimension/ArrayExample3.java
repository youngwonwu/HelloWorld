package co.edu.dimension;

import java.util.Scanner;

public class ArrayExample3 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		// 변수 vs 배열
		// 변수활용
		int num1, num2, num3, num4;
		System.out.println("첫번째 값입력하기");
		num1 = scn.nextInt();
		System.out.println("두번째 값입력하기");
		num2 = scn.nextInt();
		System.out.println("세번째 값입력하기");
		num3 = scn.nextInt();
		System.out.println("네번째 값입력하기");
		num4 = scn.nextInt();

		// 배열 반복 , 안된다..............
		int[] intAry = { num1, num2, num3, num4 };

		for (int j = 0; j < intAry.length - 1; j++) {
			for (int i = 0; i < intAry.length - 1; i++) {
				if (intAry[i] > intAry[i + 1]) {
					int temp = intAry[i];
					intAry[i] = intAry[i + 1];
					intAry[i + 1] = temp;
				}
			}
			System.out.println(intAry[0] + ", " + intAry[1] + ", " + intAry[2] + ", " + intAry[3]);
		}

		// 제일 작은 수 ~ 제일 큰 수의 순으로 출력 , 내가 해보기!!!!!!!!!!!!!!!!!
//		if (num1 > num2) {
//			if (num2 > num3) {
//				System.out.println(num3 + num2 + num1);
//			} else {
//				if (num1 > num3) {
//					System.out.println(num2 + num3 + num1);
//				}
//			}
//		} else {
//
//		}

	}

}
