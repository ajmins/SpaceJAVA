package udemyPractices;
/*
 * The word polymorphism means having many forms. In simple words, we can define polymorphism as the ability of a message to be displayed in more than one form. 

Real-life Illustration: Polymorphism

A person at the same time can have different characteristics. Like a man at the same time is a father, a husband, an employee. So the same person possesses different behavior in different situations. This is called polymorphism. 
Polymorphism is considered one of the important features of Object-Oriented Programming. Polymorphism allows us to perform a single action in different ways. In other words, polymorphism allows you to define one interface and have multiple implementations. The word “poly” means many and “morphs” means forms, So it means many forms.
 
 *Types 

Compile-time Polymorphism / static polymorphism:
	 This type of polymorphism is achieved by function overloading or operator overloading.(in java no operator overloading)
	 
Runtime Polymorphism / Dynamic Method Dispatch:
	 It is a process in which a function call to the overridden method is resolved at Runtime. 
	 This type of polymorphism is achieved by Method Overriding. 
	 Method overriding, on the other hand, occurs when a derived class has a definition for one of the member functions of the base class. 
	 That base function is said to be overridden.

 */

class Movie{
	private String name;
	
	//constructor
	public Movie(String name) {
		this.name = name;
	}
	
	//a method
	public String plot() {
		return "No plot here";
	}
	//getter
	public String getName() {
		return name;
	}
}
//5 classes extends from movie
class Jaws extends Movie{
	//constructor
	public Jaws() {
		super("Jaws");
	}
	
	public String plot() {
		return "A shark eats lot of people";
	}
}

class IndependenceDay extends Movie{

	public IndependenceDay() {
		super("Independence Day");
		
	}

	@Override
	public String plot() {
		
		return "Aliens attempt to take over planet earth";
	}
}

class MAzeRunner extends Movie{
	public MAzeRunner() {
		super("MAze Runner");
	}

	@Override
	public String plot() {
		// TODO Auto-generated method stub
		return "Kida try and escape a maze";
	}	
}

class StarMars extends Movie{

	public StarMars() {
		super("Star Mars");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String plot() {
		// TODO Auto-generated method stub
		return "Imperial forces tr to take over the universe";
	}
}

class Forgetable extends Movie{

	public Forgetable() {
		super("Forgetable");
		
	}
	//no plot method for overriding
	//here wil go to the movie.plot() and return "No plot here";
}

public class PolymorphismMain {
	
	public static void main(String[] args) {
		
		for (int i = 1; i < 11; i++) {
			Movie movie = randomMovie();
			System.out.println("Movie "+ i + " : "+movie.getName()+"\nPlot: "+ movie.plot()+"\n");
		}
		
	}
	//return is Movie, is an object of movie class
	public static Movie randomMovie() {
		int randomNumber = (int)(Math.random() * 5) +1;
		System.out.println("Random number generated was: " +randomNumber);
		switch (randomNumber) {
		case 1:
			return new Jaws();
			//here break; statement is not needed
		case 2:
			return new IndependenceDay();
		case 3:
			return new MAzeRunner();	
		case 4:
			return new StarMars();	
		case 5:
			return new Forgetable();	
		}
		return null; 
		
	}

}
