package co.edu.api;

public class WrapperExample {

	public static void main(String[] args) {

		//웹퍼클래스
		//기본데이터형 -> 참조데이터로
		//박싱		-> 언박싱
		//int, long, byte, float -> Interger, Long, Byte, Float
		
//		int n1 = 100;
//		Integer n2 = 200;	//박싱
//		byte b1 = n2.byteValue();	//byteValue(): return되는 타입이 byte타입
//		System.out.println(b1);
		
		int n1 = 100;
		Integer n2 = new Integer(200);	//200;
		n1 = n2;	//언박싱
		byte b1 = n2.byteValue();	//byteValue(): return되는 타입이 byte타입
		System.out.println(b1);
		
		Float f1 = 12.3F;
		
		Integer.parseInt("100");
		Double.parseDouble("123.456");
		
	}

}
