package co.edu.variable;

public class VarExample3 {

	public static void main(String[] args) {
		{
			int age = 20;
			System.out.println("나이는 " + age);
		}
		int age =25;	//변수 다시 설정
		System.out.println("나이는 " + age);	//블럭 안에 있는 변수는 밖에 있는 변수에 영향을 주지 않는다. 다시 변수 설정을 해야함
		
		//조건문 if
		boolean isTrue = true;
		isTrue = false;
		isTrue = age > 20;
		
		if(isTrue) {
			System.out.println(age + "는 20보다 큽니다.");
		}
	}
	
	

}
