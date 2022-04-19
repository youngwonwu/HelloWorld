package co.edu.interfaces;

public interface RemoteControl {
	
	//상수(static final):한번 선언하면 값을 바꿀수 없다 
	public static final int MAX_VOLUME = 10;
	
	public void turnOn();	//추상메소드
	public void turnOff();
	public void volumeUp();
	public void volumeDown();
	
	public default void adjustScreen() {	//Television에만 사용하고 싶다
		System.out.println("화면을 조종합니다.");
	}
	
	public static void changeBettery() {
		System.out.println("건전지를 교환합니다.");
	}

}
