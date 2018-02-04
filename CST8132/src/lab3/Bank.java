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
	

	/**
	 * Constructor:
	 * 
	 * @param Takes
	 *            a string parameter and sets the member variables nankName equal to
	 *            that string
	 */

	public Bank(String bankName, int bankSize) {

		this.bankName = bankName;
		this.accounts = new Account[bankSize];

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
	 * Get function:
	 * 
	 * @return returns the account member variables
	 */

	public Account[] getAccounts() {

		return this.accounts;
	}
	
	/**
	 * Instantiate new account and customers objects and populate them using user input
	 * Creates new set of objects for each array element
	 */

	public void initAccount() {

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < accounts.length; i++) { // loop for the size of the array entered by user

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

			accounts[i] = new Account(accNumber, new Customer(firstName, lastName));
			accounts[i].deposit(balance);
			accounts[i].getAccHolder().setEmailAddress(emailAddress);
			accounts[i].getAccHolder().setPhoneNumber(phoneNumber);

		}

	}
	
	/**
	 * Allow user to interact with their account, selecting 1 index relating to one account / customer
	 * Session will continue until terminated by the user
	 */

	public void userSession() {

		Scanner scanner = new Scanner(System.in);
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

				if (index < accounts.length) {

					accounts[index].deposit(scanner.nextDouble());

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

				if (index < accounts.length) {
					accounts[index].withdraw(scanner.nextDouble());
				} else {

					System.out.println("Please enter a valid index!");
					continue;
				}
				scanner.nextLine();

				break;

			case "p":

				printAccountDetails(this.accounts);

				break;

			case "q":

				System.out.println("Goodbye!");
				bankSession = false;

				break;

			default:

				System.out.println("Invalid Input!");
				break;

			}

		}

	}

	/**
	 * Main function, instantiates a new Bank object and calls its methods
	 * 
	 */
	public static void main(String[] args) {

		// Initialize variables and instantiate Bank object to contain data

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name :");
		String name = scanner.nextLine();
		System.out.println("How many account holders are in your banking system?");
		int bankSize = scanner.nextInt();
		scanner.nextLine();
		
		Bank myBank = new Bank(name, bankSize); // Instantiate bank object
		myBank.initAccount();
		myBank.printAccountDetails(myBank.getAccounts());
		myBank.userSession();

	}

}
