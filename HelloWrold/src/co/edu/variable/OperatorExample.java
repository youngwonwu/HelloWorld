package co.edu.variable;

public class OperatorExample {

	public static void main(String[] args) {
		
		//나머지 : %
		//6/4 => 몫 : 1, 나머지 2
		int result = 6 / 4;
		int result2 = 6 % 4;
		
		int value = 5;
		if (value % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
		
		
		//75300원
		//5만원 => ?개, 1만원 => ?개, 5천원 => ?개
		//1천원 => ?개, 5백원 => ?개, 1백원 => ?개
		//75300원 5만원 1개, 1만원 2개, 5천원 1개, 1백원 3개
		
		int num = 75300;
		int num2 = num / 50000;
		
		if (num % num2 == 0) {
			System.out.println("5만원" + num2);
		} else 
		{
			System.out.println("5만원" + num2 + "개");
		}
		
		int num3 = num2;
		int num4 = num3 / 10000;
		if (num3 % num4 == 0) {
			System.out.println("1만원" + num3);
		} else 
		{
			System.out.println("1만원" + num3 + "개");
		}
		
		//int num4 = num3 / 5000;
//		int num5 = num4 / 100;
		
		

	}

}
