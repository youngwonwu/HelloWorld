package co.edu.interfaces;

//구현하는 클래스 클래스명
interface Runnable{
	public void run();
}

class RunClass implements Runnable {

	@Override
	public void run() {
		System.out.println("움직입니다.");
	}
	
}

public class RunnableExample {
	public static void main(String[] args) {
		Runnable runnable = new RunClass();
		runnable.run();
		
		//익명구현객체
		runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("멍멍이가 달립니다.");
			}
		};
		runnable.run();
		
		//익명구현객체. 람다표현식(간단한 표현방식): 함수를 통해서 표현
		runnable = () -> {
			System.out.println("야옹이가 달립니다.");
		};	//더 간단하게 중괄호도 생략할 수 있다.
		runnable.run();
		
	}
}
