package co.edu.board;

import java.util.ArrayList;
import java.util.Scanner;

class BoardApp implements BoardService{

	ArrayList<Board> boards = new ArrayList<Board>();
	Scanner scn = new Scanner(System.in);

	@Override
	public void add(Board board) {
		boards.add(board);
	}

	@Override
	public void modity(Board board) {
		
		for(int i=0; i<boards.size(); i++) {
			Board findBoard = boards.get(i);
			if(findBoard.getBoardNO() == board.getBoardNO()) {
				boards.set(i, board);
			}
		}
	}

	@Override
	public void delete(Board board) {
		for(int i=0; i<boards.size(); i++) {
			Board removeBoard = boards.get(i);
			if(removeBoard.getBoardNO() == board.getBoardNO()) {
				boards.remove(removeBoard);
			} else {
				System.out.println("삭제할 게시글번호가 없습니다.");
			}
		}
	}

	@Override
	public Board search(Board board) {
		for(int i=0; i<boards.size(); i++) {
			Board listBoard = boards.get(i);
			if(listBoard.getBoardNO() == board.getBoardNO()) {
				return listBoard;
			}
		}
		return null;
	}

	@Override
	public ArrayList<Board> list(Board board) {
		return boards;
	}
	

}
