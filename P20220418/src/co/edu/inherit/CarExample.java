package co.edu.inherit;

public class CarExample {

	public static void main(String[] args) {

		Bus bus = new Bus();
		//부모에게 상속받은 필드, 메소드
		bus.model = "45인승버스";
		bus.drive();
		
		//자식에게 새로 필드, 메소드
		bus.busNo = "240";
		bus.fee();
		System.out.println(bus.toString());
		
		Taxi taxi = new Taxi();
		taxi.model = "SonataTaxi";	//자식이 부모꺼 불러옴
		taxi.drive();
		
		taxi.type = "개인택시";	//자식꺼
		taxi.metering();
		System.out.println(taxi.toString());
		
		//자실클래스의 인스턴스 => 부모 참조변수 할당가능
		Bus[] buses = new Bus[10];
		Taxi[] taxies = new Taxi[10];
		
		Car[] cars = new Car[10];
		cars[0] = bus;	//자동형변환
		cars[2] = taxi;	//자동형변환
		
	}

}
