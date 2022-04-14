package co.edu;
//객체 -> 도면 -> 텔레비젼(삼선, LG)
//Object -> Class -> Instance
//추상화(텔레비젼의 모든 속성 -> 필요할 부분만 정의해서 쓴다)
public class Television {
	//속성(값을 저장) -> 필드
	String company;
	String model;
	int price;
	String color;
	
	//기능(객체의 동작) -> 메소드로 정의(반환유형, 메소드명, 매개변수)
	void turnOn(){	//반환유형, 메소드명, 매개변수
		System.out.println("텔레비젼을 컵니다.");
	}
	
	void turnOff(){
		System.out.println("텔레비젼을 끕니다.");
	}
	
	void changeCha(int cha){
		System.out.println(cha + "번 채널로 변경합니다.");
	}

}
