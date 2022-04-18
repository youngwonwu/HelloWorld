package co.edu.inherit;

class Driver{	//메소드	//인스턴스를 받아온다
	public void drive(Car car) {
		car.drive();
	}
}

public class PolyExample {
	public static void main(String[] args) {
		
		Bus bus = new Bus();	//인스턴스
		Taxi taxi = new Taxi();
		
		Driver driver = new Driver();
		driver.drive(bus);	//매개변수의 다향성
		driver.drive(taxi);	//매개변수의 다형성 
		
	}
}
