package udemyPractices;

/*
 * Create a base class called Car 
 * It should have a few fields that would be appropriate for a generic car class. 
 * engine, cylinders, wheels, etc. 
 * Constructor should initialize cylinders (number of) and name, and set wheels to 4 and engine to true. 
 * Cylinders and names would be passed parameters.
 * Create appropriate getters
 * Create some methods like startEngine, accelerate, and brake
 * show a message for each in the base class 
 * Now create 3 sub classes for your favorite vehicles. 
 * Override the appropriate methods to demonstrate polymorphism in use. 
 * put all classes in the one java file (this one).

 */

class Car{
	private String name;
	private boolean isEngine;
	private int cylinders;
	private int wheels;
	
	public Car(String name, int cylinders) {
		this.name = name;
		this.isEngine = true;
		this.cylinders = cylinders;
		this.wheels = 4;
	}
	public String startengine() {
		//System.out.println("engine starts!");
		return "carr engine starts!";
	}
	public String accelerate() {
		//System.out.println("car accelerates!");
		return "car accelerates!";
	}
	public String brake() {
		System.out.println("car brakes!");
		return name;
	}
	public String getName() {
		return name;
	}
	public int getCylinders() {
		return cylinders;
	}
	
}
class Dzire extends Car{

	public Dzire(String name, int cylinders) {
		super(name, cylinders);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String startengine() {
		return "Dzire starts engine";
	}

	@Override
	public String accelerate() {
		return "Dzire accelerates";
	}

	@Override
	public String brake() {
		return "Dzire brakes";
	}
	
}
class Aspire extends Car{

	public Aspire(String name, int cylinders) {
		super(name, cylinders);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String startengine() {
		return getClass().getName() + "- Aspire starts engine";
	}

	@Override
	public String accelerate() {
		return getClass().getSimpleName() + "- Aspire accelerates";
	}

	@Override
	public String brake() {
		return getClass().getSimpleName() + "- Aspire brakes";
	}
	
}

public class PolymorphismChallenge {

	public static void main(String[] args) {
		
		Car car = new Car("Car", 3);
		System.out.println(car.startengine());
		System.out.println(car.accelerate());
		car.brake();
		
		Dzire dzire = new Dzire("Maruti", 4);
		System.out.println(dzire.startengine());
		System.out.println(dzire.accelerate());
		System.out.println(dzire.brake());
		
		Aspire aspire = new Aspire("Ford", 4);
		System.out.println(aspire.startengine());
		System.out.println(aspire.accelerate());
		System.out.println(aspire.brake());
	}
}
