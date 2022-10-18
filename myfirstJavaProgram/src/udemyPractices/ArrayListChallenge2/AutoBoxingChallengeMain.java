package udemyPractices.ArrayListChallenge2;

public class AutoBoxingChallengeMain {
/*
 * You job is to create a simple banking application. 
 * There should be a Bank class 
 * It should have an arraylist of Branches 
 * Each Branch should have an arraylist of Customers 
 * The Customer class should have an arraylist of Doubles (transactions) 
 * Customer: 
 * Name, and the ArrayList of doubles. 
 * Branch:
 * Need to be able to add a new customer and initial transaction amount. 
 * Also needs to add additional transactions for that customer/branch 
 * Bank: 
 * Add a new branch 
 * Add a customer to that branch with initial transaction 
 * Add a transaction for an existing customer for that branch 
 * Show a list of customers for a particular branch and optionally a list of their transactions 
 * Demonstration autoboxing and unboxing in your code 
 * Hint: Transactions 
 * Add data validation. 
 * e.g. check if exists, or does not exist, etc. 
 * Think about where you are adding the code to perform certain actions


 */
	
	public static void main(String[] args) {
	
		Bank bank = new Bank("IMB Bank");
		Branch branch = new Branch("Tsr");
		
		bank.addBranch("Tvm");
		bank.addBranch("Klm");
		
		bank.addCustomer("Tvm", "Jane", 100.0);
		bank.addCustomer("Tvm", "David", 150.0);
		
		bank.addCustomerTransaction("Tvm", "Jane", 520.0);
		bank.addCustomerTransaction("Klm", "Diana", 582.0);
		
		//bank.addCustomerTransaction("Ekm", "Diana", 52.0);
		
		branch.addCustomerTransaction( "Dana", 582.0);
		bank.listCustomers("Tvm", true);
		bank.listCustomers("Ekm", true);

	}

}
