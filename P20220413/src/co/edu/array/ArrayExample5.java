package co.edu.array;

import java.util.Scanner;

public class ArrayExample5 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		int[] scores = new int[5];
//		for(int i=0; i<scores.length; i++) {
//			System.out.println("학생점수를 입력하세요");
//			scores[i] = scn.nextInt();
//		}

		
		// 학생중에 최고점, 최저점
		for(int i=0; i<scores.length; i++) {
			System.out.println("학생점수를 입력하세요");
			scores[i] = scn.nextInt();
		}
		int maxVal = 0;
		int minVal = scores[0];
		for(int i=0; i<scores.length; i++) {
			if(maxVal < scores[i]) {
				maxVal = scores[i];
			}
			if(minVal > scores[i]) {
				minVal = scores[i];
			}
		}
		System.out.println("최고점은 " + maxVal + ", 최저점은 " + minVal + "입니다.");
		
	}

}
