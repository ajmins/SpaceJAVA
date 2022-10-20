package udemyPractices.Collections;

import java.util.*;

public class ComparableInterface {
/*
 * Java Comparable interface is used to order the objects of the user-defined class. 
 * This interface is found in java.lang package and contains only one method named compareTo(Object). 
 * It provides a single sorting sequence only, i.e., you can sort the elements on the basis of single data member only.
 * 
 * If a class implements the Comparable interface, then it is aware of how to sort itself because 
 * the class itself has implemented the compareTo() method. 
 * This is called default ordering
 */
	public static void main(String[] args) {
		ArrayList<Kid> al=new ArrayList<Kid>();  
		al.add(new Kid(101,"Vijay",23));  
		al.add(new Kid(106,"Ajay",27));  
		al.add(new Kid(105,"Jai",21));  
		  
		Collections.sort(al);  
		for(Kid st:al){  
		System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  

	}

}
