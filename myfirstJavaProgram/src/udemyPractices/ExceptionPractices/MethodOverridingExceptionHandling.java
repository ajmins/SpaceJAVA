package udemyPractices.ExceptionPractices;

import java.io.IOException;

/*
 * Exception handling with Method Overriding in Java
 * " If the superclass method does not declare an exception" 
 * Rule 1: If the superclass method does not declare an exception, 
 * 		   subclass overridden method cannot declare the checked exception.
 * Rule 2: If the superclass method does not declare an exception, 
 * 		   subclass overridden method cannot declare the checked exception 
 * 		   but can declare unchecked exception.
 * 
 */
public class MethodOverridingExceptionHandling extends Parent {

	//overriding the method in the child class
	//gives compile time error
	//Exception IOException is not compatible with throws clause in Parent.msg()	
	//becz here superclass method does not declare checked exception
//	void msg() throws IOException{
//		System.out.println("Test Exception child");
//	}
	
	//but can declare unchecked exceptions
	void msg() throws ArithmeticException{
		System.out.println("Child Method");
	}
	
	public static void main(String[] args) {
		Parent parent = new MethodOverridingExceptionHandling();
		parent.msg();

	}

}
class Parent {
	//defining a method
	void msg() {
		System.out.println("Parent method");
	}
}
