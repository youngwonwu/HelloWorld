package co.edu.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MismatchExample {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.추가 2.종료");
			System.out.println("선택>> ");
			
			try {
				Class.forName("java.lang.String");	//Exception...???? 이거만 했을때는 예외처리를 해줘야함 아니면 에러발생
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			}
			
			//예외처리 - int타입이 아닌 string 타입일때
			int menu = 0;
//			try {
//				menu = scn.nextInt();	//RuntimeException...?????
//			} catch (ArrayIndexOutOfBoundsException e) {	//e????????????
//				System.out.println("배열의 범위 넘어서 처리하려고 합니다.");
//			}catch(InputMismatchException e) {				//e1??????????????
//				System.out.println("숫자로 선택해주세요");
//				scn.nextLine();
//			}
			try {
				//"10" -> 10 (O), "ten" -> 10 (X), "" -> 10 (X)
				menu = Integer.parseInt(scn.next());	//RuntimeException...?????
				//return true;	//return이 있으면 프로그램 종료
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("배열의 범위 넘어서 처리하려고 합니다.");
				
			}catch(InputMismatchException | NumberFormatException e2) {
				System.out.println("숫자로 선택해주세요");
				scn.nextLine();
				
			} catch(Exception e3) {
				System.out.println("알 수 없는 예외 발생");
			} finally {	//try에서 finally가 있으면 반드시 실행해야함
				System.out.println("예외처리에서 반드시 한번은 실행하도록");
			}
			
			if(menu == 1) {
				System.out.println("추가작업");
			} else if(menu == 2) {
				break;
			}
		}
		System.out.println("end of prog.");
	}

}
