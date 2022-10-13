package udemyPractices;

import java.util.ArrayList;

/*
 * Branch:
 * Each Branch should have an arraylist of Customers 
 * Need to be able to add a new customer and initial transaction amount. 
 * Also needs to add additional transactions for that customer/branch 
 */

public class Branch {

	private String name;
	private ArrayList<Customer>customers;
	
	//add constructor
	public Branch(String name) {
		this.name = name;
		this.customers = new ArrayList<Customer>();
	}


	public String getName() {
		return name;
	}

	public ArrayList<Customer> getCustomers() {
		return customers;
	}
	
	public boolean newCustomer(String customerName, Double initialAmount) {
		if(findCustomer(customerName) == null) {
			//creating an instance of customer class
			this.customers.add(new Customer(customerName, initialAmount));
			return true;
		}
		return false;
	}
	public boolean addCustomerTransaction(String customerName,Double amount) {
		Customer existingCustomer = findCustomer(customerName);
		if (existingCustomer != null) {
			existingCustomer.addTransaction(amount);
			return true;
		}
		System.out.println(customerName +" Customer does not exist\n");
		return false;
	}

	private Customer findCustomer(String customerName) {
		for (int i = 0; i < this.customers.size(); i++) {
			Customer checkedCustomer =this.customers.get(i);
			if (checkedCustomer.getName().equals(customerName)) {
				return checkedCustomer;
			}
		}

		return null;
	}
	
	
}
