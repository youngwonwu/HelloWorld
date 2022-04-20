package co.edu.exception;

import java.util.Scanner;

public class MultiLineExample {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);

		String str = "오늘은 \n 날씨가 \n 좋군요 \n";
		str ="";
		str += "오늘은 \n";
		str += "날씨가 \n";
		str += "좋구나!!\n";
		System.out.println(str.toString());
				
		
		str ="";
		while(true) {
			String temp = scn.nextLine() + "\n";
			if(temp.trim().equals("exit")) {	//trim(): 공란을 지운다
				break;
			}
			str += temp + "\n";
		}
		System.out.println(str.toString());
	}

}
