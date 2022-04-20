package co.edu.collection.generic;

import java.util.ArrayList;
import java.util.Scanner;

//친구목록 저장하기 위한 App
//추가, 수정, 삭제 ,조회
//1)배열 2)컬렉션 <= 인터페이스로 구현

public class FriendApp {
	public static void main(String[] args) {
		
		//추가, 수정, 삭제, 조회 => 컨트롤 역할
		
		//인터페이스					구현클래스
//		FriendService service = new FriendServiceArray();
		FriendService service = new FriendServiceList();
		
//		service.addFriend(null);
//		service.modFriend(null);
		
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.입력 2.수정 3.삭제 4.목록 5.남자 6.여자");
			System.out.println("선택>> ");
			int menu = scn.nextInt();
			scn.nextLine();
			
			if(menu == FriendService.ADD) {
				System.out.println("이름 입력>> ");
				String addName = scn.nextLine();
				System.out.println("전화번호 입력>> ");
				String addPhone = scn.nextLine();
				System.out.println("성별>> ex)남자 / 여자");
				String gender = scn.next();
				
				Gender gen = Gender.MEN;	//public enum Gender
				if(gender.startsWith("남")) {
					gen = Gender.MEN;
				} else if (gender.startsWith("여")) {
					gen = Gender.WOMEN;
				}
				
				Friend newfriend = new Friend(addName, addPhone, gen);
				service.addFriend(newfriend);
				
				
			} else if(menu == FriendService.MOD) {
				System.out.println("수정할 이름 입력>> ");
				String mName = scn.nextLine();
				System.out.println("변경할 이름 입력>> ");
				String chename = scn.nextLine();
				
				Friend mFriend = new Friend(mName, chename);
				service.modFriend(mFriend);
				
				
			} else if(menu == FriendService.DEL) {
				System.out.println("삭제할 이름 입력>> ");
				String dName = scn.nextLine();
				service.remFriend(dName);
				
			} else if(menu == FriendService.SEARCH) {
				System.out.println("조회할 이름 입력>> ");
				String sName = scn.nextLine();
				
				Friend sFriend = service.findFriend(sName);
				
				System.out.println(sFriend);
				
			} else if (menu == FriendService.FIND_MEN) {	//남자친구의 리스트
				ArrayList<Friend> list = service.findGender(Gender.MEN);
				for(Friend friend : list) {
					System.out.println(friend.toString());
				}
				
				
			} else if (menu == FriendService.FIND_WOMEN) {
				ArrayList<Friend> list = service.findGender(Gender.WOMEN);
				for(Friend friend : list) {
					System.out.println(friend.toString());
				}
				
			} else {
				System.out.println("end of prog.");
				break;
			}
		}
		
		
		
		
	}
}
