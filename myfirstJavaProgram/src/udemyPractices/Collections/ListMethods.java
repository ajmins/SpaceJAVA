package udemyPractices.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/*
 * Java List is an ordered collection. Java List is an interface that extends Collection interface. 
 * Java List provides control over the position where you can insert an element. 
 * You can access elements by their index and also search elements in the list.
 */
public class ListMethods {

	public static void main(String[] args) {
		
		//Arrays to List
		System.out.println("Arrays to list");
		//string array
		String[] vowels = {"a","e","i","o","u"};
		//System.out.println("Type of vowels: "+vowels.getClass().getSimpleName()); //String[]
		
		List<String> vowelsList = Arrays.asList(vowels);
		System.out.println(vowelsList);
		//System.out.println("Type of vowels: "+vowelsList.getClass().getSimpleName()); //ArrayList
		
		/**
		 * List is backed by array, we can't do structural modification
		 * Both of the below statements will throw java.lang.UnsupportedOperationException
		 */
		//vowelsList.remove("e");
		//vowelsList.clear();
				
		//using for loop to copy elements from array to list, safe for modification of list
		List<String> myList = new ArrayList<>();
		for(String s : vowels){
			myList.add(s);
		}
		System.out.println(myList);
	//	System.out.println("Type of vowels: "+myList.getClass().getSimpleName()); //ArrayList
		myList.clear();
		System.out.println(myList); //[]
		
		//List to array
		System.out.println("List to array");
		List<String> letters = new ArrayList<String>();
	//	System.out.println("Type of letters: "+letters.getClass().getSimpleName()); //ArrayList
		// add example
		letters.add("A");
		letters.add("B");
		letters.add("C");
		
		//convert list to array
		String[] strArray = new String[letters.size()];
		//System.out.println(Arrays.toString(strArray)); //empty array with the specific size ; [null, null, null]
		//System.out.println("Type of letters: "+strArray.getClass().getSimpleName()); //String[]

		
		strArray = letters.toArray(strArray);
		//System.out.println("Type of letters: "+strArray.getClass().getSimpleName()); //String[]

		System.out.println(Arrays.toString(strArray)); //will print "[A, B, C]"

	}

}
