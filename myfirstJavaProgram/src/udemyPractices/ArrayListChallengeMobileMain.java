package udemyPractices;
/*
 * Create a program that implements a simple mobile phone with the following capabilities. 
 * Able to store, modify, remove and query contact names. 
 * You will want to create a separate class for Contacts (name and phone number). 
 * Create a master class MobilePhone that holds the ArrayList of Contacts The MobilePhone class has the functionality listed above. 
 * Add a menu of options that are available. 
 * Options: Quit, print list of contacts, add new contact, update existing contact, remove contact and search/find contact. 
 * When adding or updating be sure to check if the contact already exists (use name) 
 * Be sure not to expose the inner workings of the Arraylist to MobilePhone 
 * e.g. no ints, no .get(i) etc MobilePhone should do everything with Contact objects only.


 */

import java.util.Scanner;

public class ArrayListChallengeMobileMain {

	private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilephone = new MobilePhone("0092 22 32324"); //my number

     public static void main(String[] args) {
         boolean quit = false;
         startPhone();
         printActions();
         int choice = 0;
         while(!quit) {
             System.out.println("\nEnter your choice: (0 to show available actions) " );
             choice = scanner.nextInt();
             scanner.nextLine();

             switch(choice) {
                 case 0:
                	 printActions();
                     break;
                 case 1:
                	 mobilephone.printContacts();
                     break;
                 case 2:
                     addNewContact();
                     break;
                 case 3:
                     modifyContact();
                     break;
                 case 4:
                     removeContact();
                     break;
                 case 5:
                     searchForContact();
                     break;
                 case 6:
                     quit = true;
                     System.out.println("\nShutting down...");
                     break;
             }
         }
    }



	private static void searchForContact() {
		System.out.println("Enter existing contact name: ");
		String name = scanner.nextLine();
		Contact existingContact= mobilephone.queryContact(name);
		if (existingContact == null) {
			System.out.println("Contact not found");
			return;
		}
		System.out.println("Name: "+existingContact.getName()+ " Phone: "+existingContact.getPhoneNumber());
		
	}
	private static void removeContact() {
		System.out.println("Enter existing contact name: ");
		String name = scanner.nextLine();
		Contact existingContact= mobilephone.queryContact(name);
		if (existingContact == null) {
			System.out.println("Contact not found");
			return;
		}
		if (mobilephone.removeContact(existingContact)) {
			System.out.println("Successfully deleted");
		}
		else {
			System.out.println("Error deleting contact");
		}	
	}
	private static void modifyContact() {
		System.out.println("Enter existing contact name: ");
		String name = scanner.nextLine();
		Contact existingContact= mobilephone.queryContact(name);
		if (existingContact == null) {
			System.out.println("Contact not found");
			return;
		}
		System.out.println("Enter new contact name: ");
		String newName = scanner.nextLine();
		System.out.println("Enter new contact number: ");
		String newNumber = scanner.nextLine();
		
		Contact newContact = Contact.createContact(newName, newNumber);
		if (mobilephone.modifyContact(existingContact, newContact)) {
			System.out.println("successfully updated record");
		}
		else {
			System.out.println("Error updating record ");
		}	
	}
	private static void addNewContact() {
		System.out.println("Enter new contact name: ");
		String name = scanner.nextLine();
		System.out.println("Enter new contact number: ");
		String number = scanner.nextLine();
		
		Contact newContact = Contact.createContact(name, number);
		if (mobilephone.addNewContact(newContact)) {
			System.out.println("New contact added! Name: "+name +" Phone: "+number);
		}
		else {
			System.out.println("Cannot add, " + name +" already on file");
		}
	}



	private static void printActions() {
		 System.out.println("\nAvailable actions:");
	        System.out.println("\t 0 - List choice options.");
	        System.out.println("\t 1 - Print the list of contacts.");
	        System.out.println("\t 2 - Add a new contact");
	        System.out.println("\t 3 - Modify an existing contact");
	        System.out.println("\t 4 - Remove a contact");
	        System.out.println("\t 5 - Search a contact");
	        System.out.println("\t 6 - To shut down.");
	     System.out.println("\nChoose your actions: ");   
		
	}

	private static void startPhone() {
		System.out.println("Starting phone...");
		
	}


}
