package co.edu.condition;

public class IfExample4 {

	public static void main(String[] args) {
		
		// 임의의 값을 생성해주는 Math.random()
//		double randomVal;
//		double randomVal = Math.random() * 10;
//		randomVal = (int) (Math.random() * 10) + 1;	//반환값이 double, 0 <= 값 < 1
//		randomVal = (int) (Math.random() * 100) + 1;	//Math.random() 은 0.0000000..으로 나오는데 int로 반환하면서 소수점아래를 날려버린다
//		int randomVal = (int) (Math.random() * 100) + 1;
//		System.out.println(randomVal);
		
		//생성된 값이 1 ~ 50까지
		//생성되 값이 51 ~ 60까지
		//61 ~ 70, 70 ~ 80, 81 ~ 90, 91 ~ 100 범위
		int randomVal = (int) (Math.random() * 100) + 1;
		System.out.println(randomVal);
		if ((randomVal >= 1) && (randomVal <= 50)) {
			System.out.println("생성된 값은 1 ~ 50까지 범위 값");
		} else if ((randomVal >= 51) && (randomVal <= 60)) {
			System.out.println("생성된 값은 51 ~ 60까지 범위 값");
		} else if ((randomVal >= 61) && (randomVal <= 70)) {
			System.out.println("생성된 값은 61 ~ 70까지 범위 값");
		}
		System.out.println("생성된 값은 61 ~ 70까지 범위 값");
	}

}
