package myfirstJavaProgram;

import java.util.ArrayList;
/*
 * ArrayLists Methods
Java ArrayList add()-inserts the element to the arraylist
Java ArrayList addAll()-adds all elements of a collection to arraylist
Java ArrayList clear()- removes all the elements from arraylist
Java ArrayList clone()-makes a copy of the array list
Java ArrayList contains()-checks if the element is present in the arraylist
Java ArrayList get()-returns the element present in the specified index
Java ArrayList indexOf()-returns the position of the specified element
Java ArrayList removeAll()-removes multiple elements from the arraylist
Java ArrayList remove()-removes the single element from the arraylist
Java ArrayList size()-returns the length of an arraylist
Java ArrayList isEmpty()-checks if the arraylist is empty
Java ArrayList subList()-returns a portion of the arraylist
Java ArrayList set()-replace the single element from an arraylist
Java ArrayList sort()-sorts the arraylist according to specified order
Java ArrayList toArray()-converts an arraylist to an array
Java ArrayList toString()-converts the arraylist into a String
Java ArrayList ensureCapacity()-set the size of an araylist
Java ArrayList lastIndexOf()-returns position of last occurrence of the element
Java ArrayList retainAll()-retains only the common elements
Java ArrayList containsAll()-checks if a collection is a subset of arraylist
Java ArrayList trimToSize()-trims the capacity of arraylist equal to the size
Java ArrayList removeRange()-removes a portion of the arraylist
Java ArrayList replaceAll()-replace all elements from the arraylist
Java ArrayList removeIf()-removes element that satisfy the condition
Java ArrayList forEach()-performs an action to all elements of arraylist
Java ArrayList iterator()-returns an iterate to loop through the ArrayList
 */


public class Arraylists {
	//ArrayList: resizable array
	//			 ELements can be added and removed after compilation phase
	//			 store reference data types
	//			it can hold objects
	//this will automatically take List interface
	public static class demo{
		
	}
	public static void main(String[] args) {
		
		ArrayList<String> food =  new ArrayList<String>();

		food.add("Pizza");
		food.add("Hamburger");
		food.add("Hotdog");
		
//		for(int i=0;i<food.size();i++) {
//			System.out.println(food.get(i));
//		}
//		
//		//set() method -> replace a value with another based on index
//		food.set(0, "Sushi");
//		System.out.println("------");
//		for(int i=0;i<food.size();i++) {
//			System.out.println(food.get(i));
//		}
//		
//		//remove() method -> to remove an element based on the index
//		food.remove(2);
//		System.out.println("------");
//		for(int i=0;i<food.size();i++) {
//			System.out.println(food.get(i));
//		}
//		
//		//clear() method: to clear the list
//		food.clear();
//		System.out.println("------");
//		for(int i=0;i<food.size();i++) {
//			System.out.println(food.get(i));
//		}
		
		ArrayList<String> item = new ArrayList<String>();
		ArrayList<String> item2 = new ArrayList<String>();
		
		item = food; //any change will reflect the both (shallow copy)???????
					//deep copy???????
		item.add("Onion");
		for(int i=0;i<food.size();i++) {
			item2.add(food.get(i));
		}
		System.out.println("================");
		for(int i=0;i<food.size();i++) {
			System.out.println(food.get(i));
		}
		System.out.println("================");
		for(int i=0;i<item.size();i++) {
			System.out.println(item.get(i));
		}
		System.out.println("================");
		for(int i=0;i<food.size();i++) {
			item2.add(food.get(i));
		}
		System.out.println("================");
		for(int i=0;i<item2.size();i++) {
			System.out.println(item2.get(i));
		}
		String text = "melvin";
		for (double i = 0; i < 1000000000; i++) {
			text= text+i;
		}
		
	}

}
