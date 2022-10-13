package udemyPractices;
/*
 *  Bank: 
 * It should have an arraylist of Branches 
 * Add a new branch 
 * Add a customer to that branch with initial transaction 
 * Add a transaction for an existing customer for that branch 
 * Show a list of customers for a particular branch and optionally a list of their transactions 
 * 
 */

import java.util.ArrayList;
//import udemyPractices.Branch; //to get Branch class, then only we can use the methods with protected or public  

public class Bank {

	private String name;
	private ArrayList<Branch> branches;
	//add constructor
	public Bank(String name) {
		this.name = name;
		this.branches = new ArrayList<Branch>();
	}
	
	public boolean addBranch(String branchName) {
		if (findBranch(branchName) == null) {
			//creating instance of branch class
			this.branches.add(new Branch(branchName));
			return true;
		} 
		return false;
	}

	public boolean addCustomer(String branchName, String customerName,Double initialAmount) {
		Branch existingBranch = findBranch(branchName);
		if (existingBranch != null) {
			return existingBranch.newCustomer(customerName,initialAmount);
		}
		System.out.println(branchName +" Branch does not exist");
		return false;
	}
	
	public boolean addCustomerTransaction(String branchName, String customerName, Double amount) {
		Branch existingBranch = findBranch(branchName);
		Branch branch = new Branch(branchName);
		//Customer existingCustomer = branch.findCustomer(customerName);
		
		if(existingBranch != null) {
			//System.out.println("In Branch: "+branchName+"");
			return existingBranch.addCustomerTransaction(customerName, amount);
		}
		return false;
	}
	
	private Branch findBranch(String branchName) {
		for (int i = 0; i < this.branches.size(); i++) {
			Branch checkedBranch = this.branches.get(i);
			if (checkedBranch.getName().equals(branchName)) {
				return checkedBranch;
			}
		}
		return null;
	}
	public boolean listCustomers(String branchName, boolean showTransaction) {
		Branch existingBranch = findBranch(branchName);
		if(existingBranch != null) {
			System.out.println("Branch details of "+ existingBranch.getName()+"\n");
			
			ArrayList<Customer>branchCustomers = existingBranch.getCustomers();
			for (int i = 0; i < branchCustomers.size(); i++) {
				Customer branchCustomer = branchCustomers.get(i);
				System.out.println("Customer: "+branchCustomer.getName());
				if (showTransaction) {
					System.out.println("Transactions: ");
					ArrayList<Double> transactions = branchCustomer.getTransactions();
					for (int j = 0; j < transactions.size(); j++) {
						System.out.println("["+(j+1)+"]"+transactions.get(j));
					}
					System.out.println("\n");
				}
			}
			
			return true;
		}
		System.out.println(branchName +" Branch does not exist");
		return false;
	}
}
