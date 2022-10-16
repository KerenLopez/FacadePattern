package facadePattern;

public class AccountNumberCheck {
	
	private int accountNumber = 12345678;

	public int getAccountNumber() {
		return accountNumber; 
	}

	public boolean accountActive(int acctNumToCheck){
		
		boolean check;

		if(acctNumToCheck == getAccountNumber()) {
			check = true;
			
		} else {
			check = false;
		}
		return check;
	}
}
