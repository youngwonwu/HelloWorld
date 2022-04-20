package co.edu.board;

public class Board {
	
	private int boardNO;
	private String title;
	private String contents;
	private String writer;
	private String date;
	
	
	public Board(int boardNO, String title, String contents, String writer, String date) {
		super();
		this.boardNO = boardNO;
		this.title = title;
		this.contents = contents;
		this.writer = writer;
		this.date = date;
	}

	
	public int getBoardNO() {
		return boardNO;
	}

	public void setBoardNO(int boardNO) {
		this.boardNO = boardNO;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}


	@Override
	public String toString() {
		return "Board [boardNO=" + boardNO + ", title=" + title + ", contents=" + contents + ", writer=" + writer
				+ ", date=" + date + "]";
	}

}
