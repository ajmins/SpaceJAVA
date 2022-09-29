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
	 */

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your name? ");
		String name = scanner.nextLine();
		System.out.println("How old are you?");
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
