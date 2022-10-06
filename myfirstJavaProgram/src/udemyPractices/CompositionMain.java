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
		// TODO Auto-generated method stub

	}

}
