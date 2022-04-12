package co.edu.condition;

public class IfExample {

	public static void main(String[] args) {
		
		//90점보다 크면 A,80점보다 크면 B, 7점보다 크면 C, 나머지 F
		int score = 75;
		if(score >= 90) {
			System.out.println("A학점");
		} else {
			if (score >= 80) {
				System.out.println("B학점");
			} else {
				if (score >=70 ) {
					System.out.println("C학점");
				} else {
					System.out.println("F학점");
				}
			}
		}
		
		if(score >= 90) {
			System.out.println("A학점");
		} else if (score >= 80) {
				System.out.println("B학점");
		} else if (score >=70 ) {
				System.out.println("C학점");
		} else {
				System.out.println("F학점");
		}
		
		//구분
		if (score >= 90) {
			System.out.println("A학점");
		}
		if (score >= 80) {
			System.out.println("B학점");
		}
		if (score >= 70) {
			System.out.println("C학점");
		}
		if (score < 70) {
			System.out.println("F학점");
		}
		
	}

}

