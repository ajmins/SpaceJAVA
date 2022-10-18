package udemyPractices.ArrayChallenge;

/*
 * Write a method called readintegers() with a parameter called count that represents how many integers the user needs to enter.
The method needs to read from the console until all the numbers are entered, and then return an array containing the numbers entered.
Write a method find Min() with the array as a parameter. 
The method needs to return the minimum value in the array.
In main() read count from console and call readIntegers() with the count parameter
Call findMin() passsing array returned from the call to the readIntegers() method
print minimum element in the array


 */

import java.util.Scanner;

public class MinimumElementChallenge {

	public static void main(String[] args) {

		System.out.println("Reading from the user...");
		int[] values = readIntegers();
		System.out.println("Minimum value: "+findMin(values));

	}
	
	
	public static int[] readIntegers() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the limit: ");
		int count = scanner.nextInt();
		System.out.println("Enter the values: ");
		int[] array = new int[count];
		for (int j = 0; j < count; j++) {
			array[j] = scanner.nextInt();
		}
		return array;
		
	}
	public static int findMin(int[] array) {
		int small = 0;
		small = array[0];
		for (int i = 0; i < array.length; i++) {
			if (small <= array[i]) {
				//System.out.println(i);
				//System.out.println("If\ni: "+i+"small: "+small+"array[i]: "+array[i]);
				continue;
			}
			else {
				small = array[i];
				//System.out.println("Else\ni: "+i+"small: "+small+"array[i]: "+array[i]);
			}
			//System.out.println("small:" + small);
		}
		return small;
	}
}

