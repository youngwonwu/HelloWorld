package co.edu.project;

import java.util.Scanner;

public class MainEXample {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		DAO dao = new OracleDAO();	//new MySqlDAO();	//MySQL DB에서 OracleDB로 쓴다고 하면 여기 부분만 수정하면 됨
		
		while(true) {
			System.out.println("1.입력 2.수정 3.삭제 4.목록");
			System.out.println("선택>> ");
			int menu = scn.nextInt();
			if(menu == 1) {
				dao.insert();
			} else if(menu == 2) {
				dao.update();
			} else if(menu == 3) {
				dao.delete();
			} else if(menu == 4) {
				dao.list();
			} else {
				break;
			}
		}
		System.out.println("end of prog.");
		
	}

}
