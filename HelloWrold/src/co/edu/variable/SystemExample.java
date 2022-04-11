package co.edu.variable;

import java.io.IOException;
import java.util.Scanner;

public class SystemExample {

	public static void main(String[] args) {
		
		//표준입출력 -> System.in, System.out
//		Scanner scn = new Scanner(System.in);	//System.in => 키보드로 입력하겠다는 거임
//		Scanner scn = new Scanner("홍길동 우길동 성길동);
//		System.out.println("세 개의 단어를 입력하세요. 예) 안녕 Hi 잘가");
//		while(scn.hasNext()) {
//			String str = scn.next();
//			System.out.println(str);
//			if (str.equals("exit")) {
//				break;
//			}
//		}
//		System.out.println("end of program");

		System.out.println("숫자를 입력하세요.");		//책 P92 - 95
		while (true) {
			int readByte;
			try {
				readByte = System.in.read();
				System.out.println(readByte);
				if(readByte == 97)	//97이 a임
					break;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("end of program");
	}

}
