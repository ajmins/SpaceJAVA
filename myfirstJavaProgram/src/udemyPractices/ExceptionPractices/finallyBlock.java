package udemyPractices.ExceptionPractices;

public class finallyBlock {

	public static void main(String[] args) {
		//noException();
		//exceptionNotHandled();
		exceptionHandled();

	}

	private static void exceptionHandled() {
	    try {    
	    	  
	        System.out.println("Inside try block");  
	  
	        //below code throws divide by zero exception  
	       int data=25/0;    
	       System.out.println(data);    
	      }   
	  
	      //handles the Arithmetic Exception / Divide by zero exception  
	      catch(ArithmeticException e){  
	        System.out.println("Exception handled");  
	        System.out.println(e);  
	      }   
	  
	      //executes regardless of exception occured or not   
	      finally {  
	        System.out.println("finally block is always executed");  
	      }    
	  
	      System.out.println("rest of the code...");    
		
	}

	private static void exceptionNotHandled() {
		try {    
			  
	        System.out.println("Inside the try block");  
	          
	        //below code throws divide by zero exception  
	       int data=25/0;    
	       System.out.println(data);    
	      }    
	      //cannot handle Arithmetic type exception  
	      //can only accept Null Pointer type exception  
	      catch(NullPointerException e){  
	        System.out.println(e);  
	      }   
	  
	      //executes regardless of exception occured or not   
	      finally {  
	        System.out.println("finally block is always executed");  
	      }    
	  
	      System.out.println("rest of the code...");   
		
	}

	private static void noException() {
		 try{    
			//below code do not throw any exception  
			   int data=25/5;    
			   System.out.println(data);    
			  }    
			//catch won't be executed  
			  catch(NullPointerException e){  
			System.out.println(e);  
			}    
			//executed regardless of exception occurred or not  
			 finally {  
			System.out.println("finally block is always executed");  
			}    
			    
			System.out.println("rest of phe code...");    
		
	}

}
