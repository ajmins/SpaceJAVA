package udemyPractices.ClassChallenge;

//main class: ClassChallengeMain

/*
 * PROBLEM STATEMENT
 * 	/*
	 * Create a new class for a bank account Create fields for 
	 * the account number, balance, customer name, email and phone number.
	 * Create getters and setters for each field 
	 * Create two additional methods 
	 * 1. To allow the customer to deposit funds (this should increment the balance field). 
	 * 2. To allow the customer to withdraw funds. 
	 * This should deduct from the balance field, but not allow the withdrawal 
	 * to complete if their are insufficient funds. 
	 * You will want to create various code in the Main class  to confirm your code is working. 
	 * Add some System.out.println's in the two methods above as well.
*/
public class ClassChallengeBank {
	
	
	private String customerName;
	private String emailId;
	private long phoneNumber;
	private long accountNumber;
	private double balance;

	//default constructor
	
	public ClassChallengeBank()
	{
		//this() is used to call one constructor from the other of the same class. 
		//It refers to the constructor of the same class whose parameters matches with the parameters passed to this(parameters).
		this("Default Name", "Default email", 1234567890, 12345, 0.0);
		System.out.println("Empty Constructor called with default values as");
	}

	
	//constructor with suitable parameters
	public ClassChallengeBank(String customerName,String emailId,long phoneNumber,long accountNumber,double balance)
	{
		System.out.println("Constructor with proper arguments called");
		
		this.customerName = customerName;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	



	//to string method
	public String toString() {
		String myAccount = customerName + "\n" + emailId + "\n" + phoneNumber + "\n" + accountNumber + "\n" + balance;
		return myAccount;
		
	}
	
	//getter and setter for each fields
	
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public long getAccountNumber() {
		return this.accountNumber;
	}
	
	public String getBalance() {
		String result = "Your balance is: " +balance;
		return result;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	//method:  To allow the customer to deposit funds (this should increment the balance field). 
	public double depositMoney(double creditAmount) {
		balance += creditAmount;
		return balance;
		
	}
	//method: To allow the customer to withdraw funds. 
	//This should deduct from the balance field, but not allow the withdrawal to complete if their are insufficient funds.
	public double withdrawMoney(double debitAmount) {
		double MinAmount = 1000;
		//System.out.println("balance: "+balance);
		if ((balance - debitAmount) < MinAmount) {
			System.out.println("Insufficient balance. Couldn't complete the transaction.");			
		}
		else {
			balance -= debitAmount;
		}
		return balance;
		
	}
	
}