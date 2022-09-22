package myfirstJavaProgram;

public class PrintfMethod {
	//printf() = an optional method to control, format and display text to the console window
	//			2 arguments = format string + (object/variable/value)
	//			%[flags] [precision][width][conversion-character]
	public static void main(String[] args) {
		
		boolean myBoolean = true;
		char myChar = '@';
		String myString = "Bro";
		int myInt = 50;
		double myDouble = 1000;
		double myDouble2 = -1000;
		
		// [conversion- character]
//		System.out.printf("This is a format string with boolean %b",myBoolean);
//		System.out.printf("This is a format string with charater %c",myChar);
//		System.out.printf("This is a format string with string %s",myString);
//		System.out.printf("This is a format string with integer %d",myInt);
//		System.out.printf("This is a format string with double %f",myDouble);
		
		//[width]
		//minimum number of characters to be written as output
		System.out.printf("Hello %10s",myString); //"Hello        Bro"
		System.out.println();
		System.out.printf("Hello %-6s",myString); //"Hello Bro   "
		
		System.out.println();
		//[precision]
		//sets number of digits of precision when outputting floating-point values
		System.out.printf("You have this much money %.2f ", myDouble); //1000.00
		System.out.printf("You have this much money %f ", myDouble); //1000.000000 
		System.out.printf("You have this much money %.10f ", myDouble); //1000.0000000000
		
		System.out.println();
		//[flags]
		//adds an effect to output based on the flag added to format specifier
		// - : left-justify
		// + : output a plus ( + ) or minus ( - ) sign for a numeric value
		// 0 : numeric values are zero-padded
		// , : comma grouping seperator if numbers > 1000
		System.out.printf("You have this much money %20f ", myDouble); //"You have this much money          1000.000000"
		System.out.printf("You have this much money %-20f ", myDouble); //"You have this much money 1000.000000          "
		System.out.printf("You have this much money %+f ", myDouble); //"+1000.000000 "
		System.out.printf("You have this much money %+f ", myDouble2); //"-1000.000000 "
		System.out.println();
		
		System.out.printf("You have this much money %020f ", myDouble); //"0000000001000.000000 "
		System.out.println();
		System.out.printf("You have this much money %,f ", myDouble); //"1,000.000000 "
		
	}

}
