package udemyPractices;

//METHODS
//static Methods

/*
 * • The Java Compiler puts a default call to super() if we don't add it, and it is always the no args super which is inserted by compiler (constructor without arguments). 
• The call to super() must be the first statement in each constructor. 
 * • Even Abstract classes have constructors, although you can never instantiate an abstract class using the new keyword. 
 * An abstract class is still a super class, so its constructors run when someone makes an instance of a concrete subclass.

In static methods we can't use the this keyword. 
Whenever you see a method that does not use instance variables that method should be declared as a static method.
For example main is a static method and it is called by the JVM when it starts an application.

static methods are called as 
ClassName.methodName(); or methodName(); only if in the same class



//Static Method example
class Calculator{
	public static void printSum(int a, int b) {
		System.out.println("sum = " +(a+b));
	}
}
public class StaticVSInstance { //main class
	public static void main(String[] args) {
		Calculator.printSum(5, 10);
		printHello();//shorter form of Main.print Hello();
	}

public static void printHello() {
	System.out.println("hello");
	
	}
}
*/

//Instance Methods
/*
 * Instance methods belong to an instance of a class
 * For using this, we need to instantiate the class first by new keyword.
 * 
 * Instance methods can access
 * 		- instance methods & instance variable directly
 * 		- static methods & static variables directly
 *  
 */

//instance method example

/*
 class Dog{
  	
 		public void bark() {
			System.out.println("woof");
 		}
 }
public class StaticVSInstance { //main class
	public static void main(String[] args) {
		Dog rexDog = new Dog(); //create instance
		rexDog.bark(); //call instance method
	}
}
 */


/*
 * Should a method be static?
 * 		Does it use any fields (instance variables) or instance methods?
 * 				if yes -> instance method
 * 				if no  -> static method
 */

/*
 * Difference Between the static method and instance method
Instance Methods											Static Methods

It requires an object of the class.							It doesn’t require an object of the class.
It can access all attributes of a class.					It can access only the static attribute of a class.
The methods can be accessed only using object reference.	The method is only accessed by class name.
Syntax: Objref.methodname()									Syntax: className.methodname()
It’s an example of pass-by-value programming.				It is an example of pass-by-reference programming.
 
 *
 *Why is the main method in Java static?
 *It’s because calling a static method isn’t needed of the object. 
 *If it were a non-static function, JVM would first build an object before calling the main() method, resulting in an extra memory allocation difficulty.
 *
 *
 *
 *
 *
 *
 *
 */














//VARIABLES
/*Static Variables
 *  keyword "static" is used
 *  aka static member variables
 *  every instance of that class shares the same static variable
 *  if variable got any changes, all the other instances wil see the effect of the change
 *  
 */
/*
//Static variable example
class Dog {
	private static String name;
	public Dog(String name) {
		Dog.name = name;
	}
	public void printName() {
		System.out.println("name = "+name);
	}
}
public class StaticVSInstance { //main class
	public static void main(String[] args) {
		Dog rex = new Dog("rex"); //create instance
		rex.printName();
		Dog fluffy = new Dog("fluffy"); //create instance
		rex.printName();
		fluffy.printName();
		
		//Output
		// * name = rex
		// * name = fluffy
		// * name = fluffy
		 //
		//once static variable is changed, all its instances got the effect
	}
}
*/

/*Instance Variables
 *  keyword "static" is not used
 *  aka fields or member variables
 *  Instance Variables belong to an instance of a class
 *  every instance has it's own copy of an instance variable
 *  Every instancce can have different value(state)
 *  Instance variables represents the state of an instance
 *   
 */

//Instance variable example
class Dog {
	private String name; //no static keyword
	public Dog(String name) {
		this.name = name; //use this
	}
	public void printName() {
		System.out.println("name = "+name);
	}
}
public class StaticVSInstance { //main class
	public static void main(String[] args) {
		Dog rex = new Dog("rex"); //create instance
		rex.printName();
		Dog fluffy = new Dog("fluffy"); //create instance
		rex.printName();
		fluffy.printName();
		
		//Output
			//name = rex
			//name = rex
			//name = fluffy
		
		
	}
}
