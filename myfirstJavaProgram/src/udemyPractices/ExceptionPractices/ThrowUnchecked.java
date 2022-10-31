package udemyPractices.ExceptionPractices;
/*
 * If we throw unchecked exception from a method, 
 * it is must to handle the exception or declare in throws clause.
 */
public class ThrowUnchecked {

	//a sample function
	public static void validate(int age) {
		if (age < 18) {
			//throw arithmetic exception if not eligible to vote
			throw new ArithmeticException("Person is not eligible to vote");
		}
		else {
			System.out.println("Person is eligible to vote");
		}
	}
	
	public static void main(String[] args) {

		validate(20);
		System.out.println("remaining codes");
		
	}

}
