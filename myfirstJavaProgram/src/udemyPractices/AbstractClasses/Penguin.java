package udemyPractices.AbstractClasses;

public class Penguin extends Bird {

	public Penguin(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		//fst fly will be inherited from the bird class
		super.fly();
		System.out.println("not good at flying, but can swim");
		
	}

}
