package lab3;

/**
 * The Account class holds the balance of the account, and the deposit and withdraw functions
 * @author Ben Scanlon
 * @since 2018-02-04
 *
 */

public class Account {

	private long accNumber;
	private Customer accHolder;
	private double balance;
	
	/**
	 * Constructor initializes primary class variables
	 * @param accNumber is equal to the inputed value
	 * @param accHolder is equal to the inputed valuerfgdfg
	 */

	public Account(long accNumber, Customer accHolder) {

		this.accNumber = accNumber;
		this.accHolder = accHolder;
		this.balance = 0; //initial balance is 0

	}
	
	/**
	 * Adds money to the balance of the account
	 * @param depAmount is added to the current balance
	 */

	public void deposit(double depAmount) {
		
		balance += depAmount;

	}

	/**
	 * Takes money from the balance of the account
	 * @param wDAmount is subtracted from the current balance
	 * @return returns the amount of money withdrawn, 0 if the funds are not available
	 */
	public double withdraw(double wDAmount) {
		
		if(wDAmount <= balance) {
			balance -= wDAmount;
			
		}else {
			
			System.out.println("Insufficient funds!");
			wDAmount = 0;
		}
		return wDAmount;

	}
	
	/**
	 * Get function:
	 * @return returns the account number
	 */
	
	public long getAccNumber() {
		
		return this.accNumber;
	}
	
	/**
	 * Get function:
	 * @return returns the name of the account holder
	 */
	
	public Customer getAccHolder() {
		
		return this.accHolder;
	}
	
	/**
	 * Get function:
	 * @return returns the current balance of the account 
	 */
	
	public double getBalance() {
		
		return this.balance;
	}

}
