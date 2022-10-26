package udemyPractices.SetInterface;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class TreeSetDemo {

    public static void main(String[] args) {
        // Creating a set using the TreeSet class
        Set<Integer> numbers = new TreeSet<>();

        // Add elements to the set
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);
        System.out.println("Set using TreeSet: " + numbers);

        // Access Elements using iterator()
        System.out.print("Accessing elements using iterator(): ");
        Iterator<Integer> iterate = numbers.iterator();
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        } 
        System.out.println();
        System.out.println("\n");
        //navigationMethods();
        //ceilFloorHigherLower();
        //pollFirstandLast();
        //headTailSubSet();
       // setOperations();
        //otherMethods();
        treeSetComparator();
        
        
  
    }

	private static void treeSetComparator() {
		/*
		 * tree set elements are sorted naturally. 
		 * However, we can also customize the ordering of elements.
		 * For this, we need to create our own comparator class based on which elements in a tree set are sorted.
		 

 		Here we have created a tree set passing CustomComparator class as an argument.
 		The CustomComparator class implements the Comparator interface.
 		We then override the compare() method. 
 		The method will now sort elements in reverse order.
		 *
		 */
		// Creating a tree set with a customized comparator
        TreeSet<String> animals = new TreeSet<>(new CustomComparator());

        animals.add("Dog");
        animals.add("Zebra");
        animals.add("Cat");
        animals.add("Horse");
        System.out.println("TreeSet: " + animals);
		
	}
	// Creating a comparator class
    public static class CustomComparator implements Comparator<String> {

        @Override
        public int compare(String animal1, String animal2) {
            int value =  animal1.compareTo(animal2);

            // elements are sorted in reverse order
            if (value > 0) {
                return -1;
            }
            else if (value < 0) {
                return 1;
            }
            else {
                return 0;
            }
        }
    }

	@SuppressWarnings("unchecked")
	private static void otherMethods() {
		/*
		 * 	clone()	Creates a copy of the TreeSet
			contains()	Searches the TreeSet for the specified element and returns a boolean result
			isEmpty()	Checks if the TreeSet is empty
			size()	Returns the size of the TreeSet
			clear()	Removes all the elements from the TreeSet
		 */
		  TreeSet <Integer>obj = new TreeSet<Integer>();  
		  TreeSet <Integer>obj1 = new TreeSet<Integer>();  
		  obj.add(2);     
		  obj.add(8);  
		  obj.add(5);  
		  obj.add(1);  
		  obj.add(10);  
		  System.out.println("TreeSet: " +obj);  
		  obj1 =(TreeSet<Integer>) obj.clone();  
		  System.out.println("Elements in Cloned TreeSet: " + obj1);  
		
	}

	private static void setOperations() {
		/*
		 * Union of Sets : use the addAll() method
		 * Intersecion : use retainAll()
		 * Difference : removeAll()
		 * subset : containsAll()
		 */
		 
		TreeSet<Integer> evenNumbers = new TreeSet<>();
	        evenNumbers.add(2);
	        evenNumbers.add(4);
	        System.out.println("TreeSet1: " + evenNumbers);

	        TreeSet<Integer> numbers = new TreeSet<>();
	        numbers.add(1);
	        numbers.add(2);
	        numbers.add(3);
	        System.out.println("TreeSet2: " + numbers);

	        // Union of two sets
	        numbers.addAll(evenNumbers);
	        System.out.println("Union is: " + numbers);	
	        // Intersection of two sets
	        numbers.retainAll(evenNumbers);
	        System.out.println("Intersection is: " + numbers);
	        // Difference between two sets
	        numbers.removeAll(evenNumbers);
	        System.out.println("Difference is: " + numbers);
	        
	        
	        TreeSet<Integer> numbers2 = new TreeSet<>();
	        numbers2.add(1);
	        numbers2.add(2);
	        numbers2.add(3);
	        numbers2.add(4);
	        System.out.println("TreeSet1: " + numbers2);

	        TreeSet<Integer> primeNumbers = new TreeSet<>();
	        primeNumbers.add(2);
	        primeNumbers.add(3);
	        System.out.println("TreeSet2: " + primeNumbers);

	        // Check if primeNumbers is subset of numbers
	        boolean result = numbers2.containsAll(primeNumbers);
	        System.out.println("Is TreeSet2 subset of TreeSet1? " + result);
	}

	private static void headTailSubSet() {
		System.out.println("headSet(), tailSet() and subSet() Methods");
		/*
		 * headSet(element, booleanValue)
		The headSet() method returns all the elements of a tree set before the specified element (which is passed as an argument).
		 default boolean: false;
		 if true, returns all elements before specified element including it.
		
		tailSet(element, booleanValue)
		The tailSet() method returns all the elements of a tree set after the specified element
		 default boolean: true
		 if false, returns including the specified element
		 
		 subSet(e1, bv1, e2, bv2)
		 The subSet() method returns all the elements between e1 and e2 including e1.
		 default booleans:
		 	bv1 : true 		bv2: false
		 	if bv1 is false,  returns all the elements between e1 and e2 without including e1
		 	if bv2 is true, returns all the elements between e1 and e2, including e1
		 */
		TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(4);
        numbers.add(6);
        System.out.println("TreeSet: " + numbers);

        // Using headSet() with default boolean value
        System.out.println("Using headSet without boolean value: " + numbers.headSet(5));

        // Using headSet() with specified boolean value
        System.out.println("Using headSet with boolean value: " + numbers.headSet(5, true));
        
        // Using tailSet() with default boolean value
        System.out.println("Using tailSet without boolean value: " + numbers.tailSet(4));

        // Using tailSet() with specified boolean value
        System.out.println("Using tailSet with boolean value: " + numbers.tailSet(4, false));

        // Using subSet() with default boolean value
        System.out.println("Using subSet without boolean value: " + numbers.subSet(4, 6));

        // Using subSet() with specified boolean value
        System.out.println("Using subSet with boolean value: " + numbers.subSet(4, false, 6, true));
    
        // Using subSet() with specified boolean value
        System.out.println("Using subSet with boolean value: " + numbers.subSet(4, false, 6, false));
    
        // Using subSet() with specified boolean value
        System.out.println("Using subSet with boolean value: " + numbers.subSet(4, true, 6, true));
    
	
	}

		
	

	private static void pollFirstandLast() {
		/*
		 	pollFirst() - returns and removes the first element from the set
			pollLast() - returns and removes the last element from the set
		 */
		System.out.println("pollfirst() and pollLast() Methods");
		TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(4);
        numbers.add(6);
        System.out.println("TreeSet: " + numbers);

        // Using pollFirst()
        System.out.println("Removed First Element: " + numbers.pollFirst());

        // Using pollLast()
        System.out.println("Removed Last Element: " + numbers.pollLast());

        System.out.println("New TreeSet: " + numbers);
		
	}

	private static void ceilFloorHigherLower() {
	
    /*
  	higher(element) - Returns the lowest element among those elements that are greater than the specified element.
	lower(element) - Returns the greatest element among those elements that are less than the specified element.
	ceiling(element) - Returns the lowest element among those elements that are greater than the specified element. If the element passed exists in a tree set, it returns the element passed as an argument.
	floor(element) - Returns the greatest element among those elements that are less than the specified element. If the element passed exists in a tree set, it returns the element passed as an argument.
     */
		System.out.println("ceiling(), floor(), higher() and lower() Methods");
		TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(4);
        numbers.add(6);
        System.out.println("TreeSet: " + numbers);

        // Using higher()
        System.out.println("Using higher: " + numbers.higher(4));

        // Using lower()
        System.out.println("Using lower: " + numbers.lower(4));

        // Using ceiling()
        System.out.println("Using ceiling: " + numbers.ceiling(4));

        // Using floor()
        System.out.println("Using floor: " + numbers.floor(3));
		
	}

	private static void navigationMethods() {
		
	/*
	 	first() - returns the first element of the set
		last() - returns the last element of the set	
	 */
		System.out.println("first() and last() Methods");
	        TreeSet<Integer> numbers = new TreeSet<>();
	        numbers.add(2);
	        numbers.add(5);
	        numbers.add(6);
	        System.out.println("TreeSet: " + numbers);

	        // Using the first() method
	        int first = numbers.first();
	        System.out.println("First Number: " + first);

	        // Using the last() method
	        int last = numbers.last();
	        System.out.println("Last Number: " + last);
		
	}
}