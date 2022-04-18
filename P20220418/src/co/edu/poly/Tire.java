package co.edu.poly;

public class Tire {
	
	//필드
	public int maxRotation;	//최대 10번 회전하면 수명 다하게
	public int accumulateRotation;	//현재까지 사용한 누적 회전 수
	public String location;	//자동차 바퀴 위치
	
	//생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//메소드
	public boolean roll() {	//한번 회적할때 마다 누적회전수 +1
		accumulateRotation++;
		if(accumulateRotation < maxRotation) {
			System.out.println(location + "Tire수명 " + (maxRotation - accumulateRotation) + "회");
			return true;	
		} else {
			System.out.println("***" + location + " Tire 펑크 ***");
			return false;
		}
	}

}
