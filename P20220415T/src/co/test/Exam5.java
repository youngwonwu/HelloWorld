package co.test;

import java.util.Scanner;

// 종합.
// 클래스의 인스턴스와 배열의 활용.
// 친구의 소중한 정보를 관리하는 앱을 구현하세요.
// Exam4(친구정보) 클래스의 인스턴스를 저장, 수정, 삭제, 조회 처리.
// 이름을 찾아서 수정(이름,연락처), 삭제(이름) 조회(이름, 같은 이름 2개있으면 전부다)
// 수정. 이름이 2개 있으면 2개다 띄우고 하나면 바꾸기--->이거는 할 수 있으면
public class Exam5 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		Exam4[] members = new Exam4[10];
		while (true) {
			System.out.println("1.추가 2.수정 3.삭제 4.조회(이름) 5.종료");
			System.out.println("선택>> ");
			int menu = scn.nextInt();
			if(menu == 1) {
				System.out.println("이름 입력>> ");
				String name = scn.next();
				System.out.println("생일 입력>> ");
				String birth = scn.next();
				System.out.println("연락처 입력>> ");
				String phone = scn.next();
				
				Exam4 member = new Exam4(name, birth, phone);	//인스턴스
				for(int i=0; i<members.length; i++) {
					if(members[i] == null) {
						members[i] = member;
						break;
					}
				}
				
			} else if(menu == 2) {
				System.out.println("이름>> ");
				String name = scn.next();
				System.out.println("수정할 연락처>> ");
				String phone = scn.next();
				
				for(int i=0; i<members.length; i++) {
					if(members[i] != null && members[i].getName().equals(name)) {	//맴버클래스 == 문자열
						members[i].setPhone(phone);
						break;
					}
				}
				
			} else if(menu == 3) {
				System.out.println("삭제할 이름>> ");
				String name = scn.next();
				
				for(int i=0; i<members.length; i++) {
					if(members[i].getName().equals(name)) {
						members[i] = null;
						break;
					}
				}
				
			} else if(menu == 4) {
				System.out.println("조회할 이름>> ");
				String name = scn.next();
				
				for(int i=0; i<members.length; i++) {
					if(members[i] != null && members[i].getName().equals(name)) {
						members[i].toString();
						System.out.println(members[i].toString());
					}
				}
				
			} else if(menu == 5) {
				break;
			}
		}
		System.out.println("end of prog.");
	}
}
