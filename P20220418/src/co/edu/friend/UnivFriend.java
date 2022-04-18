package co.edu.friend;

public class UnivFriend extends Friend {
	
	private String univ;
	private String major;

	
	public UnivFriend(String name, String phone, String univ, String major) {
		super(name, phone);	//부모클래스 생성자를 사용해서 부모 필드 가져오겠다
		this.univ = univ;
		this.major = major;
	}

	public String getUniv() {
		return univ;
	}
	public void setuNiv(String univ) {
		this.univ = univ;
	}

	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {		//this.getName해도 된다, 부모 상속받아서 가능
		return "UnivFriend [name=" + super.getName() + ", phone=" + super.getPhone() + ", univ=" + univ + ", major=" + major + "]";
	}

}
