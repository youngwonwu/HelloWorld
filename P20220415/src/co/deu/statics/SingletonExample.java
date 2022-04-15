package co.deu.statics;

class Car {	//파일하나에서 public으로 선언할 수있는 건 하나뿐
	//이라서 co.edu > SingletonExample 에서 Car를 불러올 수 없다
}

public class SingletonExample {

	public static void main(String[] args) {
		
		// Singleton s1 = new Singleton();	//인스턴스
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		if(s1 == s2) {	
			System.out.println("same");
		} else {
			System.out.println("diffrent");
		}	//-> 같은 주소값을 가지고 있어서 "same"

	}

}
