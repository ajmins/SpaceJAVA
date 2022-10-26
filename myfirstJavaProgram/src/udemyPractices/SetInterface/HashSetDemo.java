package udemyPractices.SetInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetDemo {
	    public static void main(String[] args) {
	    	
	    	//declarationWithLFandC();
	    	//unionOf();
	    	//checkIf();
	    	//removeDuplicates();
	    	accessElements();
	    	

	    }

		private static void accessElements() {
			HashSet<Integer> numbers = new HashSet<>();
	        numbers.add(2);
	        numbers.add(5);
	        numbers.add(6);
	        System.out.println("HashSet: " + numbers);

	        // Calling iterator() method
	        Iterator<Integer> iterate = numbers.iterator();
	        System.out.print("HashSet using Iterator: ");
	        // Accessing elements
	        while(iterate.hasNext()) {
	            System.out.print(iterate.next());
	            System.out.print(", ");
	        }
			
		}

		private static void removeDuplicates() {
			
			List <Integer> list = new ArrayList <> (Arrays.asList(1, 1, 2, 3, 2, 2, 3));
			System.out.println("Elements before removing duplicates: " + list);
		    
			HashSet <Integer> hs = new HashSet <> (list);
		    System.out.println("Elements after removing duplicates: " + hs);
			
		}

		private static void checkIf() {
			HashSet <Integer> hs = new HashSet <> (Arrays.asList(1, 2, 3));

		    System.out.println("Is 1 present: " + hs.contains(1));
		    System.out.println("Is 2 present: " + hs.contains(2));
		    System.out.println("Is 5 present: " + hs.contains(5));
			
		}

		private static void declarationWithLFandC() {
	        
	     // HashSet with 8 capacity and 0.75 load factor
	        int a = 8;
	        float b = (float) 0.75;
	        HashSet<Integer> numbers = new HashSet<>(a,b);
			
		}

		private static void unionOf() {
	        // Creating a set using the HashSet class
	        Set<Integer> set1 = new HashSet<>();

	        // Add elements to the set1
	        set1.add(2);
	        set1.add(3);
	        System.out.println("Set1: " + set1);

	        // Creating another set using the HashSet class
	        Set<Integer> set2 = new HashSet<>();

	        // Add elements
	        set2.add(1);
	        set2.add(2);
	        System.out.println("Set2: " + set2);

	        // Union of two sets
	        set2.addAll(set1);
	        System.out.println("Union is: " + set2);
	        
	        //intersection: retainAll()
	        //difference: removeAll()
	        //subset: containsAll()
			
		}
		/* Other Methods
		  	clone()	Creates a copy of the HashSet
			contains()	Searches the HashSet for the specified element and returns a boolean result
			isEmpty()	Checks if the HashSet is empty
			size()	Returns the size of the HashSet
			clear()	Removes all the elements from the HashSet
		 */
	}
