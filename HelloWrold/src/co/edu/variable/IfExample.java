package co.edu.variable;

public class IfExample {
	public static void main(String[] args) {
		int myAge = 19;
		boolean over20;	//변수의 길이 상관없음 의미있는 변수명, 변수 이름 정할때 숫자가 처음이면 안되고 소문자로 해야함
		over20 = myAge > 20;	//over20 == myAge > 20
		if(over20) {
			System.out.println("over 20");
		} else {
			System.out.println("under 20");
		}
	}

}
