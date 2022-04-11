package co.edu.variable;

import java.util.Scanner;

public class GetSumAverageMaxValue {

	public static void main(String[] args) {

		//점수를 세개입력
		//합, 평균, 고득점 => 합은 230이고 평균은 76.67이고 최고점은 90점입니다.
		Scanner scn = new Scanner(System.in);
		
		int num1, num2, num3;
		System.out.println("세 개의 점수를 입력하세요");
		num1 = scn.nextInt();
		num2 = scn.nextInt();
		num3 = scn.nextInt();
				
		int sum = num1 + num2 + num3;
		double avg = sum / 3.0;
		int maxValue = num1;
		if (maxValue < num2) {
			maxValue = num2;
		}
		if (maxValue < num3) {
			maxValue = num3;
		}
				
		System.out.printf("합은 %d이고 평균은 %.2f이고 최고점은 %d점입니다.", sum, avg, maxValue);

	}

}
