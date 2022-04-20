package co.edu.board;

import java.util.Scanner;

public class BoardExe {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		BoardService service = new BoardApp();
		
		while(true) {
			System.out.println("1.글등록 2.글수정 3.글삭제 4.글상세조회(글번호) 5.전체목록 6.종료");
			System.out.println("선택>> ");
			int menu = scn.nextInt();
			
			if(menu == 1) {
				System.out.println("게시글 번호입력>> ");
				int number = scn.nextInt();
				System.out.println("게시글 제목입력>> ");
				String title = scn.nextLine();
				System.out.println("게시글 내용입력>> ");
				String contents = scn.nextLine();
				System.out.println("게시글 작성자입력>> ");
				String writer = scn.nextLine();
				System.out.println("게시글 작성일시입력>> ");
				String date = scn.nextLine();
				
				Board newBaord = new Board(number, title, contents, writer, date);
				
				
			} else if(menu == 2) {
				System.out.println("");
			} else if(menu == 3) {
				
			} else if(menu == 4) {
				
			} else if(menu == 5) {
				
			} else if(menu == 6) {
				System.out.println("end of prog.");
				break;
			}
		}
	}
}
