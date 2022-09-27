/**
 * 
 */
package myfirstJavaProgram;

/**
 * @author Ajmi
 *
 */
public class ExpressionsAndOperators {


	public static void main(String[] args) {
		// expression = operands & operators
		// operands = values, variables, numbers, quantity
		// operators = + - * / %

		//Operators in java are special symbols that perform specific operations in one, two or 3 operands and return result.
		//Operand : to describe any object that is manipulated by an operator.
		//			Variable used instead of literals are also operands
		
		double a = 19;
		double b = 20;
		double sum, diff, prod, quot,rem;
		sum = 19 + 20;
		diff = 19 - 20;
		prod = 19 * 20;
		quot = 19 / 20;
		rem = 19 % 20;
		System.out.println("sum: "+sum + "\ndiff: "+diff  + "\nproduct: "+prod +"\nquotient: "+quot +"\nremainder: "+rem );
		
		//Expressions
		
		double friends = 10; //expression

		friends = friends + 1; //expression
		friends++;
		friends = (double) friends / 9;
		System.out.println(friends);

		if(friends > 9) { //parts inside brackets also expression
			System.out.println("You have lot of friends"); //parts inside brackets within "" also expression
		}
		
		
		//Assignment and Equal 
		//= for assignment, == is for equal
		//but consider the situation
		boolean isCar =  false;
		if(isCar = true) {
			System.out.println("This is not equality checking but changed to just printing a statement");
			
		}
		
		boolean isCar1 =  false;
		if(!isCar1) {
			System.out.println("Another check statement");
			
		}
		//TERENARY OPERATOR
		//it's a shortcut for if-then-else statemnt
		boolean wasCar = isCar ? true : false;
		System.out.println(wasCar);
		
		//it's good to use paranthesiss for more readability
		int ageOfClient = 20;
		boolean isEighteenOrOver = (ageOfClient==20)?true:false;
		System.out.println(isEighteenOrOver);
		
		//Operator Precedence
		/* 
			Parentheses ()
			Array subscript []
			Member selection .
			----------------------
			Unary Operations
			------------------------
			Multiplication *
			Divvision /
			Modulus %
			------------------------
			Addition +
			Subtraction -
			---------------------
			Bitwise operations
			-----------------
			Relational -> <, <= , >, >=
			-------------------------------
			Relational -> ==, !=
			------------------------------
			Bitwise &
			-------------------------------
			Bitwise EXOR ^
			--------------------
			Bitwise |
			---------------------
			Logical &&
			------------------------
			Logical ||
			-----------------------------
			Ternary Conditional ? :
			-------------------------
			Assignement -> =, +=, -=, *=, /=, %=
			------------------------------------
			
			Right to left associativity: Unary and Assignemnt Operations



		 */
		
	
		
		
	}

}
