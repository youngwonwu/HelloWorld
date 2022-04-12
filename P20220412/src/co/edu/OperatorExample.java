package co.edu;

public class OperatorExample {

	public static void main(String[] args) {
		
		//증감연산자
		int num1 = 10;
		num1 = num1 + 2;	//num1의 값을 읽고 처리된 결과값을 대입
		num1 = num1 + 2;	//num1의 값을 읽고 처리된 결과값을 대입
		System.out.println(num1);
		
		num1 = num1 + 1;
		num1 += 1;
		num1++;	//1을 누적연산
		System.out.println(num1);	//17
		System.out.println(num1++);	//출력처리 +1
		System.out.println(num1);	//18
		
		System.out.println(++num1);	//+1을 출력처리
		
		int num2 = 20;
		int result = num1++ + ++num2;	//19 + 21
		System.out.println(result);	//40
		System.out.println(result + ", num1: " + num1 + ", num2: " + num2);	//40, num1: 20, num2: 21
		
		
		byte num3 = 10;	//byte < short < int < long
		num3 = (byte) (num3 + 1);	//정수연산은 int타입으로 처리, num3가 byte이니까 casting을 해줘야 한다
		num3 += 1;
		num3++;
		System.out.println(num3);	//13
		
		num3 = 125;
		num3++;	//126
		num3++;	//127
		num3++;	//-128
		num3++;	//-127
		num3++;	//-126
		System.out.println(num3);	//-126
		
		num3 = -125;
		num3--;	//-126
		num3--;	//-127
		num3--;	//-128
		num3--;	//127
		num3--;	//126
		System.out.println(num3);	//126

	}

}
