package co.edu.uested;

import java.util.Scanner;

class Friend {
	
	String name;
	String phone;
	int age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "Friend [name=" + name + ", phone=" + phone + ", age=" + age + "]";
	}
	
}

//중첩클래스, 중첩 인터페이스 만들기
public class NestedApp {
	
	static Scanner scn = new Scanner(System.in);
	
	static Friend[] friends = new Friend[10];
	
	//중첩인터페이스
	interface FriendService {
		
		//상수
		int ADD = 1;
		int MOD = 2;
		int LIST = 3;
		
		//메소드
		void add();
		void modity();
		void list();
	}
	
	//중첩 클래스
	static class FriendApp implements FriendService{	//FriendService구현하는 클래스 FriendApp
		
		//메소드 구현
		@Override
		public void add() {
			System.out.println("이름>> ");
			String name = scn.next();
			System.out.println("연락처>> ");
			String phone = scn.next();
			System.out.println("나이>> ");
			int age = scn.nextInt();
			
			//인스턴스
			Friend friend = new Friend();
			friend.setName(name);
			friend.setPhone(phone);
			friend.setAge(age);
			
			//배열에 비어있는 위치에 저장
			for(int i=0; i<friends.length; i++) {
				if(friends[i] == null) {
					friends[i] = friend;
					break;
				}
			}
			
		}

		@Override
		public void modity() {
			System.out.println("이름>> ");
			String name = scn.nextLine();
			System.out.println("수정할 연락처>> ");
			String phone = scn.nextLine();
			System.out.println("수정할 나이>> ");
			int age = scn.nextInt();
			
			for(int i=0; i<friends.length; i++) {
				if(friends[i] != null && friends[i].getName().equals(name)) {
					friends[i].setPhone(phone);
					friends[i].setAge(age);
					break;
				}
			}
			
		}

		@Override
		public void list() {
			//배열에 저장되어있는 값을 출력
			//한건출력
			//같은 이름 다 조회하기 -> no break;
			System.out.println("조회할 이름>> ");
			String name = scn.next();
			
			for(int i=0; i<friends.length; i++) {
				if(friends[i] != null && friends[i].getName().equals(name)) {
					System.out.println(friends[i]);
					
				}
			}
			
		}
		
	}
	
	//static main 메소드
	public static void main(String[] args) {
		
		//인스턴스
		FriendApp app = new FriendApp();
		
		//메소드 호출
//		app.add();
//		app.add();	//입력 2건 출력 이렇게 아니면 while(true)해서
//		//app.modity();
//		app.list();
		

		while(true) {
			System.out.println("1.등록 2.수정 3.목록");
			int menu = scn.nextInt();
			
			if(menu == FriendService.ADD) {
				app.add();
				
			} else if(menu == FriendService.MOD) {
				app.modity();
				
			} else if(menu == FriendService.LIST) {
				app.list();
				
			}
		}
		
	}

}
