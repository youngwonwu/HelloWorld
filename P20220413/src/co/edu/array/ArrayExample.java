package co.edu.array;

public class ArrayExample {

	public static void main(String[] args) {
		
		// 학생의 점수 30명 저장
		int score1 = 80;
		//....
		int score30 = 78;
		
		// 여려개의 같은 유형의 값을 저장
		int[] intAry = new int[30];	// 정수 int 30개 담을 공간
		intAry[0] = 30;
		intAry[4] = 40;
		intAry[29] = 55;	//intAry[30]으로하면 에러뜬다 이유는 0~30이면 31개 이니까 넘쳐서
		System.out.println(intAry[0]);
		System.out.println(intAry[1]);
		
		double[] dblAry = new double[10];	// double형태의 저장공간에 10개 담는다
		
		String[] strAry = new String[5];	// 참조변수는 초기값이 null
		System.out.println(strAry[0]);
		
		
		int[] otherAry = {10, 20, 30, 40}; //초기값 지정
		int[] theotherAry = {10, 20, 30, 40}; //초기값 지정
		System.out.println(otherAry[0]);
		
		if(otherAry == theotherAry) {
			System.out.println("same");
		}else {
			System.out.println("diff");
		}
		
		if(otherAry[0] == theotherAry[0]) {	// 배열값을 비교할려면 주소값을 불러와야한다.
			System.out.println("same");
		}else {
			System.out.println("diff");
		}
		
	}

}
