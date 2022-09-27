package myfirstJavaProgram;
import java.util.Scanner;

public class IfStatement {

	public static void main(String[] args) {
		// if statement = performs a block of code if it's condition evaluates to be true
		//conditional logic
		
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
		
		//if there is no braces for a if-block; and if two lines are there then second one is diplayed
		boolean myNumber = false;
		if(myNumber == false)
			System.out.println("My number is false");
			System.out.println("But this line only be executed");
//			My number is false
//			But this line only be executed
			
		if(myNumber == true)
			System.out.println("My number is false");
			System.out.println("But this line only be executed");
//			But this line only be executed
	
	//Note:
		//if a variable is created inside the if block and 
		//if it's called outside if block is not accessible and throw error
	
	boolean gameOver = true;
	int score,levelCompleted,bonus;
	score = 800;
	levelCompleted = 5;
	bonus = 100;
	
	if (gameOver) {
		int finalScore = score + (levelCompleted * bonus);
		System.out.println("Final score: "+ finalScore); //1300
	}
	
	//second score with the following values..
	//but make sure the first prinout above displays as well
	score = 10000;
	levelCompleted = 8;
	bonus = 200;
	if (gameOver) {
		int finalScore = score + (levelCompleted * bonus);
		System.out.println("Final score: "+ finalScore); //11600
	}
	//output
//	Final score: 1300
//	Final score: 11600
			
	
	}

}


