package co.edu;

public class Member {
	
	//필드 = > 회원아이디, 회원이름, 회원연락처, 회원나이
	private String memberId;	//private Member클래스안에서만 호출이 가능
	private String memberName;
	private String memberPhone;
	private int memberAge;	//나이는 0보다 커야한다
	
	
	//생성자
	public Member(String memberId, String memberName, String memberPhone, int memberAge) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.memberPhone = memberPhone;
		this.memberAge = memberAge;
	}
	
	
	//메소드
	void showInfo() {
		System.out.printf("회원이름 %4s\n연락처 %13s\n나이 %2d\n", memberName, memberPhone, memberAge);
	}
	
	//private한 memberAge를 메소드를 통해 age값 바꿔주기
//	void setMemberAge(int age) {
//		memberAge = age;
//	}
	void setMemberAge(int age) {
		if(age < 0) {
			memberAge = 10;
		} else {
			memberAge = age;
		}
	}
	int getMemberAge() {	//memberAge는 int형이라서 void말고 int로, get으로 하면 리턴 해줘야함
		return memberAge;	//
	}

	
	void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	String getMemberId() {
		return memberId;
	}
	
	
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}


	public String getMemberPhone() {
		return memberPhone;
	}
	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}
	
}
