package co.edu;

import co.edu.friend.Friend;

class Friend2 extends Friend {
	
	public Friend2() {
		super();	//생성자 호출
		this.getName();	//protected String getName() {
						//return name; -> protected라고 하면 다른 패키지에서도 접근이 가능하다
		//protected : 필드 생성자 메소드에서 적용가능, 자식클래스가 아닌 다른 패키지에 소속된 클래스
	}
}

public class ModifierExample {

	public static void main(String[] args) {

		Friend friend = new Friend();
		
	}

}
