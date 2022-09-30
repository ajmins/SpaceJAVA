package udemyPractices;

import java.util.Scanner;

public class MinAndMaxChallenege {

	/*
	 * 	Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
		Before the user enters the number, print the message "Enter number:"
		If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
		
		Hint:
		Use an endless while loop. 

	 */
	
	public static void main(String[] args) {
		int MIN_VALUE = 0;
		//but here if the user input is 2 then it wont display as the smallest number becz of this 0
		//so set a flag to handle this
		int MAX_VALUE = 0;
		boolean flag = true;
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Enter number: ");
			boolean isInt = scanner.hasNextInt();

			if (isInt) {
				int num =  scanner.nextInt(); 
				
				if (flag) {
					flag = false; 
					//now the flag is always false after the user has entered a number initially
					//and the minimum and max value is set accordingly
					MIN_VALUE = num;
					MAX_VALUE = num;
				}
				
				if (num < MIN_VALUE) {
					MIN_VALUE = num;
				}
				else if (num > MAX_VALUE) {
					MAX_VALUE = num;
				}
			}
			else {
				break;
			}
			scanner.nextLine();
		}
		scanner.close();
		System.out.println("Max: " +MAX_VALUE + "\nMin: "+MIN_VALUE);

	}

}
