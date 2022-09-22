package myfirstJavaProgram;
import java.util.Scanner;

public class LoopIf {

	public static void main(String[] args) {
		// if statement = performs a block of code if it's condition evaluates to be true
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = scanner.nextInt();
		if(age >= 18 && age <75) {
			System.out.println("You are an adult!");
		}
		else if(age>=75) {
			System.out.println("You are a senior citizen!");
		}
		else {
			System.out.println("You are an not adult!");
		}
		scanner.close();
	}

}


