package co.edu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BoardExample {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		//BoardList에 정의해 놓은 필드와 메소드를 활용해서 기능
		BoardList boardList = new BoardList();	//인스턴스객체생성
		boardList.init(5);	//배열의 크기지정, init : 공간을 만드는 메소드
		
		while(true) {
			System.out.println("----------------------------------------------");
			System.out.println("1.추가 2.수정 3.목록 4.삭제 5.조회 6.작성자조회 9.종료");
			System.out.println("----------------------------------------------");
			System.out.print("선택>> ");
			
			//int menu = scn.nextInt();	//사용자 입력값을 숫자로 반환
			//예외발생 처리(숫자가 들어가야하는데 문자가 들어갔을 경우)
			int menu = -1;
			try {
				menu = scn.nextInt();
			} catch(InputMismatchException e) {
				System.out.println("잘못된 처리를 시도했습니다.");
			}
			
			scn.nextLine();	//nextInt를 쓰면 nextLine 써 줘라!
			
			if(menu == 1) {
				System.out.print("게시글 번호 입력>> ");
				int bNo = Integer.parseInt(scn.nextLine());
				System.out.print("제목 입력>> ");
				String bTitle = scn.nextLine();
				System.out.print("내용 입력>> ");
				String bContent = scn.nextLine();
				System.out.print("작성자 입력>> ");
				String bWriter = scn.nextLine();
				
				Board newBoard = new Board(bNo, bTitle, bContent, bWriter);	//생성자호출
				int chk = boardList.addBoard(newBoard);	//true or false가 된다
				if(chk == 0) {
					System.out.println("정상입력되었습니다.");
				} else if (chk == -1){
					System.out.println("저장공간이 없습니다.");
				} else if (chk == 1) {
					System.out.println("이미 있는 번호 입니다.");
				}
				
			}else if(menu == 2) {
				System.out.print("수정할 글번호입력>>	");
				int bNo = Integer.parseInt(scn.nextLine());
				System.out.print("변경할 제목입력>> ");
				String title = scn.nextLine();
				System.out.print("변경할 내용입력>> ");
				String content = scn.nextLine();
				
				Board cBoard = new Board(bNo, title, content, null);
				if(boardList.modifyBoard(cBoard)) {
					System.out.println("수정완료.");
				} else {
					System.out.println("수정실패");
				}
				
			}else if(menu == 3) {
				Board[] boards = boardList.boardList();	//입력한보드리스트, 초기값보드리스트
				System.out.println("게시글번호	제목		내용		사용자	조회수");
				System.out.println("===================================================");
				for(Board board : boards) {
					if(board != null) {
						board.getInfo();
					}
				}
					
			} else if(menu == 4) {
				System.out.print("삭제할 게시글번호>> ");
				int bNo = Integer.parseInt(scn.nextLine());
				//boardList.removeBoard(bNo);	//삭제처리
				if(boardList.removeBoard(bNo)) {
					System.out.println("삭제가 되었습니다.");
				} else {
					System.out.println("삭제가 안되었습니다.");
				}
				
			} else if(menu == 5) {
				System.out.print("조회할 게시글번호>> ");
				int bNo = Integer.parseInt(scn.nextLine());
				
				Board getBoard = boardList.searchBoard(bNo);
				//getBoard.getDetailInfo();
				if(getBoard == null) {
					System.out.println("조회결과 없습니다.");
				} else {
					getBoard.getDetailInfo();
				}
				
			} else if(menu == 6) {	//작성자 기준
				System.out.print("검색할 작성자 입력>> ");
				String sWriter = scn.nextLine();
				Board[] writerList = boardList.getWriterList(sWriter);
				//wirterList 내용출력
				System.out.println("게시글번호	제목		내용		사용자	조회수");
				System.out.println("===================================================");
				for(Board board : writerList) {
					if(board != null) {
						board.getInfo();
					}
				}
				
				
			}else if(menu == 9) {
				System.out.println("프로그램을 종료하겠습니다.");
				break;
			} else {
				System.out.println("정확한 메뉴를 선택하세요");
			}
		}
		System.out.println("end of prog.");
	}

}
