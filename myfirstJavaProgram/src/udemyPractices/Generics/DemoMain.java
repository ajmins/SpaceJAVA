package udemyPractices.Generics;

import java.util.ArrayList;

public class DemoMain {

	public static void main(String[] args) {

		//create without generics
		ArrayList items = new ArrayList();
		items.add(1);
		items.add(2);
		items.add(3);
		items.add(8.9);
		items.add("am a string");
		listItems(items);
		//printDoubled(items);
		
		//create with generics
		ArrayList<Integer> values =  new ArrayList<Integer>();
		values.add(1);
		values.add(2);
		values.add(3);
		printIntDoubled(values);
	}



	private static  void listItems(ArrayList items) {

	for (Object i : items) {
		System.out.println(i); 
		//here we need to cast else will throw error
		}
			
	}
	private static  void printDoubled(ArrayList items) {

	for (Object i : items) {
		//System.out.println((Integer) i * 2); 
		//here we need to cast else will throw error
		//but when we use generics no need of type casting
		System.out.println((Integer) i * 2); 
		}
			
	}
	
	private static void printIntDoubled(ArrayList<Integer> values) {
		for (int i : values) {
			System.out.println(i * 2); 
			//here no type casting
		}
		
	}
	
}
