package udemyPractices.OopsMasterChallenge;

/*
 *  * The basic hamburger should have the following items. 
 * Bread roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot, etc) that the customer can select to be added to the burger. 
 * Each one of these items gets charged an additional price so you need some way to track how many items got added and 
 * to calculate the final price (base burger with all the additions). 
 * This burger has a base price and the additions are all separately priced (up to 4 additions, see above). 
 * Create a Hamburger class to deal with all the above. 
 * The constructor should only include the roll type, meat and price, can also include name of burger or you can use a setter.
 */

public class BaseBurger {
	private String breadRollType;
	private String name;
	private String meat;
	private double price;
	
	private String add1Name;
	private double add1Price;
	private String add2Name;
	private double add2Price;
	private String add3Name;
	private double add3Price;
	private String add4Name;
	private double add4Price;
	
	public BaseBurger(String breadRollType,String name, String meat,double price) {
		this.breadRollType = breadRollType;
		this.name=name;
		this.meat = meat;
		this.price = price;
	}
	//setters for
	public void addAddition2(String name, double price) {
		this.add1Name = name;
		this.add1Price = price;
	}
	public void addAddition1(String name, double price) {
		this.add2Name = name;
		this.add2Price = price;
	}
	public void addAddition3(String name, double price) {
		this.add3Name = name;
		this.add3Price = price;
	}
	public void addAddition4(String name, double price) {
		this.add4Name = name;
		this.add4Price = price;
	}
	
	//calculating price
	public double calculatePrice() {
		double burgerPrice = this.price;
		System.out.println(this.name+ " hamburger "+" on a "+ this.breadRollType+ " roll price is "+ this.price);
		if (this.add1Name != null) {
			burgerPrice += this.add1Price;
			System.out.println(("Added "+this.add1Name +" for an extra "+this.add1Price));
		}
		if (this.add2Name != null) {
			burgerPrice += this.add2Price;
			System.out.println(("Added "+this.add2Name +" for an extra "+this.add2Price));
		}
		if (this.add3Name != null) {
			burgerPrice += this.add3Price;
			System.out.println(("Added "+this.add3Name +" for an extra "+this.add3Price));
		}
		if (this.add4Name != null) {
			burgerPrice += this.add4Price;
			System.out.println(("Added "+this.add4Name +" for an extra "+this.add4Price));
		}
		return burgerPrice;
	}
	
	
}
