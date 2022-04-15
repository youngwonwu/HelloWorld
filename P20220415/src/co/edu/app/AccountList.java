package co.edu.app;

public class AccountList {
	
	private static Account[] accounts;
	
	public void addAccount(Account account) {	//은행 전체
		for(int i=0; i<accounts.length; i++) {
			if(accounts[i] == null) {
				accounts[i] = account;
				break;
			}
		}
	}
	
	public static Account[] accountList() {
		return accounts;
	}

}
