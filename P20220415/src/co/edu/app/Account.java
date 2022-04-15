package co.edu.app;

public class Account {
	
	//필드 : 계좌번호(유니크), 예금주, 잔액
	//		문자열,				int
	//생정자 : 
	//Getter,Setter
	
	//필드
	private String accNumber;
	private String accUser;
	private int accBalance;
	
	//생성자
	public Account(String accNumber, String accUser, int accBalance) {
		super();
		this.accNumber = accNumber;
		this.accUser = accUser;
		this.accBalance = accBalance;
	}

	//메소드
	public String getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}

	public String getAccUser() {
		return accUser;
	}
	public void setAccUser(String accUser) {
		this.accUser = accUser;
	}

	public int getAccBalance() {
		return accBalance;
	}
	public void setAccBalance(int accBalance) {
		this.accBalance = accBalance;
	}
	
	
	public void getInfo() {
		System.out.printf("%10s %4s %7d \n",this.accNumber, this.accUser, this.accBalance);
	}
	
	
	

}
