package udemyPractices.Collections;
/*
 * Binary Search
 * Binary search is a fast search algorithm with run-time complexity of Ο(log n) [avg and worst], best case is O(1). 
 * This search algorithm works on the principle of divide and conquer. 
 * For this algorithm to work properly, the data collection should be in the sorted form.
 * Binary search looks for a particular item by comparing the middle most item of the collection. 
 * If a match occurs, then the index of item is returned. 
 * If the middle item is greater than the item, then the item is searched in the sub-array to the left of the middle item. 
 * Otherwise, the item is searched for in the sub-array to the right of the middle item. 
 * This process continues on the sub-array as well until the size of the subarray reduces to zero.
 */
public class CollectionMain {

	public static void main(String[] args) {
		
		Theatre theatre =  new Theatre("MX", 8, 12);
		//theatre.getSeats();
		
		if (theatre.reserveSeat("H11")) {
			System.out.println("Please pay");
		}
		else {
			System.out.println("Sorry, seat is reserved");
		}
		if (theatre.reserveSeat("H11")) {
			System.out.println("Please pay");
		}
		else {
			System.out.println("Sorry, seat is reserved");
		}
	}

}
