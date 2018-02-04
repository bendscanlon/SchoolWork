package lab3;

public class Customer {

	private String firstName;
	private String lastName;
	private long phoneNum;
	private String emailAddress;

	public Customer(String firstName, String lastName) {

		this.firstName = firstName;
		this.lastName = lastName;

	}

	public String getName() {
		
		String name = firstName +" "+lastName;

		return name;

	}

	public long getPhoneNumber() {

		return this.phoneNum;
	}

	public void setPhoneNumber(long phoneNum) {

		this.phoneNum = phoneNum;
	}

	public String getEmailAddress() {

		return this.emailAddress;

	}
	
	public void setEmailAddress(String emailAddress) {
		
		this.emailAddress = emailAddress;
	}

}
