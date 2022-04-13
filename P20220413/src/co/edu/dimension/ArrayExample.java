package co.edu.dimension;

public class ArrayExample {

	public static void main(String[] args) {

		int[][] intAry = new int [4][3];
		
		intAry[0][0] = 10;
		intAry[1][0] = 20;
		intAry[3][2] = 100;
		
		for(int j=0; j<intAry.length; j++) {
			for(int  i=0; i<intAry[j].length; i++)	{	//intAry[0].length 첫번째 행의 배열
				System.out.print("[" + j + "]" + "[" + i + "] => " + intAry[j][i] + " ");
			}
			System.out.println();
		}
		
		System.out.println("=====================================");

		intAry = new int[5][5];
		int cnt = 1;
		
		for(int j=0; j<intAry.length; j++) {
			for(int i=0; i<intAry.length; i++) {
				intAry[j][i] = cnt++;
				System.out.printf("%3d",intAry[j][i]);
			}
			System.out.println();
		}
		
		System.out.println("----------------------------");
		
		//1,0 3,0
		for(int j=0; j<intAry.length; j++) {
			for(int i=0; i<intAry.length; i++) {
				intAry[j][i] = cnt++;
				System.out.println(intAry[1][i]);

			}
			System.out.println();
		}
		
		System.out.println("----------------------------");
		
		//2번째꺼 거꾸로도 해보기
		
		System.out.println("----------------------------");
		//배열에서 주소값...
		
	}

}
