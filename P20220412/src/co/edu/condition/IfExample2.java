package co.edu.condition;

public class IfExample2 {

	public static void main(String[] args) {
		
		int num = 18;
		
		//2의 배수인지 3의 재수인지 아니면 2,3,의 공통배수
		
		if ((num%2 == 0) && (num%3 == 0)) {
			System.out.printf("%d는 2와 3의 공통배수입니다.", num);
		} else if (num % 2 ==0) {
			System.out.printf("%d는 2의 배수입니다.", num);
		} else if (num % 3 == 0){
			System.out.printf("%d는 3의 배수입니다.", num);
		} else {
			System.out.printf("%d는 2와 3의 배수가 아닙니다.", num);
		}

	}

}
