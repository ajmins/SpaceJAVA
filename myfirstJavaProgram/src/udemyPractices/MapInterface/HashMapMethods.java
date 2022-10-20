package udemyPractices.MapInterface;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HashMapMethods {

	public static void main(String[] args) {
		// create a hashmap
	    HashMap<String, Integer> numbers = new HashMap<>();

	    System.out.println("Initial HashMap: " + numbers +" of type "+ numbers.getClass().getSimpleName());
	    // put() method to add elements
	    numbers.put("One", 1);
	    numbers.put("Two", 2);
	    numbers.put("Three", 3);
	    System.out.println("HashMap after put(): " + numbers);
	    
	    // get() method to get value
	    Integer value = numbers.get("One");
	    System.out.println("Value at index One: " + value);
	    System.out.println("========================================================");
	    // return set view of keys
	    // using keySet()
	    System.out.println("Keys: " + numbers.keySet());

	    // return set view of values
	    // using values()
	    System.out.println("Values: " + numbers.values());

	    // return set view of key/value pairs
	    // using entrySet()
	    System.out.println("Key/Value mappings: " + numbers.entrySet());
	    System.out.println("========================================================");
	    //The Java HashMap getOrDefault() method returns the specified default value if the mapping for the specified key is not found in the hashmap.
	    //Otherwise, the method returns the value corresponding to the specified key.
	    // create an HashMap
        HashMap<Integer, String> numbers2 = new HashMap<>();

        // insert entries to the HashMap
        numbers2.put(1, "Java");
        numbers2.put(2, "Python");
        numbers2.put(3, "JavaScript");
        System.out.println("HashMap: " + numbers2);

        // mapping for the key is present in HashMap
        String value1 = numbers2.getOrDefault(1, "Not Found");
        System.out.println("Value for key 1:  " + value1);

        // mapping for the key is not present in HashMap
        String value2 = numbers2.getOrDefault(4, "Not Found");
        System.out.println("Value for key 4: " + value2);
        System.out.println("========================================================");
        //Replace
        // change element with key 2
        numbers2.replace(2, "C++");
        System.out.println("HashMap using replace(): " + numbers2);
        System.out.println("========================================================");
        //Remove
        // remove element associated with key 2
        String value3 = numbers2.remove(2);
        System.out.println("Removed value: " + value3);

        System.out.println("Updated HashMap: " + numbers2);
        System.out.println("========================================================");
        //Iterate through hashmap
     // iterate through keys only
        System.out.print("Keys: ");
        for (Integer key : numbers2.keySet()) {
          System.out.print(key);
          System.out.print(", ");
        }
        System.out.println();
        System.out.println("========================================================");
        // iterate through values only
        System.out.print("\nValues: ");
        for (String value4 : numbers2.values()) {
          System.out.print(value4);
          System.out.print(", ");
        }
        
        // iterate through key/value entries
        System.out.print("\nEntries: ");
        for (Entry<Integer, String> entry : numbers2.entrySet()) {
          System.out.print(entry);
          System.out.print(", ");
        }
        
        System.out.println();
        System.out.println("========================================================");
        //Create hashmap from other maps
        // create a treemap
        TreeMap<String, Integer> evenNumbers = new TreeMap<>();
        evenNumbers.put("Two", 2);
        evenNumbers.put("Four", 4);
        System.out.println("TreeMap: " + evenNumbers);

        // create hashmap from the treemap
        HashMap<String, Integer> numbers3 = new HashMap<>(evenNumbers);
        numbers3.put("Three", 3);
        System.out.println("HashMap: " + numbers3);
        
	}

}
