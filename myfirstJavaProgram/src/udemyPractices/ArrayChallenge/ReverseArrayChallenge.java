package udemyPractices.ArrayChallenge;

import java.util.Arrays;

/*
 * Write a method called reverse() with an int array as a parameter. 
 * The method should not return any value. In other words, the method is allowed to modify the array parameter. 
 * In main() test the reverse() method and print the array both reversed and nonreversed. 
 * To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on. 
 * For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}. 

 */


public class ReverseArrayChallenge {

	public static void main(String[] args) {
		int[] numbers = new int[] {1,2,3,4,5,6};
		//reverseWithAnotherArray(numbers);
		reverseSwapping(numbers);

	}
	private static void reverseSwapping(int[] array) {
		System.out.println("Original array...");
		printArray(array);
		//use swapping instead of another array
		//find a midlength to determine the no of iterations
		//using a temporary variable, swap fst with last
		System.out.println("Reversed array...");
		int count = (int)(array.length/2);
		int j =0;
		int k = array.length-1;
		for (int i = 0; i < count; i++) {
			int temp = array[j];
			array[j] = array[k];
			array[k]=temp;
			j++;
			k--;
		}
		printArray(array);
		
	}
	public static void reverseWithAnotherArray(int[] array) {
		
		System.out.println("Original array...");
		printArray(array);
		//used seperate array instead of simply reversing the loop
		System.out.println("Reversed array...");
		int[] reverseNumber = new int[array.length];
		int count = array.length;
		int i =0;
			for (int j = (count - 1); j >= 0; j--) { 
				System.out.println("array: "+ array[i] + "\treverse:"+reverseNumber[i]);
				reverseNumber[i] = array[j]; 
				i++;
				System.out.println("array: "+ Arrays.toString(array)  + "\treverse:"+ Arrays.toString(reverseNumber));
			} 
			System.out.println("array: "+ Arrays.toString(array)  + "\treverse:"+ Arrays.toString(reverseNumber));
		
		printArray(reverseNumber);
			
	}
	 
	public static void printArray(int[] reverseNumber) {
		for (int i = 0; i < reverseNumber.length; i++) {
			System.out.println(reverseNumber[i]);
		}
	}

}
