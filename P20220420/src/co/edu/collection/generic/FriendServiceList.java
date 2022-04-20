package co.edu.collection.generic;

import java.util.ArrayList;

//컬렉션 ArrayList 활용
public class FriendServiceList implements FriendService {

	ArrayList<Friend> friends = new ArrayList<Friend>();
	
	@Override
	public void addFriend(Friend friend) {	//추가
		friends.add(friend);
	}

	@Override
	public void modFriend(Friend friend) {	//수정
		for(int i=0; i<friends.size(); i++) {
			Friend findFriend = (Friend) friends.get(i);
			if(findFriend.getName().equals(friend.getName())) {
				findFriend.setName(friend.);
				//friends.set(i, findFriend);
				//break;
			}
		}
	}

	@Override
	public void remFriend(String name) {	//삭제
		for(int i=0; i<friends.size(); i++) {
			Friend removeFriend = (Friend) friends.get(i);
			if(removeFriend.getName().equals(name)) {
				friends.remove(removeFriend);
			} else {
				System.out.println("삭제할 대상이 없습니다");
			}
		}
	}

	@Override
	public Friend findFriend(String name) {	//리스트. 한건조회만
		for(int i=0; i<friends.size(); i++) {
			Friend findFriend = (Friend) friends.get(i);
			if(findFriend.getName().equals(name)) {
				return findFriend;
			}
		}
		return null;
	}

	@Override
	public ArrayList<Friend> findGender(Gender gender) {
		ArrayList<Friend> list = new ArrayList<Friend>();
		for(int i=0; i<friends.size(); i++) {
			if(friends.get(i).getGender() == gender) {	//열겨형 타입은 ==
				//열거형타입 클래스타입 같은 참조타입
				//기본타입 == 비교연산자
				//열겨형 == 비교연산자로 비교
				list.add(friends.get(i));
			}
		}
		return list;
	}

}
