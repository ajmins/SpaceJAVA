package udemyPractices;

public class InheritenceChallengeDrive {
	
	/*
	 * Challenge. 
	 * Start with a base class of a vehicle, then create a Car class that inherits from this base class. 
	 * Finally, create another class, a specific type of car that inherits from the Car class. 
	 * You should be able to hand steering, changing gears, and moving (speed in other words). 
	 * You will want to decide where to put the appropriate state and behaviours (fields and methods). 
	 * As mentioned above, changing gears, increasing/decreasing speed should be included. 
	 * For you specific type of vehicle you will want to add something specific for that type of car.


	 */
	

	public static void main(String[] args) {
		// create an instnce of a car
		InnovaClass innova = new InnovaClass(36);
		System.out.println(innova);
		innova.steer(45);
		innova.accelerate(30);
		innova.accelerate(20);
		innova.accelerate(-42);
	}

}
