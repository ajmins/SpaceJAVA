package udemyPractices.AbstractClasses;

public class AbstractClassMain {

	public static void main(String[] args) {
		Dog dog = new Dog("Pug");
		dog.breathe();
		dog.eat();
		
		//we changed bird class to abstract class
		//so we cannot instantiated the abstract class bird
//				Bird bird = new Bird("Parrot");
//				bird.eat();
//				bird.breathe();
		Parrot parrot = new Parrot("Australian Parrot");
		parrot.eat();
		parrot.breathe();
		parrot.fly();
		
		Penguin penguin = new Penguin("Emperor");
		penguin.fly();
		penguin.eat();
		
	}
/*
 * when to use abstract class
 * • You want to share code among several closely related classes (Animal - with fields name, age...) 
 * • You expect classes that extend your abstract class to have many common methods or fields or required access modifiers other than public (protected, private).
• You want to declare non static or non final fields (for example name, age), this enables you to define methods that can access and modify the state of an object (getName, setName).
• When you have a requirement for your base class to provide a default implementation of certain methods but other methods should be open to being overridden by child classes.


 */
}
