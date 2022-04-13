package co.edu.dimension;

public class ArrayExample2 {

	public static void main(String[] args) {

		// 학급 1 ~ 3반
		//1반 : 3명 점수
		//2반 : 4명 점수
		//3반 : 2명 점수
		
		int[][] scores = { 
				{59, 63, 72}, 
				{56, 77, 33, 24}, 
				{55, 76} };
		System.out.println(scores[0][0]);
		System.out.println(scores[0].length);	//배열의 배열크기
		System.out.println(scores[1].length);
		System.out.println(scores[2].length);
		
		System.out.println("----------------------------");
		
		double avg = 0;
		for(int j=0; j<scores.length; j++) {
			int sum = 0;
			for(int i=0; i<scores[j].length; i++) {
				sum = sum + scores[j][i];
			}
			avg = sum / scores[j].length;
			System.out.printf("%d반의 합께: %3d, 평균 : %.1f\n", (j + 1),sum,avg);
		}
		
	}

}
