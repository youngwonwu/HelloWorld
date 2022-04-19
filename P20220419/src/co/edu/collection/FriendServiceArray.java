package co.edu.collection;

//배열의 기능 활용
public class FriendServiceArray implements FriendService {

	Friend[] friends = new Friend[10];

	@Override
	public void addFriend(Friend friend) {	//추가
		
		for(int i=0; i<friends.length; i++) {
			if(friends[i] == null) {
				friends[i] = friend;
				break;
			}
		}
	}

	@Override
	public void modFriend(Friend friend) {	//수정
		
		for(int i=0; i<friends.length; i++) {
			if(friends[i].getName().equals(friend.getName())) {
				friends[i].getName();
				break;
			}
		}
	}

	@Override
	public void remFriend(String name) {	//삭제
		
		for(int i=0; i<friends.length; i++) {
			if(friends[i].getName().equals(name)) {
				friends[i] = null;
				break;
			}
		}
	}

	@Override
	public Friend findFriend(String name) {	//리스트. 한건조회만
		for(int i=0; i<friends.length; i++) {
			if(friends[i].getName() == name) {
				
			}
		}
		
		return null;
	}

}
