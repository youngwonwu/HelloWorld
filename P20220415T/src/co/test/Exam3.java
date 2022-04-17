package co.test;

// 배열의 사용.
// 크기가 10인 배열에 1 ~ 10까지의 임의의 수를 저장.
// 평균값보다 큰 값을 새로운 배열에 저장하도록 하세요.
public class Exam3 {
	public static void main(String[] args) {
		
		int[] a = new int[10];
		int sum=0;
		
		for(int i=0; i<10; i++) {
			int num = (int) (Math.random()*10) + 1;
			a[i] = num;
			sum += num;
		}
		int avg = sum / 10;
		System.out.println("평균 : " + avg);
		
		//배열 잘 모르겠으....
		
	}
}
