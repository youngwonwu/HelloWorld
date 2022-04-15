package co.deu.statics;
//co.edu.statics.Person => fullname
public class Person {
	
	//필드
	final String nation = "Korea";	//바로 값을 할당
	final String ssn;
	static final double PI = 3.14;	//final이라 한번 선언되면 바꿀수 없는 필드, 클래스에 소속되어있고 값 변경도 불가 -> 상수필드
	String name;
	
	//생성자
	public Person(String ssn, String name) {	//생성자를 통해서 값을 할당
		this.ssn = ssn;
		this.name = name;
	}

}
