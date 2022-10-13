package udemyPractices;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;


public class ArrayList_vs_LinkedList {

	public static void main(String[] args) {

		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(3);
		intList.add(4);
		
		//printValues(intList); 
		/*
		 *  1
			3
			4
		 */
		intList.add(1,2);
		//printValues(intList);
		/* here, to insert more values other entries are moved down to make space for new entry; may cause issues in large records
		 *	1
			3
			4
			1
			2
			3
			4
		 */
		LinkedList<String> placesToVisit = new LinkedList<String>();
		placesToVisit.add("Delhi");
		placesToVisit.add("Mumbai");
		placesToVisit.add("Pune");
		//printValues(placesToVisit); //Now visiting Delhi Now visiting Mumbai Now visiting Pune
		
		placesToVisit.add("London");
		//printValues(placesToVisit); //Now visiting Delhi Now visiting Mumbai Now visiting Pune Now visiting London
		
		placesToVisit.add(2,"Sydney");
		//printValues(placesToVisit);  //Now visiting Delhi//	Now visiting Mumbai//	Now visiting Sydney//	Now visiting Pune //Now visiting London
		placesToVisit.addFirst("USA");
		//printValues(placesToVisit); // Now visiting USA // Now visiting Delhi//	Now visiting Mumbai//	Now visiting Sydney//	Now visiting Pune //Now visiting London
		placesToVisit.addLast("Egypt");
		//printValues(placesToVisit);// Now visiting USA Now visiting Delhi Now visiting Mumbai Now visiting Sydney Now visiting Pune Now visiting London Now visiting Egypt
		placesToVisit.remove(4);
		//printValues(placesToVisit); // Now visiting USA Now visiting Delhi Now visiting Mumbai Now visiting Sydney Now visiting London Now visiting Egypt
	
		LinkedList<String> places = new LinkedList<String>();
		addInOrder(places,"Sydney");
		addInOrder(places,"Egypt");
		addInOrder(places,"USA");
		//printNewValues(places);
		addInOrder(places,"London");
		addInOrder(places,"Egypt");
		printNewValues(places);
		visit(places);
	}

	private static void printValues(LinkedList<String> placesToVisit) {
		Iterator<String> iter = placesToVisit.iterator();
		while (iter.hasNext()) {
			System.out.println("Now visiting "+ iter.next());
			
		}
		
	}

	private static void printValues(ArrayList<Integer> intList) {
		for (int i = 0; i < intList.size(); i++) {
			System.out.println(intList.get(i));
		}
		
	}
	
	private static void printNewValues(LinkedList<String> places) {
		Iterator<String> iter = places.iterator();
		while (iter.hasNext()) {
			System.out.println("Now visiting "+ iter.next());
			
		}
		
	}
	private static boolean addInOrder(LinkedList<String> places, String newCity) {
		ListIterator<String> strngListIterator = places.listIterator();
		
		while (strngListIterator.hasNext()) {
			int comparison = strngListIterator.next().compareTo(newCity);
			if (comparison == 0) {
				System.out.println(newCity + " is already there!");
				return false;
			}
			else if (comparison>0) { //newcity should appears before this
				strngListIterator.previous();
				strngListIterator.add(newCity);
				return true;
			}
			else if (comparison<0) { //move on next city
				
			}
			
		}
		strngListIterator.add(newCity);
		return true;
	}
	
	private static void visit(LinkedList cities) {
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		boolean goingForward = true; //variable to ensure the direction
		//this is used , if we r moving next and suddently move back, we will get the result twice
		ListIterator<String> listIterator = cities.listIterator();
		
		if (cities.getFirst() == "") {
			System.out.println("No cities in the iterenery");
			return;
			
		}
		else {
			System.out.println("Now visiting "+listIterator.next());
			printMenu();
		}
		while(!quit) {
			 int action = scanner.nextInt();
			 scanner.nextLine();
			 switch (action) {
			case 0:
				System.out.println("Holiday over");
				quit = true;
				break;
			case 1:
				if (!goingForward) {
					if (listIterator.hasNext()) {
						listIterator.next();
					}
					goingForward = true;
				}
				if (listIterator.hasNext()) {
					System.out.println("Now visiting " + listIterator.next());
				}
				else {
					System.out.println("Reached the end of the list");
					goingForward = false;
				}
				break;
			case 2:
				if (goingForward) {
					if (listIterator.hasPrevious()) {
						listIterator.previous();
					}
					goingForward = false;
				}
				if (listIterator.hasPrevious()) {
					System.out.println("Now visiting " + listIterator.previous());
				}
				else {
					System.out.println("We are at the start of the list");
					goingForward = true;
				}
				break;
			case 3:
				printMenu();
				break;
			default:
				break;
			}
		}
	}

	private static void printMenu() {
		System.out.println("Available actions: ");
		System.out.println("0- Quit\n"
				+ "1-Goto next city\n"
				+ "2-Goto previous city\n"
				+ "3-Print menu");
		
	}
	

}
