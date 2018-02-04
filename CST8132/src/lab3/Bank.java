package lab3;

import java.util.Scanner;

/**
 * The bank class contains an array of accounts, and a main class that allows
 * the user to populate the accounts with data using the Scanner utility.
 * 
 * @author Ben Scanlon
 * @since 2018-02-02
 *
 */

public class Bank {

	private String bankName;
	private Account[] accounts;
	private Bank myBank;

	/**
	 * Constructor:
	 * @param Takes a string parameter and sets the member variables nankName equal to that string
	 */

	public Bank(String bankName) {

		this.bankName = bankName;

	}

	/**
	 * Get function:
	 * 
	 * @return returns the member variable bankName.
	 */
	public String getBankName() {

		return this.bankName;

	}

	/**
	 * Prints the details of each account in the accounts array
	 * 
	 * @param account
	 *            takes an Account array as an argument
	 */
	public void printAccountDetails(Account[] account) {

		System.out.println(this.bankName + "'s Banking System");
		System.out.println("----------------------------");
		for (int j = 0; j < account.length; j++) {
			System.out.println(
					"AccountNumber : " + account[j].getAccNumber() + " | Name : " + account[j].getAccHolder().getName()
							+ " | Phone Number : " + account[j].getAccHolder().getPhoneNumber() + " | Email Address : "
							+ account[j].getAccHolder().getEmailAddress() + " | Balance : " + account[j].getBalance());
		}
	}

	/**
	 * Set function:
	 * 
	 * @param sets
	 *            the length of the accounts array equal to the integer parameter
	 * 
	 */
	public void setAccounts(int arrayLength) {

		this.accounts = new Account[arrayLength];

	}

	/**
	 * Get function:
	 * 
	 * @return returns the account member variables
	 */

	public Account[] getAccounts() {

		return this.accounts;
	}

	/**
	 * Main function, calls the scanner function and allows user to enter data.
	 * After data is entered, allows user to deposit or withdraw funds, and print
	 * the details of the account
	 * 
	 */
	public static void main(String[] args) {

		// Initialize variables and instantiate Bank object to contain data

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name :");
		Bank myBank = new Bank(scanner.nextLine()); // Instantiate bank object
		System.out.println("How many account holders are in your banking system?");
		myBank.setAccounts(scanner.nextInt());

		for (int i = 0; i < myBank.accounts.length; i++) { //loop for the size of the array entered by user

			System.out.println("Enter details of account holder " + (i + 1));
			System.out.println("----------------------------------");
			System.out.println("Enter account number :");

			long accNumber = scanner.nextLong();
			scanner.nextLine();

			System.out.println("Enter first name of account holder :");
			String firstName = scanner.nextLine();
			System.out.println("Enter last name of account holder :");
			String lastName = scanner.nextLine();
			System.out.println("Enter phone number :");
			long phoneNumber = scanner.nextLong();
			scanner.nextLine();
			System.out.println("Enter email address :");
			String emailAddress = scanner.nextLine();
			System.out.println("Enter opening balance :");

			double balance = scanner.nextDouble();
			scanner.nextLine();

			myBank.accounts[i] = new Account(accNumber, new Customer(firstName, lastName));
			myBank.accounts[i].deposit(balance);
			myBank.accounts[i].getAccHolder().setEmailAddress(emailAddress);
			myBank.accounts[i].getAccHolder().setPhoneNumber(phoneNumber);

		}

		myBank.printAccountDetails(myBank.getAccounts());
		boolean bankSession = true;
		while (bankSession) {

			System.out.println("d: Deposit");
			System.out.println("w: Withdrawal");
			System.out.println("p: Print all accounts");
			System.out.println("q: End Session");
			System.out.println("Enter your option :");
			String input = scanner.nextLine();

			switch (input.toLowerCase()) {

			case "d":

				System.out.println("Enter your account index :");
				int index = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Enter deposit amount :");

				if (index < myBank.getAccounts().length) {

					myBank.accounts[index].deposit(scanner.nextDouble());

				} else {

					System.out.println("Please enter a valid index!");

					continue;
				}
				scanner.nextLine();

				break;

			case "w":

				System.out.println("Enter your account index :");
				index = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Enter withdrawal amount :");

				if (index < myBank.getAccounts().length) {
					myBank.accounts[index].withdraw(scanner.nextDouble());
				} else {

					System.out.println("Please enter a valid index!");
					continue;
				}
				scanner.nextLine();

				break;

			case "p":

				myBank.printAccountDetails(myBank.getAccounts());
				
				break;
				
			case "q":
				
				System.out.println("Goodbye!");
				bankSession = false;
				
				break;
				
			default :
				
				System.out.println("Invalid Input!");
				break;

			}

		}

	}

}
