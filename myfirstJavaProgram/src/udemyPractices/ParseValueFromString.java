package udemyPractices;

public class ParseValueFromString {

	/*
	 * String parsing in java can be done by using a wrapper class. 
	 */
	
	
	
	public static void main(String[] args) {
		
		String numberAsString = "2022";
		System.out.println("String = "+numberAsString);

		int num = Integer.parseInt(numberAsString);
		System.out.println("Number as String= "+num);
		
		numberAsString +=1;
		num +=1;
		
		System.out.println("After increment");
		System.out.println("String = "+numberAsString);
		System.out.println("Number as String= "+num);
		
		/*
		String = 2022
		Number as String= 2022
		After increment
		String = 20221
		Number as String= 2023
		 */
		
		String numberAsString2 = "2022.234";
		System.out.println("String = "+numberAsString2);

		double num2 = Double.parseDouble(numberAsString2);
		System.out.println("Number as String= "+num2);
		
		numberAsString2 +=1;
		num2 +=1;
		
		System.out.println("After increment");
		System.out.println("String = "+numberAsString2);
		System.out.println("Number as String= "+num2);
		/*
		String = 2022.234
		Number as String= 2022.234
		After increment
		String = 2022.2341
		Number as String= 2023.234
		 */
		
		//parseInt(String s, int radix): This function parses the string argument as a signed integer 
		//in the radix specified by the second argument.
		//The radix parameter is used to specify which numeral system to be used, 
		//for example, a radix of 16 (hexadecimal) indicates that the number in the string should be parsed from a hexadecimal number to a decimal number. 
		int stringExample = Integer.parseInt("geeks",29);
		System.out.println(stringExample);
	}

}
 