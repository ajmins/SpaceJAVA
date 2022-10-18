package udemyPractices.AbstractClasses;

public abstract class Bird extends Animal implements CanFly {

	public Bird(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		System.out.println(getName()+" is pecking");
		
	}

	@Override
	public void breathe() {
		System.out.println("Breathe in, breathe out, repeat");

		
	}
	//abstract method
	//this can be avoided becz we have created an interface CanFly
	//public abstract void fly();

	@Override
	public void fly() {
		System.out.println(getName() +" is flapping its wings");
		
	}

	
}
