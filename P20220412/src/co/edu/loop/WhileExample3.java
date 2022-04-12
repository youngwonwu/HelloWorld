package co.edu.loop;

import java.util.Scanner;

public class WhileExample3 {

	public static void main(String[] args) {
		
		//Math.random()의 생성범위 1 ~ 10까지가 되도록 => randomVal
		//사용자의 입력값을 담는 변수 userVal. scanner
		
		//While구문을 사용해서 임의의 값이랑 입력값이 같으면 종료
		//사용자 값 비교 랜덤값이랑 비교...입력한 랜덤 크다. 작다.
		//램덤이 만들어준 값을 맞추는 게임
		Scanner scn = new Scanner(System.in);
		
		int randomVal = (int) (Math.random() * 10)+1;
		while(true) {
			System.out.println("값을 입력하세요");
			int userVal = scn.nextInt();
			if (randomVal == userVal) {
				System.out.println("정답입니다.");
				break;
			}
			if (randomVal > userVal) {
				System.out.println("입력한 값보다 큽니다.");
			} else {
				System.out.println("입력한 값보다 작습니다.");
			}
		}
		System.out.println("정답은 : " + randomVal);

	}

}
