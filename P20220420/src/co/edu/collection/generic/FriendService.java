package co.edu.collection.generic;

import java.util.ArrayList;

//인터페이스
public interface FriendService {
	
	//상수
	public int ADD = 1;
	public int MOD = 2;
	public int DEL = 3;
	public int SEARCH = 4;
	public int FIND_MEN = 5;
	public int FIND_WOMEN = 6;
	
	
	//추가, 수정, 삭제, 조회
							//매개값
	public void addFriend(Friend friend);
	public void modFriend(Friend friend);
	public void remFriend(String name);
	public Friend findFriend(String name);	//리스트. 한건조회만
	public ArrayList<Friend> findGender(Gender gender);
	
	

}
