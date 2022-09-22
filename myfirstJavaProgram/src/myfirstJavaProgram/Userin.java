package myfirstJavaProgram;
import java.util.Scanner;
public class Userin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your name? ");
		String name = scanner.nextLine();
		System.out.println("How old are you?");
		int age =  scanner.nextInt();
		scanner.nextLine(); 
		//this is ensure that the scanner previous values are cleared
		//here previous value is \n (new line)
		System.out.println("What is your favourite food? ");
		String food = scanner.nextLine();
		System.out.println("Hello "+name);
		System.out.println("You are "+age+"years old");
		System.out.println("You like "+food);
		scanner.close();
	}

}
