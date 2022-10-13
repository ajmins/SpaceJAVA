package udemyPractices;
/*
 * The Customer class should have an arraylist of Doubles (transactions) 
 * Customer: 
 * Name, and the ArrayList of doubles. 
 */

import java.util.ArrayList;

public class Customer {
	private String name;
	private ArrayList<Double> transactions;
	
	//constructor
	public Customer(String name, Double initialAmount) {
		this.name = name;
		this.transactions = new ArrayList<Double>();
		//add initial amount
		this.transactions.add(initialAmount);
	}
	public void addTransaction(Double amount) {
		this.transactions.add(amount);
	}
	public String getName() {
		return name;
	}
	public ArrayList<Double> getTransactions() {
		return transactions;
	}
	
}
