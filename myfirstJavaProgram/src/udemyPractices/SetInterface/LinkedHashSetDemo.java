package udemyPractices.SetInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		basicOperations();
		setOperations();
		otherMethods();
		
		

	}

	private static void otherMethods() {
//		clone()	Creates a copy of the LinkedHashSet
//		contains()	Searches the LinkedHashSet for the specified element and returns a boolean result
//		isEmpty()	Checks if the LinkedHashSet is empty
//		size()	Returns the size of the LinkedHashSet
//		clear()	Removes all the elements from the LinkedHashSet
		
	}

	private static void setOperations() {
		//use addAll(): union;  numbers.addAll(evenNumbers);
		//retainAll(): intersection ; evenNumbers.retainAll(primeNumbers);
		//removeAll() : difference ; primeNumbers.removeAll(oddNumbers)
		//containsall(): subset; numbers.containsAll(primeNumbers)
		
	}

	private static void basicOperations() {
		 // Creating an arrayList of even numbers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        System.out.println("ArrayList: " + numbers);

        // Creating a LinkedHashSet from an ArrayList
        LinkedHashSet<Integer> evenNumber = new LinkedHashSet<>(numbers);
        System.out.println("LinkedHashSet: " + evenNumber);
        
     // Using add() method
        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);
        System.out.println("LinkedHashSet: " + evenNumber);

        LinkedHashSet<Integer> numbersNew = new LinkedHashSet<>();
        
        // Using addAll() method
        numbersNew.addAll(evenNumber);
        numbersNew.add(5);
        System.out.println("New LinkedHashSet: " + numbersNew);
        
     // Calling the iterator() method
        Iterator<Integer> iterate = numbersNew.iterator();

        System.out.print("LinkedHashSet using Iterator: ");

        // Accessing elements
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }
        System.out.println();
     // Using the remove() method
        boolean value1 = evenNumber.remove(6);
        System.out.println("Is 5 removed? " + value1);
        
        boolean value2 = evenNumber.removeAll(evenNumber);
        System.out.println("Are all elements removed? " + value2);
        System.out.println("LinkedHashSet: " + evenNumber);

		
	}

}
