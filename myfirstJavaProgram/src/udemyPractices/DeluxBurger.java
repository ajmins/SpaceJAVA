package udemyPractices;

public class DeluxBurger extends BaseBurger{

	public DeluxBurger() {
		super("White", "Delux", "Sausage & Bacon", 14.54);
		super.addAddition1("Chips", 2.75);
		super.addAddition2("Drink", 1.81);
	}

	@Override
	public void addAddition2(String name, double price) {
		System.out.println("Cannot add additional items to Delux Burger");
	}

	@Override
	public void addAddition1(String name, double price) {
		System.out.println("Cannot add additional items to Delux Burger");
	}

	@Override
	public void addAddition3(String name, double price) {
		System.out.println("Cannot add additional items to Delux Burger");
	}

	@Override
	public void addAddition4(String name, double price) {
		System.out.println("Cannot add additional items to Delux Burger");
	}
	
	
	
}