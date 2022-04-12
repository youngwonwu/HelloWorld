package co.edu.loop;

public class ForExample {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i = 1; i <= 5; i++) {
			sum = sum + 3;
			//i = 1, sum = 3;
			//i = 2, sum = 6;
			//i = 3, sum = 9;
			//i = 4, sum = 12;
			//i = 5, sum = 15;
		}
		System.out.println("sum => " + sum);
		
		System.out.println("===========================================");
		 
//		System.out.println("3 * 1 = 3");
//		System.out.println("3 * 2 = 6");
//		System.out.println("3 * 3 = 9");
//		System.out.println("3 * 9 = 27");
		for(int i = 1; i <= 9; i++) {
			System.out.println("3 * " + i + " = " + (3 * i));
		}
		
		System.out.println("===========================================");
		
		for(int i = 9; i >= 1; i--) {
			System.out.println("3 * " + i + " = " + (3 * i));
		}
		
		System.out.println("===========================================");
		
		//5단 1 ~ 9 코드 작성
		int val = 5;
		for(int i = 1; i <= 9; i++) {
			System.out.println(val + " * " + i + " = " + (val * i));
		}
		
		System.out.println("===========================================");
		
		sum = 0;
		for(int i = 1; i <= 9; i+=2) {
			sum = sum + i;
		}
		System.out.println("sum => " + sum);
		
		System.out.println("===========================================");
		
		for(int i = 2; i <= 10; i++) {
			if ( i % 2 == 0 ) {	//더하는 값 i의 수가 짝수일 때만
				sum = sum + i;
			}
		}
		System.out.println("sum => " + sum);

	}

}
