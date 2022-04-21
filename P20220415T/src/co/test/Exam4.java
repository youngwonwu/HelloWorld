package co.test;

//클래스의 생성과 필드, 메소드, 생성자.
public class Exam4 {
	// 친구의 이름, 생일, 연락처(중복값이 없는 키의 역할)
	//이름하나찾아서 바꿔
	//이름하나 찾아서 연락처 바꿔
	
	private String name;
	private String birthday;
	private String phone;
	
	//기본생성자
	public Exam4 () {
		
	}
	
	public Exam4(String name, String birthday, String phone) {
		super();
		this.name = name;
		this.birthday = birthday;
		this.phone = phone;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}


	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Exam4 [name=" + name + ", birthday=" + birthday + ", phone=" + phone + "]";
	}
	
	
}
