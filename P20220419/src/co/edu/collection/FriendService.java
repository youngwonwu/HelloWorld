package co.edu.collection;
//인터페이스
public interface FriendService {
	
	//추가, 수정, 삭제, 조회
							//매개값
	public void addFriend(Friend friend);
	public void modFriend(Friend friend);
	public void remFriend(String name);
	public Friend findFriend(String name);	//리스트. 한건조회만
	
	

}
