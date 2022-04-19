package co.edu.collection;

import java.util.Scanner;

//친구목록 저장하기 위한 App
//추가, 수정, 삭제 ,조회
//1)배열 2)컬렉션 <= 인터페이스로 구현

public class FriendApp {
	public static void main(String[] args) {
		
		//추가, 수정, 삭제, 조회 => 컨트롤 역할
		
		//인터페이스					구현클래스
		FriendService service = new FriendServiceArray();
//		FriendService service = new FriendServiceList();
		
//		service.addFriend(null);
//		service.modFriend(null);
		
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.입력 2.수정 3.삭제 4.목록");
			System.out.println("선택>> ");
			int menu = scn.nextInt();
			scn.nextLine();
			
			if(menu == 1) {
				System.out.println("이름 입력>> ");
				String addName = scn.nextLine();
				System.out.println("전화번호 입력>> ");
				String addPhone = scn.nextLine();
				Friend newfriend = new Friend(addName, addPhone);
				service.addFriend(newfriend);
				
				
			} else if(menu == 2) {
				System.out.println("수정할 이름 입력>> ");
				String mName = scn.nextLine();
				System.out.println("변경할 이름 입력>> ");
				String modname = scn.nextLine();
				
				Friend mFriend = new Friend(mName, modname);
				service.modFriend(mFriend);
				
				
			} else if(menu == 3) {
				System.out.println("삭제할 이름 입력>> ");
				String dName = scn.nextLine();
				service.remFriend(dName);
				
			} else if(menu == 4) {
				System.out.println("조회할 이름 입력>> ");
				String sName = scn.nextLine();
				service.findFriend(sName);
				
			}
		}
		
		
		
		
	}
}
