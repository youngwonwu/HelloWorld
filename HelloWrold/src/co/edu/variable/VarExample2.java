package co.edu.variable;

public class VarExample2 {
	public static void main(String[] args) {
		//국어점수 80, 영어점수 70, 수학점수 69
		//평균 변수 선언.
		
		int korScore = 80;
		int engScore = 70;
		int mathScore = 69;
		
		int result = (korScore + engScore + mathScore) / 3;
		
		//국어 85, 영어 75, 수학 60
		korScore = 85;
		engScore = 75;
		mathScore = 60;
		
		double avg = (korScore + engScore + mathScore) / 3.0;
		
		System.out.println(korScore + "점," + engScore + "점," + mathScore + "점의 평균은 : " + avg + "입니다.");
	}
}
