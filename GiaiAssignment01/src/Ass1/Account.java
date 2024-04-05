package Ass1;

public class Account  {
	int accountID;
	String email;
	String userName;
	String fullName;
	Department department;
	Position position;
	@Override
	public String toString() {
		return "\n Account [accountID=" + accountID + ", email=" + email + ", userName=" + userName + ", fullName="
				+ fullName + "] " + department  + position ;
	}
	
	
}
