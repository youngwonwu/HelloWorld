package co.edu.abstracts;

public class Main {

	public static void main(String[] args) {

		Animal animal = null; //new Animal(); -> X, 추상크래스를 받을려면 재정의 해야한다
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
