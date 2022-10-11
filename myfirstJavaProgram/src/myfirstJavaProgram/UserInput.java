package myfirstJavaProgram;
import java.util.Scanner;
public class UserInput {
	/*
	 * Scanner Class
	 * 
	 * The Scanner class reads an entire line and divides the line into tokens. 
	 * Tokens are small elements that have some meaning to the Java compiler.
	 * 
	 	Scanner Input Types
		nextBoolean()	Reads a boolean value from the user
		nextByte()		Reads a byte value from the user
		nextDouble()	Reads a double value from the user
		nextFloat()		Reads a float value from the user
		nextInt()		Reads a int value from the user
		nextLine()		Reads a String value from the user
		nextLong()		Reads a long value from the user
		nextShort()		Reads a short value from the user
	 
	 *To create an object of Scanner class, we usually pass the predefined object System.in, which represents the standard input stream. 
	 *We may pass an object of class File if we want to read input from a file.
	 *To read numerical values of a certain data type XYZ, the function to use is nextXYZ(). 
	 *For example, to read a value of type short, we can use nextShort()
	 *To read strings, we use nextLine().
	 *To read a single character, we use next().charAt(0). 
	 *		next() function returns the next token/word in the input as a string and 
	 *		charAt(0) function returns the first character in that string.
	 *The Scanner class reads an entire line and divides the line into tokens. 
	 *Tokens are small elements that have some meaning to the Java compiler
	 *
	 *
	 */

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your name? ");
		String name = scanner.nextLine();
		System.out.println("How old are you?");
		
		/*
		 * check if the scanner’s input is of the type we want with the help of hasNextXYZ() functions where XYZ is the type we are interested in.
		 * eg, if int, hasNextInt() 
		 * The function returns true if the scanner has a token of that type, otherwise false.
		 *  To check for a string, we use hasNextLine() 
		 *  To check for a single character, we use hasNext().charAt(0)
		 */
		
		boolean hasNextInt = scanner.hasNextInt();
		if (hasNextInt) {
			int age =  scanner.nextInt(); 
			//it do not give an option to enter any input after nextInt()
			//so we need to use nextLine()
			scanner.nextLine(); 
			//this is ensure that the scanner previous values are cleared
			//here previous value is \n (new line) (i.e., line seperator)
			
			if (age >= 0 && age <= 100) {
				System.out.println("Hello "+name +" and you are "+age+" years old");
				
			}
			else {
				System.out.println("Invalid age");
			}
			System.out.println("What is your favourite food? ");
			String food = scanner.nextLine();
			System.out.println("You like "+food);
		}
		else {
			System.out.println("Unable to parse.");
		}
			
		
		scanner.close(); //releases underlying memory, it was using internally
	}

}
