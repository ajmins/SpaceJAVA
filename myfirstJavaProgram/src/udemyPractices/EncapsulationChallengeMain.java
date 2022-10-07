package udemyPractices;

public class EncapsulationChallengeMain {

	/*
	 * Create a class and demonstate proper encapsulation techniques the class will be called Printer 
	 * It will simulate a real Computer Printer 
	 * It should have fields for the toner Level, number of pages printed, 
	 * and also whether its a duplex printer (capable of printing on both sides of the paper). 
	 * Add methods to fill up the toner (up to a maximum of 100%), 
	 * another method to Simulate printing a page (which should increase the number of pages printed). 
	 * Decide on the scope, whether to use constructors, and anything else you think is needed.


	 */
	
	
	public static void main(String[] args) {

		EncapsulationChallengePrinter printer = new EncapsulationChallengePrinter(50, true);
		System.out.println("initial page count = "+printer.getnoOfPagesPrinted());
		
		int noOfPagesPrinted = printer.printPaper(4);
		System.out.println("Pages printed was " + noOfPagesPrinted + " new total print count for printer = "+ printer.getnoOfPagesPrinted());
		
		noOfPagesPrinted = printer.printPaper(2);
		System.out.println("Pages printed was " + noOfPagesPrinted + " new total print count for printer = "+ printer.getnoOfPagesPrinted());
		
		noOfPagesPrinted = printer.printPaper(5);
		System.out.println("Pages printed was " + noOfPagesPrinted + " new total print count for printer = "+ printer.getnoOfPagesPrinted());
		
	}

}
