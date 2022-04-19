package co.edu.interfaces;

public class RemoteExample {
	
	public static void main(String[] args) {
		
		//상속관계에서는 부모클래스의 참조변수 자식클래스이 인스턴스가 할당
		
//		RemoteControl rc = new RemoteControl();
//		RemoteControl rc = new Television();	//RemoteControl구현하는 Television
		RemoteControl rc = null;
		rc = new Television();	//RemoteControl구현하는 Television
		rc = new Audio();	//powerON, powerOff -> 객체만 바꾸면 이런 기능도 사용할 수 있다.
		
		rc.turnOn();
		rc.turnOff();
		rc.volumeUp();
		rc.volumeDown();
		
		RemoteControl.changeBettery();	//RemoteControl에 static메소드는 구현클래스에서 구현하지 않아도 된다.
		
	}

}
