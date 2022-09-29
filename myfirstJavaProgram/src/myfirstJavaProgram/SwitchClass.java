package myfirstJavaProgram;

import java.util.Scanner;
/*
 * Control flow Statements
 * 1. switch statement
 * 2. for statement
 * 3. while statement
 * 4. do-while statement
 */

public class SwitchClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the day:");
		String day = scanner.nextLine();
		
		switch(day.toLowerCase()) {
			case "sunday": System.out.println("It is Sunday");
			break;
			case "monday": System.out.println("It is Monday");
			break;
			case "tuesday": System.out.println("It is Tuesday");
			break;
			case "wednesday": System.out.println("It is Wednesday");
			break;
			case "thursday": System.out.println("It is Thursday");
			break;
			case "friday": System.out.println("It is Friday");
			break;
			case "saturday": System.out.println("It is Saturday");
			break;
			case "day" :case "DAY":case "Day":System.out.println("You have not entered a day!");
			break;
			default: System.out.println("Invalid day!!");
			//here break; is optional
		}
		scanner.close();
	}

}
