package co.edu.dimension;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {

		//P201 6)
		Scanner scn = new Scanner(System.in);
		
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		
		while(run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("--------------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = Integer.parseInt(scn.nextLine());
			//잘못된 순서를 처리를 하려는 경우에 대해서 메세지 보여주기
			if(selectNo == 2 || selectNo == 3 || selectNo == 4) {	//selectNo =! 1 && scores == null 더 간단하게 할 수도 있다.
				if(scores == null) {	// null 지정을 안하면 학생수를 지정해도 학생수를 지정하라고 나온다
					System.out.println("학생수를 지정하세요");
					continue;
				}
			}
			
			if (selectNo == 1) {	//학생수
				System.out.print("학생수> ");
				studentNum = Integer.parseInt(scn.nextLine());
				scores = new int[studentNum];
				
			} else if (selectNo == 2) {	//점수입력
				for(int i=0; i<scores.length; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = Integer.parseInt(scn.nextLine());
				}
				
			} else if (selectNo == 3) {	//점수리스트
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores[" + i + "]> " + scores[i]);
				}
				
			} else if (selectNo == 4) {	//분석
				int maxVal, sum;
				maxVal = sum = 0;	//변수초기화
				for(int i=0; i<scores.length; i++) {
					sum += scores[i];
					if(scores[i] > maxVal) {
						maxVal = scores[i];
					}
				}
				System.out.println("최고 점수는 " + maxVal);
				System.out.printf("평균 점수: %3d\n", sum / scores.length);
				
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
		
	}

}
