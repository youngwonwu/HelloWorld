package co.edu.api;

import java.util.HashSet;

class Member {
	String name;
	int age;
	
	Member(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		//return super.hashCode();
		//return 100;
		return this.age;
	}
	
	@Override
	public boolean equals(Object obj) {
		//return super.equals(obj);
		//return true;
		if(obj instanceof Member) {	//중복값을 같은 값이라고 하고 싶으면 equals()해서 같다고 설정해주기
			Member member = (Member) obj;
			return this.name.equals(member.name);
		}
		return false; 
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}
	
}

public class ObjectExample {

	public static void main(String[] args) {

		//ArrayList 	:인덱스 요소를 구분 => 중복된 값 저장할 수 있다.
		//Set컬렉션 (집합) : 요소의 값으로 구분 => 중복된 값은 제외하는 컬렉션
		
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(100);
		set.add(200);
		set.add(300);
		set.add(200);	//중복 값 제외
		System.out.println(set.size());	//중복된 값은 제외한다 -> 3,	몇개의 요소가 있는지 보여줌
		
		HashSet<Member> members = new HashSet<Member>();
		members.add(new Member("홍길동", 20));
		members.add(new Member("김길동", 22));
		members.add(new Member("홍길동", 20));
		System.out.println(members.size());	//같은 값이라도 중복 x -> 3
		
		System.out.println("홍길동".hashCode());
		System.out.println("홍길동".hashCode());
		
		System.out.println(new Member("홍길동", 20).toString());
		
	}

}
