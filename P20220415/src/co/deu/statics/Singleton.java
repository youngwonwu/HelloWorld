package co.deu.statics;

public class Singleton {
	
					//필드
//	static Singleton singleton = new Singleton();	//생성자
//	
//	private Singleton() {
//		
//	}
//	
//	static Singleton getInstance() {
//		return singleton;
//	}
	
	
	private static Singleton singleton = new Singleton();
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {	//동일한 팩키지에서는 접근가능 한데 다른 팩키지에서 접근이 불가능 해서 모든 팩키지에서 접근가능하도록 public를 붙여준다
		return singleton;
	}
	
	Car car;

}
