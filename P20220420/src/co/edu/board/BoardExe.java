package co.edu.board;

import java.util.ArrayList;
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
				service.add(newBaord);
				
			} else if(menu == 2) {
				System.out.println("게시글 번호>> ");
				int number = scn.nextInt();
				System.out.println("수정할 제목입력>> ");
				String title = scn.nextLine();
				System.out.println("수정할 내용입력>> ");
				String contents = scn.nextLine();
				System.out.println("수정할 작성자입력>> ");
				String writer = scn.nextLine();
				System.out.println("수정할 작성일시입력>> ");
				String date = scn.nextLine();
				
				Board mboard = new Board(number, title, contents, writer, date);
				service.modity(mboard);
				
			} else if(menu == 3) {
				System.out.println("삭제할 게시판 입력>> ");
				int number = scn.nextInt();
				service.delete(number);
				
			} else if(menu == 4) {
				System.out.println("조회할 게시판 입력>> ");
				int number = scn.nextInt();
				Board search = service.search(number);
				System.out.println("search");
				
			} else if(menu == 5) {
				ArrayList<Board> list = service.list(Board);
				for(Board board : list) {
					System.out.println(board.toString());
				}
				
			} else if(menu == 6) {
				System.out.println("end of prog.");
				break;
			}
		}
	}
}
