package co.edu.board;

import java.util.ArrayList;

public interface BoardService {
	
	public void add(Board board);
	public void modity(Board board);
	public void delete(Board board);
	public Board search(Board board);	//하나만 조회해서
	public ArrayList<Board> list(Board board);	//목록을 다 조회해서

}
