package udemyPractices.ExceptionPractices;

//class for custom exception
class InvalidAgeException extends Exception{

	public InvalidAgeException(String str) {
		//calling constructor of parent Exception
		super(str);
	}
	
}

public class MyCustomException {
	
	static void validate(int age) throws InvalidAgeException{
		if (age < 18) {
			//throw an error
			throw new InvalidAgeException("Age is not valid");
		}
		else {
			System.out.println("Welcome to the portal");
		}
	}

	public static void main(String[] args) {

		try {
			//calling a method
			validate(10);
		} catch (InvalidAgeException e) { 
			//InvalidAgeException is a cutom created exception class
			System.out.println("Exception caught");
			//print msg from the custome exception class
			System.out.println("Exception occured: "+e);
		}
		System.out.println("The program has been executed with proper handling of the exception!");
	}

}
