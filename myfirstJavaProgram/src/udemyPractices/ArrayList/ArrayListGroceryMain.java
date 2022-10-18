package udemyPractices.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
//subclass: GroceryList.java
import java.util.Scanner;
//visible to all other classes -like global
//public static Scanner input = new Scanner(System.in);

public class ArrayListGroceryMain {
	//private static here means
	//visible to the current class - any other static method (main() in the case)
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

     public static void main(String[] args) {
         boolean quit = false;
         int choice = 0;
         printInstructions();
         while(!quit) {
             System.out.println("Enter your choice: " );
             choice = scanner.nextInt();
             scanner.nextLine();

             switch(choice) {
                 case 0:
                     printInstructions();
                     break;
                 case 1:
                     groceryList.printGroceryList();
                     break;
                 case 2:
                     addItem();
                     break;
                 case 3:
                     modifyItem();
                     break;
                 case 4:
                     removeItem();
                     break;
                 case 5:
                     searchForItem();
                     break;
                 case 6://extra things to the program
                	 processArrayList();
                	 break;
                 case 7:
                     quit = true;
                     System.out.println("Exiting...");
                     break;
             }
         }
    }


	public static void printInstructions() {
        System.out.println("\nChoose:");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To process.");
        System.out.println("\t 7 - To quit the application.");
    }

    public static void addItem() {
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.print("Enter item name: ");
       // int itemNo = scanner.nextInt();
        String itemName = scanner.nextLine();
       // scanner.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem = scanner.nextLine();
        //groceryList.modifyGroceryItem(itemNo-1, newItem);
        //now we dont need to pass the position number but the item
        groceryList.modifyGroceryItem(itemName, newItem);
    }

    public static void removeItem() {
        System.out.print("Enter item name: ");
       // int itemNo = scanner.nextInt();
        String itemName = scanner.nextLine();
        //scanner.nextLine();
        //groceryList.removeGroceryItem(itemNo-1);
        groceryList.removeGroceryItem(itemName);

    }

    public static void searchForItem() {
        System.out.print("Item to search for: ");
        String searchItem = scanner.nextLine();
//        if(groceryList.findItem(searchItem) != null) {
        if(groceryList.onFile(searchItem)) { //this will give either true or false
            System.out.println("Found " + searchItem + " in  our grocery list");
        } else {
            System.out.println(searchItem + " is not in the shopping list");
        }
    }
    private static void processArrayList() {
		// copy one arrayList to another
    	//create a new arrayList
    	//instead of creating loops we can simply use this
    	ArrayList<String> newArray =  new ArrayList<String>();
    	newArray.addAll(groceryList.getGroceryList());
		
    	//another way
    	ArrayList<String> nextArray =  new ArrayList<String>(groceryList.getGroceryList());
	
    	//type the contents of the arrayList to a regular array
    	String[] myArray =  new String[groceryList.getGroceryList().size()];
    	myArray =  groceryList.getGroceryList().toArray(myArray);
    	
    	System.err.println("Array\n"+Arrays.toString(myArray));
    	
    }


}
