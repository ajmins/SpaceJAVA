package udemyPractices;

import java.util.Arrays;

/*
 * All the primitive types are Value types
 * array is reference type
 * string is also reference types
 * 
 * 
 */

public class RefernceTypesVSValueTypes {

	public static void main(String[] args) {
		//In value type,
		int a = 23;
		int b = 34;
		System.out.println("1st\t a: "+a+"\tb: "+b);
		//1st	 a: 23	b: 34
		b = a;
		System.out.println("2nd\t a: "+a+"\tb: "+b);
		//2nd	 a: 23	b: 23
		b++;
		System.out.println("3rd\t a: "+a+"\tb: "+b);
		//3rd	 a: 23	b: 24
		//this is the case with value types, 
		
		//in refernce type, reference on address not on the object itself
		//myInArray is a variablethat referneces  or addresses to a memory
		int[] myIntArray = new int[5];
		//here anotherArray is another refernce to the same array in the memory
		//so here two refernces pointing the same array, they hold the same address.
		int[] anotherArray = myIntArray;
		//lets' check the address by printing
		System.out.println(myIntArray + "\t"+anotherArray);
		//[I@326de728	[I@326de728
		//add some values
		myIntArray[0]=1;
		System.out.println(Arrays.toString(myIntArray)  + "\t"+ Arrays.toString(anotherArray) );
		//[1, 0, 0, 0, 0]	[1, 0, 0, 0, 0]
		modifyarray(anotherArray);
		System.out.println("After modification" +Arrays.toString(myIntArray)  + "\t"+ Arrays.toString(anotherArray) );
		//After modification[2, 0, 0, 0, 0]	[2, 0, 0, 0, 0]
		
		System.out.println("Create a new array");
		myIntArray = new int[] {6,7,8,9,10};
		modifyarray(anotherArray);
		System.out.println("After new array creation" +Arrays.toString(myIntArray)  + "\t"+ Arrays.toString(anotherArray) );
		//After new array creation[6, 7, 8, 9, 10]	[2, 0, 0, 0, 0]
		//nevc here both myintarray and anotherarray is two different variable pointing two different memory
	}
	private static void modifyarray(int[] array) {
		array[0]=2;
		//create a new array 
		array = new int[] {1,2,3,4,5};
	}

}
