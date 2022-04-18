package co.edu.inherit;

public class Bus extends Car {

	// 필드
	String busNo; // 개인택시, 회사택시

	// 생서자
	public Bus() {
		super();	//부보자식의 관계, super는 부모라고 생각하면 됨
		System.out.println("Bus() 생성자 호출");
	}

	// 메서드
	public void fee() {
		System.out.println("요금을 받습니다.");
	}
	
	@Override
	public void drive() {	//부모 클래스 메소드를 자식클래스에서 사용가능
		System.out.println("버스가 운행을 합니다.");
	}

	@Override
	public String toString() {
		return "Bus [busNo=" + busNo + ", model=" + super.model + "]";
//		return super.toString();	//주소값보여줌
	}
	
	

}
