package udemyPractices;

public class CodeExercise1 {
	/*
	Positive, Negative or Zero
	Write a method called checkNumber with an int parameter number
	The method should not return any value, and it needs to print out:
	• "positive" if the parameter number is > 0 
	• "negative" if the parameter number is < 0 
	• "zero" if the parameter number is equal to 0
	NOTE: The checkNumber method needs to be defined as public static like we have been doing so far in the course.
*/

	public static void main(String[] args) {

		int number;
		//number = 4;
		//number = -5;
		number = 0;
		checkName(number);

	}
	public static void checkName(int number) {
		if (number > 0) {
			System.out.println("Positive Number");
		}
		else if (number < 0) {
			System.out.println("Negative Number");
		}
		else if (number == 0) {
			System.out.println("Zero");
		}
		
	}

}
