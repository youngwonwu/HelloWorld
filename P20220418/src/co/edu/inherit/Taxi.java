package co.edu.inherit;

public class Taxi extends Car {
	
	//필드
	String type;	//개인택시, 회사택시
	
	//생서자
	public Taxi() {
		System.out.println("Taxi() 생성자 호출");
	}
	
	//메서드
	public void metering() {
		System.out.println("요금 계기판");
	}

	
	@Override
	public void drive() {	//부모 클래스 메소드를 자식클래스에서 사용가능
		System.out.println("택시가 운행을 합니다.");
	}

	@Override
	public String toString() {
		return "Taxi [type=" + this.type + ", model=" + super.model + "]";
		//return super.toString();
	}

}
