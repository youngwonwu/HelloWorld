package co.edu;

public class ReferenceExam {

	public static void main(String[] args) {

		// 기본타입
		int num1 = 100;
		int num2 = 100;

		if (num1 == num2) {
			System.out.println("같은 값입니다.");
		} else {
			System.out.println("다른 값입니다.");
		}

		// 참조타입
		String str1 = new String("홍길동"); // 인스턴스
		String str2 = new String("홍길동"); // 인스턴스

//		if(str1 == str2) {	//참조변수 == 주소값으로 비교하기 때문에 다름
//			System.out.println("같은 값입니다.");
//		} else {
//			System.out.println("다른 값입니다.");
//		}
		if (str1.equals(str2)) { // 참조변수 값을 비교할려면 equals메소드를 사용해 비교
			System.out.println("같은 값입니다.");
		} else {
			System.out.println("다른 값입니다.");
		}

		str1 = null;
		str1 = "김길동";
		if (str1.equals(str2)) {
			System.out.println("같은 값입니다.");
		} else {
			System.out.println("다른 값입니다.");
		}

	}

}
