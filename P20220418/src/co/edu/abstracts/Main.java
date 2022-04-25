package co.edu.abstracts;

public class Main {

	public static void main(String[] args) {

		// 추상클래스는 생성자 호출 못함
		Animal animal = null; //new Animal(); -> X, 추상클래스를 받을려면 재정의 해야한다
		
		animal = new Bird();
		animal.eat();
		animal.run();
		animal.sleep();
		
		animal = new Fish();
		animal.eat();
		animal.run();
		animal.sleep();
		
	}

}
