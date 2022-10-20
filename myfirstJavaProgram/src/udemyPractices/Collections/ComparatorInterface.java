package udemyPractices.Collections;
import java.util.*;
public class ComparatorInterface {
/*
 * Comparator is a functional interface in Java that can be used to sort objects, and it is provided by the java.util package.

A functional interface is an interface that contains exactly one abstract method. 
It is also called Single Abstract Method (SAM) Interfaces.

But wait, this is what the Comparable interface does. 
Then why do we need the Comparator interface? 
If a class implements the Comparable interface, then it is aware of how to sort itself because the class itself has implemented the compareTo() method. 
This is called default ordering. Comparator is used for custom ordering where the class is unaware of the ordering logic.

Comparator provides multiple sorting sequence (i.e.) sorting objects based on multiple data members.
 */
	
		
		 public class SuperHero implements Comparable<SuperHero> {
		    private final String id;
		    private final String name;
		    private final int age;
		    
		    public SuperHero(String id, String name, int age) {
		        this.id = id;
		        this.name = name;
		        this.age = age;
		    }
		
		
	    public static void main(String[] args) {
	        List<SuperHero> superHeroes = new ArrayList<>();

	      //  superHeroes.add(new SuperHero("3", "Hulk", 20));
	      //  superHeroes.add(new SuperHero("4", "Captain America", 25));
	     //   superHeroes.add(new SuperHero("1", "Captain America", 28));
	        
//	        superHeroes.sort(
//	            Comparator.comparing(SuperHero::getName())
//	                .thenComparing(SuperHero::getAge, Comparator.reverseOrder())
//	        );
	        
	        System.out.println("Ordered by Name asc and Age desc");
	        superHeroes.forEach(superHero -> 
	                            System.out.println(superHero.toString()));
	    }


		@Override
		public int compareTo(SuperHero o) {
			// TODO Auto-generated method stub
			return 0;
		}
	}

}
