package co.edu;

public class BoardList {

	private Board[] boards;	//필드 값
	
	//배열크기 초기화
	public void init(int size) {	//board초기값,
		boards = new Board[size];
	}
	
	//배열에 입력(기능)
	public int addBoard(Board board) {	//매개변수 클래스는 받아올수있다
		//더이상 저장공간 없을때->false
		//boolean check = false;
		int errorCase = -1;	//저장공간이없음
		for (int i=0; i<boards.length; i++) {
			if(boards[i] != null && boards[i].getBoardNo() == board.getBoardNo()) {	//같은 번호가 있는지 확인
				errorCase = 1;	//동일한 값이 있을 경우의 에러
				break;
			}
			if(boards[i] == null) {
				boards[i] = board;
				errorCase = 0;	//정상처리
				break;	//
			}
		}
		return errorCase;
	}
	
	//수정 : 게시글번호 찾아서 내용, 제목 변경
	public boolean modifyBoard(Board board) {
		boolean check = false;
		for(int i=0; i<boards.length; i++) {
			if(boards[i].getBoardNo() == board.getBoardNo()) {
				boards[i].setContent(board.getContent());
				boards[i].setTitle(board.getTitle());
				check = true;
				break;	//담겨있는 배열보다 더 넣지 않게
			}
		}
		return check;
	}
	
	//삭제: 게시글 번호만 알고 있으면 됨
	public boolean removeBoard(int bNo) {
		boolean check = false;
		for(int i=0; i<boards.length; i++) {
			if(boards[i].getBoardNo() == bNo) {
				boards[i] = null;	//배열의 위치 null대입
				check = true;
				break;
			}
		}
		return check;
	}
	
	//게시글조회: 게시글 번호만 알고 있으면 됨
	public Board searchBoard(int bNo) {
		for(int i=0; i<boards.length; i++) {
			if(boards[i].getBoardNo() == bNo) {
				int currentCnt = boards[i].getSearchCnt();
				boards[i].setSearchCnt(currentCnt + 1);	//카운트 증가
					
				return boards[i];
			}
		}
		return null;
	}
	
	//작성자이름 조회 : 
	public Board sNameBoard(String bWriter) {
		for(int i=0; i<boards.length; i++) {
			boards = new Board[boards.length];
			if(boards[i].getWriter().equals(bWriter)) {
				
				return boards[i];
			}
		}
		return null;
	}
	
	//게시물 목록
	public Board[] boardList() {
		return boards;
	}

}
