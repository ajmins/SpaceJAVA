package udemyPractices;

public class CompositionMain {

	/*
	 * Real-life Example: Library system 
	In this example, 
	we create a class Book that contains data members like author, and title and 
	create another class Library that has a reference to refer to the list of books. 
	A library can have no. of books on the same or different subjects. 
	So, If the Library gets destroyed then All books within that particular library will be destroyed. 
	i.e., books can not exist without a library. 
	The relationship between the library and books is composition.
	 */
	
	/*
	 * The Inheritance is used to implement the "is-a" relationship. 
	 * The "has-a" relationship is used to ensure the code reusability in our program.
	 * The composition relationship of two objects is possible when one object contains another object, and that object is fully dependent on it. 
	 * The contained object should not exist without the existence of its parent object. 
	 */
	public static void main(String[] args) {

		//create dimension
		CompositionDimensions dimensions = new CompositionDimensions(20, 20, 5);
		//create a case
		CompositionCase theCase = new CompositionCase("220B", "Dell", "240", dimensions);
		//create monitor and inside that create an instance of Resolution class
		//another method of creating instance within the instantiation 
		CompositionMonitor theMonitor = new CompositionMonitor("27inch Beast", "Acer", 27, new CompositionResolution(2540, 1440));
		//create motherboard
		CompositionMotherboard theMotherboard = new CompositionMotherboard("BJ-200", "Asus", 4, 6, "v2.44");
		//create PC
		CompositionPC thePc = new CompositionPC(theCase, theMonitor, theMotherboard);
		
		//to draw something we need to call the function drawPixelAt in monitor class.
		//getMonitor will return the monitor object and call the function
		thePc.getMonitor().drawPixelAt(1500, 1200, "blue");
		thePc.getMotherboard().loadProgram("Windows 1.0");
		thePc.getTheCase().pressButton();
		
		/*
		 * composition here 
		 * accessing from the base classes like case, monitor and motherboard and accessing them via PC object
		 * thePc has a monitor, has a motherboard and has a case.
		 * inherience of composition
		 */
		
		
	}

}
