package co.edu.array;

public class ArrayExample3 {

	public static void main(String[] args) {

		int[] intAry = {78, 83, 88, 92, 63};
		// 각 배열의 요소 합을 구하는 코드, 변수는 sum 선언, for 반복문
		int sum = 0;
		for(int i=0; i<5; i++) {
			sum = sum + intAry[i];
		}
		System.out.println("합게: " + sum);
		
		//double 평균값
		double avg = 0;
		avg = sum / 5.0;
		System.out.println("평균값 : " + avg);
		
		//짝수 평균값
		avg = 0;
		sum = 0;
		for(int i=0; i<intAry.length; i++) {
			if(intAry[i]%2 == 0)
			sum = sum + intAry[i];
		}
		avg = sum / 3;
		System.out.println("짝수 배열 평균값: " + avg);
			
		//짝수 합, 평균값
		avg = 0;
		sum = 0;
		for(int i=0; i<5; i+=2) {
			sum = sum + intAry[i];
		}
		
		//짝수 합, 평균값
		avg = 0;
		sum = 0;
		int cnt = 0;
		for(int i=0; i<intAry.length; i++) {
			if(intAry[i]%2 == 0) {	// 0이 아니라 1이면 홀수번째
				sum = sum + intAry[i];
				cnt++;
			}
		}
		avg = 1.0 * sum / cnt;	//1.0 를 곱한 이유는 double타입으로 계산하려고
		System.out.println("짝수 배열 합: " + sum);
		System.out.println("짝수 배열 평균값: " + avg);
	}

}
