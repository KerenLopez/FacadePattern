package facadePattern;

public class SecurityCodeCheck {
	private int securityCode = 1234;

	public int getSecurityCode() {
		return securityCode; 
	}

	public boolean isCodeCorrect(int secCodeToCheck){
		boolean isCorrect=true;
		if(secCodeToCheck == getSecurityCode()) {

			return isCorrect;

		} else {

			return !isCorrect;

		}

	}
}
