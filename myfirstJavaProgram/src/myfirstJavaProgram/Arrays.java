package myfirstJavaProgram;

import java.util.Scanner;

public class Arrays {
		//userinput
		private static Scanner scanner= new Scanner(System.in);
	public static void main(String[] args) {
		// one method
		String[] cars = {"Camaro","Corvetto","Tesla"};
		cars[0]="Mustang";
		System.out.println(cars[0]);
		
		//another method
		String[] fruits = new String[3];
		fruits[0]="Apple";
		fruits[1]="Grapes";
		fruits[2]="Mango";
		
		System.out.println(fruits[2]);
		System.out.println();
		System.out.println("<--Fruits-->");
		for(int i =0; i<fruits.length;i++) {
			System.out.println(fruits[i]);
		}
		System.out.println();
		System.out.println("<--Cars-->");
		for(int i =0; i<cars.length;i++) {
			System.out.println(cars[i]);
		}
		
		//this initialization is not possible
		//becz Array constants can only be used in initializers
		//int[] myIntArray = new int[4];
		//myIntArray = {1,2,3,4};
		
		//this was of initializing array = anonymous array
		int[] myArray = {1,2,3,4};
		for(int i =0; i<myArray.length;i++) {
			System.out.println(i + " \t "+myArray[i]);
		}
		//calling array as argument
		//printArray(myArray);
		//printArray(fruits);
		
		int[] myIntegers = getIntegers(5);
		for (int i = 0; i < myIntegers.length; i++) {
			System.out.println("Element "+ i + ", typed values was "+myIntegers[i]);
		}
		
		//myIntegers[] has user entered values
		System.out.println("The average is "+ getAverage(myIntegers));
	}
	
	
	private static int[] getIntegers(int i) {
		//\r means next line
		System.out.println("Enter " + i + " integer values:\r");
		int [] values = new int[i];
		for (int j = 0; j < values.length; j++) {
			values[j] = scanner.nextInt();
		}
		return values;
	}
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(i + " \t "+array[i]);
		}
	}
	public static double getAverage(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum +=array[i];
		}
		return (double) sum / (double)array.length;
		
	}

}
