package udemyPractices;


/*
 * If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.
 * In other words, If a subclass provides the specific implementation of the method that has been declared by one of its parent class, it is known as method overriding.
 */


//Java Program to illustrate the use of Java Method Overriding  

	//Creating a parent class.  
	class Vehicle{  
		
	  //defining a method  
	  void run(){
		  System.out.println("Vehicle is running");
	  }  
	}  


//Creating a child class  
public class MethodOverriding extends Vehicle {

	  //defining the same method as in the parent class  
	  void run(){
		  System.out.println("Bike is running safely");
		  }  
	  
	  public static void main(String args[]){
		  
		  MethodOverriding obj = new MethodOverriding();//creating object  
	  obj.run();//calling method  
	  }  
	}  
	

/*
 * Can we override static method?
No, a static method cannot be overridden. 
It can be proved by runtime polymorphism, so we will learn it later.

Why can we not override static method?
It is because the static method is bound with class whereas instance method is bound with an object. 
Static belongs to the class area, and an instance belongs to the heap area.
 */
	



