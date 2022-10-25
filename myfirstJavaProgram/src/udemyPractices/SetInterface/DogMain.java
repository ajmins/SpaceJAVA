package udemyPractices.SetInterface;

public class DogMain {

	public static void main(String[] args) {
/*
 * When overriding the equals() method, it would not return true,
 *  if a heavenlybody was compared to its subclass of itself.
 *  
 *  the heavenlybody class is declared final, so cannot be subclassed.
 *  java string class is also final, so it can safely use the instaneof w/o worrying about the comparisons with a subclass
 *  
 */
		
		Labrador rover = new Labrador("Rover");
		Dog rover2 = new Dog("Rover");
		
		System.out.println(rover2.equals(rover)); //true
		System.out.println(rover.equals(rover2)); //false
		
		//this is becz, labrador is an instance of Dog
		//but dogs are not instance of labrador
		
		//so here it's good to not override the equals in labrador so remove it
		
		//then after that both will shows true
		
		
		
		
		
		
	}

}
