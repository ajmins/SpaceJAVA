package udemyPractices;

public class InheritenceAnimalMain {

	public static void main(String[] args) {
		// create an animal object and dog object
		InheritenceAnimal animal = new InheritenceAnimal("Animal", 1, 1, 5, 5);
		
		InheritAnimalDog dog = new InheritAnimalDog("Jacky", 8, 20, 2, 4, 1, 20, "long silky");

		//now we can use the public method eat() which is defined in the animal class but
		//can be inherited by the dog class
		
		//dog.eat();
		//dog.walk();
		dog.run();
		InheritAnimalFish fish = new InheritAnimalFish("Nemo", 1, 5, 2, 2, 5);
		fish.swim(40);
	}

}
