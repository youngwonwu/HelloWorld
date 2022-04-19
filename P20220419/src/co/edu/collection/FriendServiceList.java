package co.edu.collection;

import java.util.ArrayList;

//컬렉션 ArrayList 활용
public class FriendServiceList implements FriendService {

	ArrayList friend = new ArrayList();
	
	@Override
	public void addFriend(Friend friend) {	//추가
		
	}

	@Override
	public void modFriend(Friend friend) {	//수정
		
	}

	@Override
	public void remFriend(String name) {	//삭제
		
	}

	@Override
	public Friend findFriend(String name) {	//리스트. 한건조회만
		return null;
	}

}
