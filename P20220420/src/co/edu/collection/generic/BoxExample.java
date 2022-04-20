package co.edu.collection.generic;

import java.util.ArrayList;

class Orange extends Object {
	
}

public class BoxExample {

	public static void main(String[] args) {

//		Box box = new Box();
//		box.setField("Orange");	//"Orange" 안에 들어간게 object임 
//		String result = (String) box.getField();	//Object -> String으로 바꾸려면 형변환해야함
//		
//		Orange orange = (Orange) box.getField();	//Object -> Orange
//		
//		System.out.println("end of prog.");
		
		
		Box<String> box = new Box<String>();
		box.setField("Orange");
		String result = box.getField();
		
		Box<Integer> box2 = new Box<Integer>();
		box2.setField(10);
		Integer result2 = box2.getField();
		
				  //<  > 어떤 타입으로 받는다
		ArrayList<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("김길동");
		
		//Friend 인스턴스를 받는다
		ArrayList<Friend> friends = new ArrayList<Friend>();
		friends.add(new Friend("박길동", "010-1111-2222"));
		
		System.out.println("end of prog.");
		
	}

}
