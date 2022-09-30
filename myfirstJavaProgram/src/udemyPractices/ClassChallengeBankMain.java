package udemyPractices;
//subclass: ClassChallengeBank
public class ClassChallengeBankMain {

	/*
	 * Create a new class for a bank account Create fields for 
	 * the account number, balance, customer name, email and phone number.
	 * Create getters and setters for each field Create two additional methods 
	 * 1. To allow the customer to deposit funds (this should increment the balance field). 
	 * 2. To allow the customer to withdraw funds. 
	 * This should deduct from the balance field, but not allow the withdrawal 
	 * to complete if their are insufficient funds. 
	 * You will want to create various code in the Main class  to confirm your code is working. 
	 * Add some System.out.println's in the two methods above as well.
	 */
	
	
	public static void main(String[] args) {
		
		//ClassChallengeBank johnAccount =  new ClassChallengeBank();
		//ClassChallengeBank(); is actually call the constructor default, 
		//eventhough it's not explictly defined in the subcalss 
		
		//if no parameters are passed, and already a constructor is defined the above line will work accordingly.
		
		//if constructor with suitable parameters are defined, then these lines are not needed
		/*
		johnAccount.setCustomerName("John");
		johnAccount.setEmailId("john@email.com");
		johnAccount.setPhoneNumber(987456321);
		johnAccount.setAccountNumber(123456);
		johnAccount.setBalance(1000);
		*/
		//new constructor with parameters
		ClassChallengeBank johnAccount =  new ClassChallengeBank("John","john@email.com",987456321,123456,1000);
		
		
		//print account details of john 
		//will print obly if toString method is defined in subclass
		System.out.println(johnAccount);
		
		johnAccount.depositMoney(100);
		System.out.println(johnAccount.getBalance());

		johnAccount.withdrawMoney(100);
		System.out.println(johnAccount.getBalance());
		
		johnAccount.withdrawMoney(800);
		System.out.println(johnAccount.getBalance());

	}

}
