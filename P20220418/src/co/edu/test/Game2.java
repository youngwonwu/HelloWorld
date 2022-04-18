package co.edu.test;

import java.util.Scanner;

public class Game2 {

	public static void main(String[] args) {

//		System.out.println("[*] [*] [*] [*] [*]");
//		System.out.println("[4] [*] [*] [*] [*]");
		
		Scanner scn = new Scanner(System.in);
		int[] problem = new int[5];
		
		
		for(int i=0; i<5; i++) {
			int random = (int) ((Math.random() * 5) + 1);
			
			for(int j=0; j<i; j++) {	//중복값 빼기
				if(problem[i] == problem[j]) {
					i--;
				}
			}
			problem[i] = random;
			System.out.print(problem[i]);
			
		}
		for(int i=0; i<5; i++) {
			int num = scn.nextInt();
			if(i == num) {
				System.out.print("[" + problem[i] + "]");
			} else {
				System.out.print("[*]");
			}
			
		}
		
	}

}
