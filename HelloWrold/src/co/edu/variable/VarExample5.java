package co.edu.variable;

public class VarExample5 {

	public static void main(String[] args) {
		int val =10;	//4 * 1byte => 1byte = 8 * bit; 값이 on/off
		
		System.out.println(Integer.MAX_VALUE);
		
		long val2 = 2147483648L;	//long형 지정하고 싶으면 L이나 l 지정해야함
		long val3 = 10;	//10 -> long 변환(int형인 10이 long형이 안되지만 promotion 자동형 변환으로 됨 아니면, 뒤에 L or l)
		
		int val4 = (int) 2147483648L;	//long -> int (casting:강제형변환 큰값을 변환할때는 값에 손실이 있음)
		
		int result = (int) (100000000000000000L / 5);	//
		
		long val5 = 10000000000L;
		long val6 = 10L;
		result = (int) (val5 - val6);	//casting:강제형변환
		System.out.println(result);	//버려진값?
		
		char charLit = 97;	//0 ~ 65535까지의 정수값에
		System.out.println(charLit);
		charLit = 44032;
		System.out.println(charLit);
		System.out.println((int)charLit);

		System.out.println(charLit++);
		System.out.println(charLit++);
		System.out.println(charLit++);
		System.out.println(charLit++);
		System.out.println(charLit++);
		System.out.println(charLit++);
		System.out.println(charLit++);
		System.out.println(charLit++);
		System.out.println(charLit++);
		System.out.println(charLit++);
	}

}
