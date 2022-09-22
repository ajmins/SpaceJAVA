package myfirstJavaProgram;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String name = "";
		
		do {
			System.out.println("Enter your name:");
			name =  scanner.nextLine();
		}while(name.isBlank());
		
		System.out.println("Hello "+name);
		scanner.close();
	}

}
