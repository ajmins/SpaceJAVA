package udemyPractices;
/*
* a) Healthy burger (on a brown rye bread roll), plus two addition items that can be added. 
* The healthy burger can have 6 items (Additions) in total. 
* hint: you probably want to process the two additional items in this new class (subclass of Hamburger), not the base class (Hamburger), 
* since the two additions are only appropriate for this new class (in other words new burger type).
*/

class HealthyBurger extends BaseBurger{


	private String healthyExtra1Name;
	private double healthyExtra1Price;
	
	private String healthyExtra2Name;
	private double healthyExtra2Price;
	
	public HealthyBurger(String meat, double price) {
		super("Brown rye", "Healthy", meat, price);
		// TODO Auto-generated constructor stub
	}
	
	public void addHealthAddition1(String name, double price) {
		this.healthyExtra1Name = name;
		this.healthyExtra1Price = price;
	}
	public void addHealthAddition2(String name, double price) {
		this.healthyExtra2Name = name;
		this.healthyExtra2Price = price;
	}

	@Override
	public double calculatePrice() {
		double burgerPrice = super.calculatePrice();
		//System.out.println(this.name+ " hamburger "+" on a "+ this.breadRollType+ " roll price is "+ this.price);
		if (this.healthyExtra1Name != null) {
			burgerPrice += this.healthyExtra1Price;
			System.out.println(("Added "+this.healthyExtra1Name +" for an extra "+this.healthyExtra1Price));
		}
		if (this.healthyExtra2Name != null) {
			burgerPrice += this.healthyExtra2Price;
			System.out.println(("Added "+this.healthyExtra2Name +" for an extra "+this.healthyExtra2Price));
		}
		return burgerPrice;
	}
	
	
}
