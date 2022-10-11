package myfirstJavaProgram;
import java.util.*;


public class ArrayList2D {
	//2D ArrayList =  a dynamic list of lists
	//You can change the size of these lists during runtime
	public static void main(String[] args) {
		
		//ArrayList is a class
		ArrayList<ArrayList<String>> groceryList = new ArrayList<ArrayList<String>>();
		
		ArrayList<String> bakeryList = new ArrayList<String>();
		bakeryList.add("Pasta");
		bakeryList.add("Wheat bread");
		bakeryList.add("Donuts");
		
		System.out.println(bakeryList);
		//[Pasta, Wheat bread, Donuts]
		
		ArrayList<String> produceList = new ArrayList<String>();
		produceList.add("tomatoes");
		produceList.add("zucchini");
		produceList.add("peppers");
		
		ArrayList<String> drinksList = new ArrayList<String>();
		drinksList.add("soda");
		drinksList.add("pepsi");
		drinksList.add("coffee");
		
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinksList);
		
		System.out.println(groceryList);
		//[[Pasta, Wheat bread, Donuts], [tomatoes, zucchini, peppers], [soda, pepsi, coffee]]
		
		System.out.println(groceryList.get(0));
		//[Pasta, Wheat bread, Donuts]
		System.out.println(groceryList.get(0).get(0));
		//Pasta
		
		
	}


}
