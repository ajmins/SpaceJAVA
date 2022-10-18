package udemyPractices.Inheritence;



//inherit from another class Animal so use extends keyword
public class InheritAnimalDog extends InheritenceAnimal{

	//creating attributes for this particular class
	private int eyes;
	private int legs;
	private int tail; 
	private int teeth;
	private String coat;
	
	//it's mandatory to create constructor as it's inherited from another class
	//super keyword
	/*
	 * The super keyword in Java is a reference variable which is used to refer immediate parent class object.
	 * Whenever you create the instance of subclass, 
	 * an instance of parent class is created implicitly which is referred by super reference variable.
	 */
	
	//first create constructor with all the attributes and now insert values which are specific for dogs
	public InheritAnimalDog(String name, int size, int weight,int eyes, int legs, int tail, int teeth, String coat) {
		super(name, 1, 1, size, weight); //brain, body =1
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
		this.teeth = teeth;
		this.coat = coat;
	}
	
	//create a private method for dog which can only be accessed to dog alone
	private void chew() {
		System.out.println("Dog called the chew");
	}

	//goto Source menu click overriding methods
	//select eat() of animal
	@Override
	public void eat() {
		System.out.println("Dog called eat method.");
		chew();
		super.eat();
	} 
	public void walk() {
		System.out.println("Dog called walk method.");
		move(5);
		//we can either use move() or super.move()
		//if we use super.move() the move() of the Animal class is considered
		//but if simply move(), then if there is any other move in the dog class it will work
		super.move(5);
	}
	
	public void run() {
		System.out.println("Dog called run method.");
		move(10);
	}
	
	private void moveLegs(int speed) {
		System.out.println("dog called movelegs");
	}
	@Override
	public void move(int speed) {
		System.out.println("Dog move is called");
		//uses another method also, created before it is called
		moveLegs(speed);
		super.move(speed);
	}
}
