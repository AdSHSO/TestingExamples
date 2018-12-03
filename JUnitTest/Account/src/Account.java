
public class Account {

	private int balance;
	
	Account(int x){
		this.balance = x;
	}
	
	int withdraw(int value) {
		
		if (balance - value < 0) {
			throw new IllegalArgumentException("You can only withdraw up to " + balance);
		}
		this.balance = balance - value;
		return this.balance;
	}
	
}


