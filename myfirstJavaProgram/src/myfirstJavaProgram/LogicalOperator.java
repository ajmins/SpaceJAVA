package myfirstJavaProgram;
import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {
		// && - AND
		// || - OR
		// ! - NOT
		//AND
		int temp = 25;
		if(temp>30) {
			System.out.println(" Hot outside");
		}
		else if(temp>=20 && temp<=30) {
			System.out.println(" Warm outside");
		}
		else {
			System.out.println(" Cold outside");
		}
		//OR
		Scanner scanner = new Scanner(System.in);
		System.out.println("You are playing a game! Press q or Q to quit");
		String response = scanner.next();		
		
		if(response.equals("q") ||(response.equals("Q"))) {
			System.out.println("You quit the game!");
		}
		else {
			System.out.println("You are still playing a game!");
		}
		scanner.close();
	}

}
