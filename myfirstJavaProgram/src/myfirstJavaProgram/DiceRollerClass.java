package myfirstJavaProgram;

import java.util.Random;

//main program:  VariableScopeMain
public class DiceRollerClass {
	
	//case 1: here number and random is visble to DiceRollerClass alone
	// it cannot be accessed by roll() function
	/*
	 DiceRollerClass() {
		Random random = new Random();
		int number = 0;
		roll();
	}
	 void roll() {
		 number = random.nextInt(6)+1;
		 System.out.println(number);
	 }
	 */
	//two ways to make this possible;
	//1: pass these as arguments
	//2: make them as global
	
	//case 2: passing as arguments
	/*
	 DiceRollerClass() {
		Random random = new Random();
		int number = 0;
		roll(random,number);
	}
	 void roll(Random random,int number) {
		 number = random.nextInt(6)+1;
		 System.out.println(number);
	 }
	 */
	
	 //case 3: making as global
	//put them outside the constructor but within the class
	Random random;
	int number;
	DiceRollerClass() {
		random = new Random();
		number = 0;
		roll();
	}
	 void roll() {
		 number = random.nextInt(6)+1;
		 System.out.println(number);
	 }
	
	
	
}
