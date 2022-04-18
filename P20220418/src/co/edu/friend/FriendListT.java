package co.edu.friend;

import java.util.Scanner;

public class FriendListT {
	public static void main(String[] args) {

		Friend[] friends = new Friend[10];
//	friends[0] = new UnivFriend("홍길동", "010-1111-2222", "대구대", "컴정");
//	friends[1] = new ComFriend("김길동", "010-2222-3333", "네이버", "개발팀");
//	friends[2] = new Friend("박길동", "010-3333-4444");

		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println("1.친구등록 2.리스트 3.조회(이름) 4.종료");
			int menu = scn.nextInt();

			if (menu == 1) {
				Friend friend = null;
				System.out.println("1.학교친구 2.회사친구 3. 친구등록");

				int fmenu = scn.nextInt();
				scn.nextLine();

				System.out.print("이름>> ");
				String name = scn.nextLine();
				System.out.print("전화번호>> ");
				String phone = scn.nextLine();

				if (fmenu == 1) {
					System.out.print("학교이름>> ");
					String univName = scn.nextLine();
					System.out.print("전공>> ");
					String univmajor = scn.nextLine();

					friend = new UnivFriend(name, phone, univName, univmajor);

				} else if (fmenu == 2) {
					System.out.print("회사이름>> ");
					String comName = scn.nextLine();
					System.out.print("부서>> ");
					String comDepartment = scn.nextLine();

					friend = new ComFriend(name, phone, comName, comDepartment);

				} else if (fmenu == 3) {
					System.out.println("3. 친구등록>> ");

					friend = new Friend(name, phone);
				}
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] == null) {
						friends[i] = friend;
						break;
					}
				}

			} else if (menu == 2) {
				System.out.println("--------------");
				System.out.println("2. 친구 리스트");
				System.out.println("--------------");

				for (Friend friend : friends) {
					if (friend != null) {
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
