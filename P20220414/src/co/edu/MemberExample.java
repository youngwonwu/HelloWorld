package co.edu;

import java.util.Scanner;

public class MemberExample {

	public static void main(String[] args) {

//		Member m1 = new Member("user1", "사용자1", "010-2345-5678", 23);
//		m1.memberAge = 25;
//		m1.memberAge = -25;
//		m1.setMemberAge(-25);
//		System.out.println("나이" + m1.getMemberAge());
//		
//		m1.setMemberId("user01");
//		System.out.println("아이디" + m1.getMemberId());
//		
//		m1.showInfo();
		
		
		
//		Scanner scn = new Scanner(System.in);
//		Member[] members = new Member[2];
//		//사용자가 값을 입력
//		for(int i=0; i<members.length; i++) {
//			System.out.println("아이디, 이름, 연락처, 나이 입력하세요");
//			String id = scn.next();
//			String name = scn.next();
//			String phone = scn.next();
//			int age = Integer.parseInt(scn.next());
////			String strAge = scn.next();
////			int age = Integer.parseInt(strAge);	//요렇게 해도 된다
//			
//			Member newMember= new Member(id, name, phone, age);	//인스턴스
//			members[i] = newMember;
//		}
//		//출력
//		for(Member member : members) {	//members배열에 들어있는 만큼 member에 넣고 출력
//			member.showInfo();
//		}
//		System.out.println("end of prog.");
		
		
		
		Scanner scn = new Scanner(System.in);
		Member[] members = new Member[3];
		//사용자가 값을 입력
		for(int i=0; i<members.length; i++) {
			System.out.println("아이디, 이름, 연락처, 나이 입력하세요");
			String id = scn.next();
			String name = scn.next();
			String phone = scn.next();
			int age = Integer.parseInt(scn.next());
			
			Member newMember= new Member(id, name, phone, age);	//인스턴스
			members[i] = newMember;
		}
		
//		1.조회(이름), 2.변경(아이디, 연락처) 3. 조회(입력한 나이보다 큰 회원 조회) 4. 종료
		while (true) {
			System.out.println("-----------------------------------------------------------");
			System.out.println("1.이름 조회, 2.연락처 변경 3. 조회(나이 큰 회원 조회) 4. 종료");
			System.out.println("-----------------------------------------------------------");
			System.out.println("선택>> ");
			
			int menu = scn.nextInt();
			scn.nextLine();	//메뉴와 엔터키 처리
			
			
			if(menu == 1) {
				System.out.print("1.조회(이름)>> ");
				String sname = scn.nextLine();
				for(Member member : members) {
					if(member.getMemberName().equals(sname))
					member.showInfo();
				}
				
			} else if(menu == 2) {
				System.out.print("2.아이디>> ");
				String sid = scn.next();
				System.out.print("2.변경 할 연락처>> ");
				String sphone = scn.next();
				for(Member member : members) {
					if(member.getMemberId().equals(sid)) {
						member.setMemberPhone(sphone);
						break;	//같은 아이디가 없다는
					}
				}
				
			} else if(menu == 3) {
				System.out.print("3.나이 입력>> ");
				int sage = scn.nextInt();
				for(Member member : members) {
					if(member.getMemberAge() < sage) {
						System.out.println("나이가 더 큰 회원이 없습니다.");
					}
				}
				
			} else if(menu == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
				
			} else {
				for(Member member : members) {
					member.showInfo();
				}
			}
		} System.out.println("end of prog.");
		
	}

}
