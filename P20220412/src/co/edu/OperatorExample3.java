package co.edu;

public class OperatorExample3 {

	public static void main(String[] args) {
		
		// 비교연산자, 논리 연산자
		int num1 = 10;
		int num2 = 20;
		
		if(num1 == num2) {
			System.out.println("두 수는 같습니다.");
		}
		
		if(num1 != num2) {
			System.out.println("두 수는 같지 않습니다.");
		}
		
		if(num1 >= num2) {
			System.out.println(num1 + "이 " + num2 + "보다 큽니다.");
		}
		
		if((num1 % 2 ==0) && (num2 % 2 ==0)) {
			System.out.println("두 수는 짝수입니다.");
		} else {
			System.out.println("두 수가 짝수는 아닙니다.");
		}
		
		if((num1 % 2 ==0) || (num2 % 2 ==0)) {
			System.out.println("두 수중 하나는 짝수입니다.");
		} else {
			System.out.println("두 수 모두 짝수가 아닙니다.");
		}
		
		System.out.println("end of prog");
		
		
//		if((++num1 % 2 ==0) && (num2++ % 2 ==0)) {
//			System.out.println("두 수는 짝수입니다.");
//		} else {
//			System.out.println("두 수가 짝수는 아닙니다.");
//		}
//		System.out.println(num1 + ", " + num2);	//11, 20
		
//		if((++num1 % 2 ==0) & (num2++ % 2 ==0)) {
//			System.out.println("두 수는 짝수입니다.");
//		} else {
//			System.out.println("두 수가 짝수는 아닙니다.");
//		}
//		System.out.println(num1 + ", " + num2);	//11, 21
		
		
		if((++num1 % 2 ==0) || (num2++ % 2 ==0)) {
			System.out.println("두 수중 하나는 짝수입니다.");
		} else {
			System.out.println("두 수 모두 짝수가 아닙니다.");
		}
		
		System.out.println(num1 + ", " + num2);	//11, 21

	}

}
