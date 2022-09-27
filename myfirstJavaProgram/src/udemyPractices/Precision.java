package udemyPractices;

public class Precision {

	//precision refers to the format and amount of space occupied by the type
	//Single precision : 32 bits (width of 32)
	//double presision : 64 bits (width of 64)
	public static void main(String[] args) {
		// 
		float myMinFloat = Float.MIN_VALUE;
		float myMaxFloat = Float.MAX_VALUE;
		System.out.println("min value: "+myMinFloat);
		System.out.println("max value: "+myMaxFloat);
		
//		min value: 1.4E-45
//		max value: 3.4028235E38

		double myMinDouble = Double.MIN_VALUE;
		double myMaxDouble = Double.MAX_VALUE;
		System.out.println("min value: "+myMinDouble);
		System.out.println("max value: "+myMaxDouble);
		
//		min value: 4.9E-324
//		max value: 1.7976931348623157E308
		
		int i = 5;
		float f = 5.5f;
		// if we didnt use f suffix here, then 5.5 is considere default as double value and will cause error
		// so another method is to cast it to float
		float f1 = (float)5.5;
		double d = 5.5d;
		
		//Floating Point Precision and Challenge
		int myIntValue = 5 /3;
		float myFloatValue = 5f /3f;
		double myDoubleValue = 5d /3d;
		double myDoubleValue1 = 5.00 /3.00;
		System.out.println("int value: "+myIntValue);
		System.out.println("float value "+myFloatValue);
		System.out.println("double value: "+myDoubleValue);
		System.out.println("double1 value: "+myDoubleValue1);
//		int value: 1
//		float value 1.6666666
//		double value: 1.6666666666666667
//		double1 value: 1.6666666666666667
		
		//CHALLENGE
		/*
		 * Convert a given number of pounds to kilograms.
		 * Steps: 
		 * 1. Create a variable with appropriate type to store 
		 * the number of pounds to be converted to kg
		 * 2. Calculate the result and then print the result
		 * Hint: 1 pound = 0.45359237 of a kg
		 */
		double pound = 200d;
		double kg = pound * 0.45359237d;
		System.out.println("kg : "+kg );
		
		//note 
		/*
		 * In Java SE 7 and later, any number of underscore characters (_) can appear anywhere between digits in a numerical literal. 
		 * This feature enables you, for example, to separate groups of digits in numeric literals, which can improve the readability of your code.
		For instance, if your code contains numbers with many digits, 
		you can use an underscore character to separate digits in groups of three, 
		similar to how you would use a punctuation mark like a comma, or a space, as a separator.
		 */
		double pi = 3.1415927d;
		double num = 3_000_000.4_567_890d;
		System.out.println(pi); //3.1415927
		System.out.println(num); //3000000.456789
		
		//Note
		/*
		 * float and double datatypes are not used usually for precision calculation, due to the limitation with how these are stored
		 * BigDecimal : a class in java which is used when precise calculations are necessary
		 * 			like currency calculations
		 */
		
		//Char and Boolean
		char myChar = 'D';
		char myUnicodeChar = '\u0044'; /*'\ u' ->unicode*/
		//this number can be found in https://unicode-table.com/en/
		char myUnicodeChar2 = '\u002A';
		System.out.println(myChar);
		System.out.println(myUnicodeChar);
		System.out.println(myUnicodeChar2);
		
		
	}

}
