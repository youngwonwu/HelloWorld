package co.edu.interfaces;

// 인터페이스는 구현클래스 통해서 구현. 상속처럼 인터페이스는 implements쓴다
public class Television implements RemoteControl{

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void volumeUp() {
		System.out.println("TV의 Volume 올립니다.");
	}

	@Override
	public void volumeDown() {
		System.out.println("TV의 Volume 내립니다.");
	}

	@Override
	public void adjustScreen() {
//		RemoteControl.super.adjustScreen();
		System.out.println("TV의 화면을 조정합니다.");
	}
	
	

}
