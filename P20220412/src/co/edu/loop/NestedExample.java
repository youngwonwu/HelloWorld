package co.edu.loop;

public class NestedExample {

	public static void main(String[] args) {

		// 구구단
//		for (int i = 1; i <= 9; i++) {
//			System.out.println("3 * " + i + " = " + (3 * i));
//		}

//		int dan = 3;
//		for (int i = 1; i <= 9; i++) {
//			System.out.println(dan + " * " + i + " = " + (dan * i));
//		}

		for (int j = 2; j <= 9; j++) {
			int dan = j;
			for (int i = 1; i <= 9; i++) {
				System.out.println(dan + " * " + i + " = " + (dan * i));
			}
		}

		// *
		// **
		// ***
		// ****
		// *****
		for (int j = 1; j <= 5; j++) {
			for (int i = 1; i <= j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// *****
		// ****
		// ***
		// **
		// *
		for (int j = 5; j >= 1; j--) {
			for (int i = 1; i <= j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

		//     *
		//    **
		//   ***
		//  ****
		// *****
//		for (int j = 4; j >= 1; j--) {
//			for (int i = 1; i <= j; i++) {
//				System.out.print(" ");
//			}
//			for (int s = 1; s  1; s++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

	}

}
