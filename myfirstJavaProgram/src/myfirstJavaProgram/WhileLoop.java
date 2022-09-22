package myfirstJavaProgram;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String name = "";
		
		while(name.isBlank()) {
			System.out.println("Enter your name:");
			name =  scanner.nextLine();
		}
		
		System.out.println("Hello "+name);
		scanner.close();
	}

}
