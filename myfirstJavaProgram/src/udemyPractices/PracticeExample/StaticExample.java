package udemyPractices.PracticeExample;

import java.util.Scanner;

/*
	You are given a class StaticExample with a main method. 
	Complete the given code so that it outputs the area of a parallelogram with breadth and height. 
	You should read the variables from the standard input. and must be in static type.
	Also create a static block to get data from the user

	If H<=0 or B<=0 , the output should be "java.lang.Exception: Breadth and height must be positive" without quotes.
	
	Input:
	the breadth and height of the parallelogram.
	
	Output:
	Area, if both B and H greater than 0.
	print exception, otherwise.
	
	Constraints:
	-100<= B,H <= 100
 */
public class StaticExample {
	
	static int B, H;
	static boolean flag = true;
	
	static {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter breadth: ");
		B = scanner.nextInt();
		System.out.print("Enter height: ");
		H = scanner.nextInt();
		//scanner.nextLine();
		scanner.close();
		try {
			if (B <= 0 || H <= 0) {
				flag = false;
				throw new Exception("Breadth and height must be positive");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

	public static void main(String[] args) {
		if (flag == true) {
			int areaOfParallellogram = B*H;
			System.out.println("Area of parallellogram with breadth "+B+" and height "+H+" is "+areaOfParallellogram);
		}
	}
	
}
