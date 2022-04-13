package co.edu.array;

import java.util.Scanner;

public class ArrayExample6 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		//학생이름, 점수
		//배열, 배열 0 => 학생, 90
		String[] names = new String[3];	//학생이름
		int[] scores = new int[3];	//학생점수
		
		for(int i=0; i<names.length; i++) {
			System.out.println("학생이름을 입력하세요");
			names[i] = scn.nextLine();
			
			System.out.println("학생점수 입력하세요");
			scores[i] = scn.nextInt();
			scn.nextLine();	// ?????
		}
		System.out.println("조회할 학생이름 입력하세요");
		String searchName = scn.nextLine();
		for(int i=0; i<names.length; i++) {
			if(names[i].equals(searchName)) {
				System.out.println("이름 : " + names[i]+ ", 점수 : " + scores[i]);
			}
		}
		System.out.println("end of program");
		
	}

}
