package co.edu;

public class CalExample {

	public static void main(String[] args) {

		Calculator c1 = new Calculator();
		
		c1.printPi();
		c1.getArea(2.4);
		
		int result1 = c1.sum(30, 23);
		System.out.println("두수의 합 : " + result1);
		double result2 = c1.sum(23.4, 30);
		System.out.println("두수의 합 : " + result2);
		
		double result3 = c1.getTriangleArea(24, 15.5);
		System.out.println("삼각형의 넚이는 : " + result3);
		
		int[] intAry = {10, 20, 30, 40};
		int result4 = c1.sum(intAry);
		System.out.println("배열의 합 : " + result4);
		
		double result5 = c1.average(10, 20, 25);
		System.out.println("평균 : " + result5);
		
		double result6 = c1.average(10, 20, 30, 40, 50);
		System.out.println("평균 : " + result6);
	}

}
