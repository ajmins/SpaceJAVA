package myfirstJavaProgram;

import java.util.ArrayList;

public class Arraylists {
	//ArrayList: resizable array
	//			 ELements can be added and removed after compilation phase
	//			 store reference data types
	//this will automatically take List interface
	public static void main(String[] args) {
		
		ArrayList<String> food =  new ArrayList<String>();

		food.add("Pizza");
		food.add("Hamburger");
		food.add("Hotdog");
		
		for(int i=0;i<food.size();i++) {
			System.out.println(food.get(i));
		}
		
		//set() method -> replace a value with another based on index
		food.set(0, "Sushi");
		System.out.println("------");
		for(int i=0;i<food.size();i++) {
			System.out.println(food.get(i));
		}
		
		//remove() method -> to remove an element based on the index
		food.remove(2);
		System.out.println("------");
		for(int i=0;i<food.size();i++) {
			System.out.println(food.get(i));
		}
		
		//clear() method: to clear the list
		food.clear();
		System.out.println("------");
		for(int i=0;i<food.size();i++) {
			System.out.println(food.get(i));
		}
		
	}

}
