package udemyPractices.ExceptionPractices;


/*
 * Exception handling with Method Overriding in Java
 * "If the superclass method declares an exception"
 * Rule 1: If the superclass method declares an exception, 
 * 		   subclass overridden method can declare the same subclass exception 
 * 		   or no exception but cannot declare parent exception. 
 */
public class MethodOverridingExceptionHandling2 extends Parent2 {

	//here we cannot use Exception becz parent class has declared its subexception
//	void msg() throws Exception{
//		System.out.println("Child Method");
//	}
	
	//if we declare same exception as parent does then it's okay
	void msg() throws ArithmeticException{
	System.out.println("Child2 Method");
}
	//or if declare subclass exception of parent class is also fine
	void msg2() throws ArithmeticException{
	System.out.println("Child2 second Method");
}
	//if subclass overridden method declares no exception
	void msg3(){
	System.out.println("Child2 third Method");
}
	
	public static void main(String[] args) {
		Parent2 parent = new MethodOverridingExceptionHandling2();
		try {
			//parent.msg();
			parent.msg2();
			parent.msg3();
		} catch (Exception e) {
			
		}

	}

}
class Parent2{  
	  void msg()throws ArithmeticException {  
	    System.out.println("parent2 method");  
	  } 
	  void msg2()throws Exception {  
		    System.out.println("parent2 second method");  
	  } 
	  void msg3()throws Exception {  
		    System.out.println("parent2 third method");  
	  } 
	}  
