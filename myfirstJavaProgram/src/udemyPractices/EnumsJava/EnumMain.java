package udemyPractices.EnumsJava;
import java.lang.*;
public class EnumMain {
/*
 *  an enum (short for enumeration) is a type that has a fixed set of constant values. 
 *  We use the enum keyword to declare enums.
 *  values inside the braces are called enum constants (values).
 *  The enum constants are usually represented in uppercase.
 */
	enum Size { 
		   SMALL, MEDIUM, LARGE, EXTRALARGE 
		   //When we create an enum class, the compiler will create instances (objects) of each enum constants. 
		   //Also, all enum constant is always public static final by default.
		
	//It is guaranteed that the variable will hold one of the four values.
	// enum was introduced to replace the use of int constants.
	
	
	
	}
	public static void main(String[] args) {
		System.out.println(Size.SMALL);
	    System.out.println(Size.MEDIUM);

	    //we can create variables of enum types
	    Size pizzaSize;
	    //pizzaSize is a variable of the Size type. 
	    //It can only be assigned with 4 values.
	    pizzaSize = Size.SMALL;
	    pizzaSize = Size.MEDIUM;
	    pizzaSize = Size.LARGE;
	    pizzaSize = Size.EXTRALARGE;
	    
	    //The ordinal() method returns the position of an enum constant.
	    System.out.println(Size.SMALL.ordinal());
	    //The compareTo() method compares the enum constants based on their ordinal value. 
	    System.out.println(Size.SMALL.compareTo(Size.MEDIUM)); //ordinal(small)-ordinal(medium) = 0-1=-1
	    //The toString() method returns the string representation of the enum constants.
	    System.out.println(Size.SMALL.toString()); //ordinal(small)-ordinal(medium) = 0-1=-1
	    //The name() method returns the defined name of an enum constant in string form. 
	    //The returned value from the name() method is final
	    System.out.println(Size.SMALL.name());
	    //The valueOf() method takes a string and returns an enum constant having the same string name
	    Size value;
	    value = Size.valueOf("MEDIUM");
	    System.out.println(value);
	    System.out.println(Size.valueOf("SMALL"));
	    //The values() method returns an array of enum type containing all the enum constants.
	    Size[] enumArray = Size.values();
	    for (Size size : enumArray) {
			System.out.println(size);
		}
	    
	
	
	
	
	
	}


}
