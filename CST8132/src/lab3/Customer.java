package lab3;

/**
 * The Customer class contains the customers name and contact information
 * @author Ben Scanlon
 * @since 2018-02-04
 */

public class Customer {

	private String firstName;
	private String lastName;
	private long phoneNum;
	private String emailAddress;
	
	/**
	 * Constructor initializes primary class variables
	 * @param firstName is equal to inputed value
	 * @param lastName is equal to inputed value
	 */

	public Customer(String firstName, String lastName) {

		this.firstName = firstName;
		this.lastName = lastName;

	}
	
	/**
	 * Get function:
	 * @return returns the first and last name as a single string called name
	 */

	public String getName() {
		
		String name = firstName +" "+lastName;

		return name;

	}
	
	/**
	 * Get Function:
	 * @return returns the customers phone number
	 */

	public long getPhoneNumber() {

		return this.phoneNum;
	}
	
	/**
	 * Set function:
	 * @param phoneNum sets the phone number equal to the inputed value
	 */

	public void setPhoneNumber(long phoneNum) {

		this.phoneNum = phoneNum;
	}
	
	/**
	 * Get function:
	 * @return returns the customers email address
	 */

	public String getEmailAddress() {

		return this.emailAddress;

	}
	
	/**
	 * Set function:
	 * @param emailAddress sets the email address equal to the inputed value
	 */
	
	public void setEmailAddress(String emailAddress) {
		
		this.emailAddress = emailAddress;
	}

}
