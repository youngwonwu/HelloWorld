package co.edu.friend;

import java.util.Scanner;

public class FriendList {
	public static void main(String[] args) {
		
		Friend[] friends = new Friend[10];
//		friends[0] = new UnivFriend("홍길동", "010-1111-2222", "대구대", "컴정");
//		friends[1] = new ComFriend("김길동", "010-2222-3333", "네이버", "개발팀");
//		friends[2] = new Friend("박길동", "010-3333-4444");
		
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.친구등록 2.리스트 3.조회(이름) 4.종료");
			int menu = scn.nextInt();
			
			if(menu == 1) {
				System.out.println("--------------");
				System.out.println("1. 친구등록");
				System.out.println("--------------");
				System.out.println("1.학교친구 2.회사친구 3. 친구등록");
				int fmenu = scn.nextInt();
				scn.nextLine();
				if(fmenu == 1) {
					System.out.println("--------------");
					System.out.println("1. 학교친구 등록>> ");
					System.out.println("--------------");
					System.out.print("이름>> ");
					String uName = scn.nextLine();
					System.out.print("전화번호>> ");
					String univphone = scn.nextLine();
					System.out.print("학교이름>> ");
					String univName = scn.nextLine();
					System.out.print("전공>> ");
					String univmajor = scn.nextLine();
					
					Friend newUnivFriend = new UnivFriend(uName, univphone, univName, univmajor);
					for(int i=0; i<friends.length; i++) {
						if(friends[i] == null) {
							friends[i] = newUnivFriend;
							break;
						}
					}
					
				} else if (fmenu == 2) {
					System.out.println("--------------");
					System.out.println("2. 회사친구 등록>> ");
					System.out.println("--------------");
					System.out.print("이름>> ");
					String cName = scn.nextLine();
					System.out.print("전화번호>> ");
					String comPhone = scn.nextLine();
					System.out.print("회사이름>> ");
					String comName = scn.nextLine();
					System.out.print("부서>> ");
					String comDepartment = scn.nextLine();
					
					Friend newComFriend = new ComFriend(cName, comPhone, comName, comDepartment);
					for(int i=0; i<friends.length; i++) {
						if(friends[i] == null) {
							friends[i] = newComFriend;
							break;
						}
					}
					
				} else if(fmenu == 3) {
					System.out.println("3. 친구등록>> ");
					System.out.print("이름>> ");
					String fName = scn.nextLine();
					System.out.print("전화번호>> ");
					String fPhone = scn.nextLine();
					
					Friend newFriFriend = new Friend(fName, fPhone);
					for(int i=0; i<friends.length; i++) {
						if(friends[i] == null) {
							friends[i] = newFriFriend;
							break;
						}
					}
				}
				
			} else if (menu == 2) {
				System.out.println("--------------");
				System.out.println("2. 친구 리스트");
				System.out.println("--------------");
				
				for(Friend friend : friends) {
					if(friend != null) {
						System.out.println(friend.toString());
					}
				}
				
			} else if (menu == 3) {
				
			} else if (menu == 4) {
				System.out.println("프로그램 종료");
				break;
			}
		}
		
		
		
	}

}
