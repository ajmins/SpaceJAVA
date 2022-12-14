package myfirstJavaProgram;
public class WrapperClass {
	//wrapper class = provide a way to use primitive data types as reference data types 
	//reference data types contain useful methods can be used with collections(eg:arrayList)
	//(only reference data type is string )
	
	//primitive is much faster than reference data types
	//primitive	//wrapper
	//boolean	Boolean
	//char		Character
	//int		Integer
	//double	Double
	
	//auto-boxing = automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes
	//un-boxing = the reverse of auto-boxing. Automatic conversion of wrapper class to primitive
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//auto-boxing
		Boolean a = true;
		Character b = '@';
		Integer c = 122;
		Double d = 3.13;
		String e = "Ajmi";
		
		//since a is a reference data type but still behave as a primitive data type because of the un-boxing feature
		if(a == true) {
			System.out.println("This is true");
		}
	}
	/*
	 * Need of Wrapper Classes
	 * They convert primitive data types into objects. 
	 * Objects are needed if we wish to modify the arguments passed into a method (because primitive types are passed by value).
	 * The classes in java.util package handles only objects and hence wrapper classes help in this case also.
	 * Data structures in the Collection framework, such as ArrayList and Vector, store only objects (reference types) and not primitive types.
	 * An object is needed to support synchronization in multithreading.
	
		Memory management
	 * In Java, all data type for primitive type variables is stored on the stack.
	 * For reference data types, the stack holds a pointer to the object on the heap. 
	 * When setting a reference type variable equal to another reference type variable, a copy of only the pointer is made.
	 */

}
