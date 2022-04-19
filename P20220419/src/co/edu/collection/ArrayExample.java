package co.edu.collection;

import java.util.ArrayList;

//배열에 저장하는 거와 컬렉션을 사용하거 비교하기
//배열활용한 프로그램, 컬렉션을 활용한 프로그램
//인터페이스 선언해서 구현하는 클래스를 2가지로 구현해보기

public class ArrayExample {
	public static void main(String[] args) {
		
		//배열은 크기 변경 불가
		//컬렉션은 크기 변경 가능
		//배열 null인지 아닌지 구별해줘야하는데 컬렉션은 x
		
		//배열
		Friend[] friendAry = new Friend[10];
		friendAry[0] = new Friend("홍길동", "010-1111-2222");
		friendAry[1] = new Friend("김길동", "010-2222-3333");
		friendAry[0] = null;	//friendAry[0] 삭제하기
		for(int i=0; i<friendAry.length; i++) {
			if(friendAry[i] != null) {
				System.out.println(friendAry[i].toString());
			}
		}
		Friend f1 = friendAry[0];
		
		//컬렉션을 활용. 인터페이스 => List: 컬렉션 => 인터페이스 구현클래스 ArraryList
		ArrayList<Friend> friendList = new ArrayList<Friend>();
		friendList.add(new Friend("박길동", "010-3333-4444"));	//추가
		friendList.add(new Friend("최길동", "010-4444-5555"));	//추가
		friendList.remove(0);	//friendAry[0] 삭제하기
		for(int i=0; i<friendList.size(); i++) {
			System.out.println(friendList.get(i));
		}
		//friendList.isEmpty();	//isEmpty: 값이 있는지 없는지 확인
		Friend f2 = (Friend) friendList.get(0);	//get(인텍스)는 Object타입이라 형변환을 해줘야함
		
	}
}
