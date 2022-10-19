package problem;

public class Client {
	
	public static AccountNumberCheck acctChecker;
	public static SecurityCodeCheck codeChecker;
	public static FundsCheck fundChecker;
	public static WelcomeToBank bankWelcome;
	
	
	public static void main(String[] args){

		bankWelcome = new WelcomeToBank();
		acctChecker = new AccountNumberCheck();
		codeChecker = new SecurityCodeCheck();
		fundChecker = new FundsCheck();
		
		int accountNumber = 12345678;
		int securityCode = 1234;
		
		withdrawCash(50.00, accountNumber, securityCode);
		withdrawCash(990.00, accountNumber, securityCode);
		depositCash(200.00, accountNumber, securityCode);
		
		

	}
	
	public static void withdrawCash(double cashToGet, int accountNumber, int securityCode){

		if(acctChecker.accountActive(accountNumber) &&
				codeChecker.isCodeCorrect(securityCode) &&
				fundChecker.haveEnoughMoney(cashToGet)) {

			System.out.println("Transaction Complete\n");

		} else {

			System.out.println("Transaction Failed\n");

		}

	}

	public static void depositCash(double cashToDeposit, int accountNumber, int securityCode){

		if(acctChecker.accountActive(accountNumber) &&
				codeChecker.isCodeCorrect(securityCode)) {

			fundChecker.makeDeposit(cashToDeposit);

			System.out.println("Transaction Complete\n");

		} else {

			System.out.println("Transaction Failed\n");

		}

	}

}
