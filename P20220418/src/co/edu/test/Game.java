package co.edu.test;

import java.util.Scanner;

public class Game {
	public static void main(String[] args) {

		// 5개의 배열에 1~5까지 임의 값을 생성
		// 5가 들어있는 배열 위치를 찾는 게임
		// 숫자가 중복으로 들어있으면 안됨
		// 1번째 : 1 => 1번째 배열에 5가 들었으면 맞췄습니다.

		Scanner scn = new Scanner(System.in);

		int[] ary = new int[5];

		for (int i = 0; i < 5; i++) {
			int num = (int) (Math.random() * 5) + 1;
			ary[i] = num;
			System.out.println(ary[i]);
			
			for (int j = 0; j < ary.length; j++) {
				System.out.print(ary[j]);
				if(ary[i] !=  ) {
					
				}
			}

			// num이 중복되지 않게......ㅎ하

		}

	}

}
