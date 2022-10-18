package udemyPractices.Arrays;

import java.util.Arrays;
import java.util.Scanner;


/*
 * Create a program using arrays that sorts a list of integers in descending order. 
 * Descending order is highest value to lowest. 
 * In other words if the array had the values in it 106, 26, 81, 5, 15 
 * your program should ultimately have an array with 106,81,26, 15, 5 in it. 
 * Set up the program so that the numbers to sort are read in from the keyboard. 
 * Implement the following methods - getIntegers, printArray, and sortIntegers 
 * getIntegers returns an array of entered integers from keyboard 
 * printArray prints out the contents of the array 
 *  and sortIntegers should sort the array and 
 *  return a new array containing the sorted numbers 
 *  you will have to figure out how to copy the array elements from the passed array into a new array and 
 *  sort them and return the new sorted array.


 */
public class ArrayChallengeMain {
	
	
	Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {

	int[] myIntegers = getIntegers();
	printArray(myIntegers);
	//int[] sortedArray = sortIntegers(myIntegers);
	//printArrayDesc(sortedArray);
	int[] sortedArrayManual = sortIntegerManual(myIntegers);
	printArray(sortedArrayManual);
	
	//copyOf function
	int[] newsortedArray = Arrays.copyOf(sortedArrayManual, sortedArrayManual.length);
	
	}
	private static int[] sortIntegers(int[] array) {
		Arrays.sort(array);
		return array;
		
	}
	private static int[] sortIntegerManual(int[] array) {
		System.out.println("Sorting Manually...");
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if (array[i] < array[j]) {
					int temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
				
			}
		}
		
		return array;
		
	}
	private static void printArray(int[] array) {
		System.out.println("Array...");
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
	}
	private static void printArrayDesc(int[] array1) {
		System.out.println("Sorted Array...");
		int i = array1.length;
		System.out.println("value of i: "+i);
		//System.out.println(Arrays.toString(array1));
		for (int j = i-1; j >= 0; j--) {
			System.out.println(array1[j]);
		}
	}
	private static int[] getIntegers() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the limit: ");
		int i = scanner.nextInt();
		System.out.println("Enter " + i + " integer values:\r");
		int [] values = new int[i];
		for (int j = 0; j < values.length; j++) {
			values[j] = scanner.nextInt();
		}
		scanner.close();
		return values;
		
	}

}
