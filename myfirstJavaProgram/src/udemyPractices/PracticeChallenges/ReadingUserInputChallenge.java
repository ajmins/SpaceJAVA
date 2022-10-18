package udemyPractices.PracticeChallenges;

import java.util.Scanner;

public class ReadingUserInputChallenge {
	
	/*
	 * Read 10 numbers from the console entered by the user and print the sum of those numbers.
	 * Create a Scanner like we did in the previous video.
	 * Use the hasNextInt() method from the scanner to check if the user has entered an int value.
	 * If hasNextInt() returns false, print the message "Invalid Number". Continue reading until you have read 10 numbers.
	 * Use the nextInt() method to get the number and add it to the sum.

	Before the user enters each number, 
	print the message "Enter number #x:" where x represents the count, i.e. 1, 2, 3, 4, etc.
	For example, the first message printed to the user would be "Enter number #1:", 
	the next "Enter number #2:", and so on.
	Hint: 
	• Use a while loop. 
	• Use a counter variable for counting valid numbers.
	
	Close the scanner after you don't need it anymore. Create a project with the name ReadingUserInputChallenge.

	 */

	//using for loop
	public static void main(String[] args) {
		
		int MAX_VALUE = 10;
		int sum = 0;
		int count = 1;
		Scanner scanner = new Scanner(System.in);
		//using for loop
		/*
		for (int i = 1; i <= MAX_VALUE; i++) {
			System.out.println("Enter number #"+i+" : ");
			boolean hasNextInt = scanner.hasNextInt();
			if (hasNextInt) {
				int num =  scanner.nextInt(); 
				sum += num;	
			}
			else {
				System.out.println("Invalid Value!");
				continue;
			}
		}		
		 */
		//using while loop
		while (count <= MAX_VALUE ) {
			
			System.out.println("Enter a number #"+count+" : ");
			boolean hasNextInt = scanner.hasNextInt();
			if (hasNextInt) {
				int num =  scanner.nextInt(); 
				sum += num;	
				count++;
			}
			else {
				System.out.println("Invalid Value!");
			}	
			scanner.nextLine(); //if not used then the loop will go infinite times with invalid value if not an integer is entered
		}
		scanner.close();
		System.out.println("sum: "+sum);		
	}
}
