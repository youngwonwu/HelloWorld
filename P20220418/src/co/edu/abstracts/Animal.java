package co.edu.abstracts;

public abstract class Animal {
	
	//Animal() 생성자로 인스턴스 생성 x
	
	//생성자
	public Animal() {
		
	}
	
	public abstract void eat();	//{ }로 구현을 안하고 강제로 eat() 구현하도록
	
	public abstract void run();
	
	public void sleep() {
		System.out.println("동물이 잠을 잡니다.");
	}

}
