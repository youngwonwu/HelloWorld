package co.edu.variable;

public class VarExample6 {

	public static void main(String[] args) {
		String myName = "홍길동";	//참조데이터타입
		
		int age = 10;	//기본데이터타입
		myName.charAt(0);	//String은 class타입 메서드도 지정할수 있다.
		char firstChar = myName.charAt(0);
		System.out.println(firstChar);
		System.out.println((int)firstChar);
		
		int age2 = 25;
		double height = 167.4;
		int mathScore, engScore;
		mathScore = 80;
		engScore = 90;
		System.out.println(myName + "의 나이는 " + age + "이고 키는 " + height + "이고 영어, 수학의 합은" 
						+ mathScore + engScore + "입니다.");
		System.out.println(myName + "의 나이는 " + age + "이고 키는 " + height + "이고 영어, 수학의 합은" 
				+ (mathScore + engScore) + "입니다.");

	}

}
