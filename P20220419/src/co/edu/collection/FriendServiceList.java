package co.edu.collection;

import java.util.ArrayList;


//컬렉션 ArrayList 활용
public class FriendServiceList implements FriendService {

	ArrayList friends = new ArrayList();
	
	@Override
	public void addFriend(Friend friend) {	//추가
		friends.add(friend);
	}

	@Override
	public void modFriend(Friend friend) {	//수정
		for(int i=0; i<friends.size(); i++) {
			Friend findFriend = (Friend) friends.get(i);
			if(findFriend.getName().equals(friend.getName())) {
				findFriend.setName(friend.getName());
			}
		}
	}

	@Override
	public void remFriend(String name) {	//삭제
		for(int i=0; i<friends.size(); i++) {
			Friend removeFriend = (Friend) friends.get(i);
			if(removeFriend.getName().equals(friend.getName())) {
				
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

}
