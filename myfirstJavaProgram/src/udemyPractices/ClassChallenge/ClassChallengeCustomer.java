package udemyPractices.ClassChallenge;

public class ClassChallengeCustomer {
	
	/*
	 * Create a new class VipCustomer it should have 3 fields name, credit limit, and email address. 
	 * create 3 constructors 
	 * 1st constructor empty should call the constructor with 3 parameters with default values 
	 * 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd 
	 * 3rd constructor should save all fields. 
	 * create getters only for this using code generation of intellij as setters wont be needed test and confirm it works.

	 */
	
	private String customerName;
	private long creditLimit;
	private String customerEmailString;
	
	//1st constructor

	public ClassChallengeCustomer() {

		this("default name",10000,"default@email.com");
	}
	//2nd 
	public ClassChallengeCustomer(String customerName, long creditLimit) {
		this(customerName,creditLimit,"default@email.com");
		
	}
	//3rd
	public ClassChallengeCustomer(String customerName, long creditLimit, String customerEmailString) {
		this.customerName = customerName;
		this.creditLimit = creditLimit;
		this.customerEmailString = customerEmailString;
	}
	public String getCustomerName() {
		return customerName;
	}
	public long getCreditLimit() {
		return creditLimit;
	}
	public String getCustomerEmailString() {
		return customerEmailString;
	}
	

}
