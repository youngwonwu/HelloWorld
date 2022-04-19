package co.edu.project;

public class MySqlDAO implements DAO{

	@Override
	public void insert() {
		System.out.println("MYSQL 입력처리");
	}

	@Override
	public void update() {
		System.out.println("MYSQL 수정처리");
	}

	@Override
	public void delete() {
		System.out.println("MYSQL 삭제처리");
	}

	@Override
	public void list() {
		System.out.println("MYSQL 리스트처리");		
	}

}
