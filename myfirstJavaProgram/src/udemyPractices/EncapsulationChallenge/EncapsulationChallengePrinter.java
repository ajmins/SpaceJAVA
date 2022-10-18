package udemyPractices.EncapsulationChallenge;
/*
 * Create a class and demonstate proper encapsulation techniques the class will be called Printer 
 * It will simulate a real Computer Printer 
 * It should have fields for the toner Level, number of pages printed, 
 * and also whether its a duplex printer (capable of printing on both sides of the paper). 
 * Add methods to fill up the toner (up to a maximum of 100%), 
 * another method to Simulate printing a page (which should increase the number of pages printed). 
 * Decide on the scope, whether to use constructors, and anything else you think is needed.


 */
public class EncapsulationChallengePrinter {

	private int tonerLevel;
	private int noOfPagesPrinted;
	private boolean isDuplex;

public EncapsulationChallengePrinter(int tonerLevel, boolean isDuplex) {
	
	if (tonerLevel > -1 && tonerLevel <= 100) {
		this.tonerLevel = tonerLevel;
	}
	else {
		this.tonerLevel = -1;
	}
	this.noOfPagesPrinted  = 0;
	this.isDuplex = isDuplex;
}
	
	
	public int fillToner(int tonerAmount) {
		if (tonerAmount > 0 && tonerAmount <= 100) {
			if (this.tonerLevel + tonerAmount > 100) {
				return -1;
			}
			this.tonerLevel += tonerAmount;
			return this.tonerLevel;
		}
		else {
			return -1;
		}
		
	}
	public int printPaper(int pages) {
		int pagesToPrint =pages;
		if (this.isDuplex) {
			pagesToPrint = ((pages/2) +(pages % 2)); //consider printing odd number also
			System.out.println("Printing in duplex mode");
		}
		this.noOfPagesPrinted += pagesToPrint;
		return pagesToPrint;
	}
	public int getnoOfPagesPrinted() {
		return noOfPagesPrinted;
	}
}
