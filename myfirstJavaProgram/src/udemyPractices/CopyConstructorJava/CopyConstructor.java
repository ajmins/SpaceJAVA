package udemyPractices.CopyConstructorJava;

public class CopyConstructor {

	/*
	 * A copy constructor in a Java class is a constructor that creates an object 
	 * using another object of the same Java class.
	 * 
	 * To create a copy constructor, we can first declare a constructor that takes an object of the same type as a parameter
	 * 
	 * Then, we copy each field of the input object into the new instance
	 */
	
	int id;
	String name;
	
	CopyConstructor(int no, String text){
		
		id = no;
		name = text;
		
	}
	//make a copy constructor and pass object of the sample contsructor
	CopyConstructor(CopyConstructor cp){
		id = cp.id;
		name = cp.name;
	}
	
	//create a method
	void display() {
		System.out.println(id + " " + name);
	}
	public static void main(String[] args) {

		//call sample constructor by creating an instance
		CopyConstructor cp1 = new CopyConstructor(1, "Ami");
		
		//call copy constructor by creating an instance with the object name of sample contructor
		CopyConstructor cp2 = new CopyConstructor(cp1); // will print the same values  above

		cp1.display(); //1 Ami
		cp2.display(); //1 Ami
		
		//we can change the values of copy constructor
		cp2.id = 10;
		cp2.name = "Ajmi";
		cp2.display(); //10 Ajmi
	}

}
