package udemyPractices.ClassChallenge;

public class ClassChallengeCustomerMain {

	/*
	 * Create a new class VipCustomer it should have 3 fields name, credit limit, and email address. 
	 * create 3 constructors 
	 * 1st constructor empty should call the constructor with 3 parameters with default values 
	 * 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd 
	 * 3rd constructor should save all fields. 
	 * create getters only for this using code generation of intellij as setters wont be needed test and confirm it works.

	 */
		
	
	public static void main(String[] args) {
		ClassChallengeCustomer myCreditChallengeCustomer = new ClassChallengeCustomer();
		System.out.println(myCreditChallengeCustomer.getCustomerName()+ "\t" + myCreditChallengeCustomer.getCreditLimit()+ "\t" + myCreditChallengeCustomer.getCustomerEmailString());
		
		ClassChallengeCustomer myCreditChallengeCustomer2 = new ClassChallengeCustomer("Bob",15269);
		System.out.println(myCreditChallengeCustomer2.getCustomerName()+ "\t" + myCreditChallengeCustomer2.getCreditLimit()+ "\t" + myCreditChallengeCustomer2.getCustomerEmailString());
		
		ClassChallengeCustomer myCreditChallengeCustomer3 = new ClassChallengeCustomer("Mary",25669,"mary@gmail.com");;
		System.out.println(myCreditChallengeCustomer3.getCustomerName()+ "\t" + myCreditChallengeCustomer3.getCreditLimit()+ "\t" + myCreditChallengeCustomer3.getCustomerEmailString());
		
	}

}
