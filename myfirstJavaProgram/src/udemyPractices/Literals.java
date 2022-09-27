package udemyPractices;

public class Literals {
	// Any constant value which can be assigned to the variable is called literal/constant
	//Literals in Java is a synthetic representation of boolean, numeric, character, or string data. 
	//It is a medium of expressing particular values in the program
	
	public static void main(String[] args) {
		//--------INTEGER--------//
		//There are 4 types of integer literals in Java: 
		//binary (base 2) : 0 and 1
		//Literals value should be prefixed with 0b or 0B.
		int x = 0b1111;

		//decimal (base 10) : 0-9
		int x0 = 101;
		
		//octal (base 8) : 0-7
		// The octal number should be prefix with 0.
		int x1 = 0146; 
		
		//hexadecimal (base 16) : 0-9, a-f
		//We can use both uppercase and lowercase characters as we know that java is a case-sensitive programming language, 
		//but here java is not case-sensitive.
		// The hexa-decimal number should be prefix
		// with 0X or 0x.
		int x2 = 0X123Face; 
		
		//By default, every literal is of int type
		
		//--------FLOATING-POINT--------//
		//For Floating-point data types, 
		//we can specify literals in only decimal form, 
		//and we cant specify in octal and Hexadecimal forms. 
		
		//Decimal literals(Base 10): 0-9
		double d = 123.456;
		
		//By default, every floating-point literal is of double type
		
		//--------CHAR--------//
		//There are 4 types of char literal:
		//Single quote : 
		char ch = 'a';
		//Char literal as Integral literal:
		char ch1 = 062;
		//Unicode Representation:
		char ch2 = '\u0061';// Here /u0061 represent a.
		//Escape Sequence
		char ch3 = '\n';

		//--------STRING--------//
		//Any sequence of characters within double quotes is treated as String literals. 
		String s = "Hello";
		
		//String literals may not contain unescaped newline or linefeed characters. 
		//However, the Java compiler will evaluate compile-time expressions, 
		//so the following String expression results in a 
		//string with three lines of text: 
		String text = "This is a String literal\n"
	            + "which spans not one and not two\n"
	            + "but three lines of text.\n";
		System.out.println(text);
		
		
		//--------BOOLEAN--------//
		//Only two values are allowed for Boolean literals, i.e., true and false. 
		boolean b = true;
		//if we write 
		//boolean a = 1; //will throw error becz 1 is an integer
	//note
		//Whenever we are performing addition between a string and integer, 
		//the overall result is converted into a string. 
	
	
	}

}
