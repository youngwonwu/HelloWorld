package co.edu.friend;

public class ComFriend extends Friend {

	private String company;
	private String department;
	
	//부모클래스 생성자 호출
	public ComFriend() {
		super();
	}
	
	public ComFriend(String name, String phone, String company, String department) {
		super(name, phone);
		this.company = company;
		this.department = department;
	}

	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}

	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	@Override
	public void setPhone(String phone) {
		//super.setPhone(phone);
		super.setPhone("연락처는" + phone);
	}

	@Override
	public String toString() {		//this.getName해도 된다, 부모 상속받아서 가능, super.name이 안되는 것은 필드를 private으로 지정해 둬서
		return "ComFriend [name=" + super.getName() + ", phone=" + super.getPhone()  + ", company=" + company + ", department=" + department + "]";
	}
	
	
	
	
	
}
