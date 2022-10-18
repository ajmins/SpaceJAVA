package udemyPractices.Class;
//Main class: ClssMain

/*
 * For classes, you can use either public or default:
 * public	The class is accessible by any other class	
 * default	The class is only accessible by classes in the same package
 * 
	For attributes, methods and constructors, you can use the one of the following:
	public	The code is accessible for all classes	
	private	The code is only accessible within the declared class	
	default	The code is only accessible in the same package.
	protected	The code is accessible in the same package and subclasses. 

 */

public class ClassCar {

	
	//here these attributes are not accessed by an object created in the main class
	//if we try to access it will throw some error
	private int doors;
	private int wheels;
	private String model;
	private String engine;
	private String color;
	
	//inorder to access these atttributes
	//we can create a public method	
	
	public void setModel(String model) {
		//this.model = model;
		
		//we can set a validation here
		String validModel = model.toLowerCase();
		if (validModel.equals("carrera")|| validModel.equals("musk")) {
			this.model = model;
		}
		else {
			this.model = "Unknown"; //this will be printed instead of a null
		}
	}
	public String getModel() {
		return this.model;
	}
	
	
	
	
	
	
}
