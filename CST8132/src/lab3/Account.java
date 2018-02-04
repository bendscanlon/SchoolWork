package lab3;

public class Account {

	private long accNumber;
	private Customer accHolder;
	private double balance;

	public Account(long accNumber, Customer accHolder) {

		this.accNumber = accNumber;
		this.accHolder = accHolder;

	}

	public void deposit(double depAmount) {
		
		balance += depAmount;

	}

	public double withdraw(double wDAmount) {
		
		if(wDAmount <= balance) {
			balance -= wDAmount;
			
		}else {
			
			System.out.println("Insufficient funds!");
			wDAmount = 0;
		}
		return wDAmount;

	}
	
	public long getAccNumber() {
		
		return this.accNumber;
	}
	
	public Customer getAccHolder() {
		
		return this.accHolder;
	}
	
	public double getBalance() {
		
		return this.balance;
	}

}
