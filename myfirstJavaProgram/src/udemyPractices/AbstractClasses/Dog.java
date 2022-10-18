package udemyPractices.AbstractClasses;

public class Dog extends Animal {

	//add constructor
	public Dog(String name) {
		super(name);
	}

	//must be add the abstract methods in Animal class
	@Override
	public void eat() {
		System.out.println(getName()+" is eating");
		
	}

	@Override
	public void breathe() {
		System.out.println("Breathe in, breathe out, repeat");
		
	}

	

}
