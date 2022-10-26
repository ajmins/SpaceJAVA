package udemyPractices.ExceptionPractices;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Example2 {

	public static void main(String[] args) {
	   // wrongExceptionReference();
	   // exceptionInCatchBlock();
	    //unchecked();
	    checked();
	}

	private static void checked() {
		PrintWriter pw;  
        try {  
            pw = new PrintWriter("jtp.txt"); //may throw exception   
            pw.println("saved");  
        }  
        catch (FileNotFoundException e) {  
            
            System.out.println(e);  
        }         
    System.out.println("File saved successfully");  
	}

	private static void unchecked() {
	     try  
	        {  
	        int arr[]= {1,3,5,7};  
	        System.out.println(arr[10]); //may throw exception   
	        }  
	     catch(ArrayIndexOutOfBoundsException e)  
	        {  
	            System.out.println(e);  
	        }  
	        System.out.println("rest of the code");  
	}

	private static void exceptionInCatchBlock() {
	    try{  
	    	int data1=50/0; //may throw exception 
        }  	
	    catch(Exception e){  
            // generating the exception in catch block  
	    	int data2=50/0; //may throw exception 
        }  
    System.out.println("rest of the code");  
	}

	private static void wrongExceptionReference() {
		 try{  
		        int data=50/0; //may throw exception Arithmetic 
		        }  
		catch(ArrayIndexOutOfBoundsException e){  
		        System.out.println(e);  
		        }  
		 System.out.println("rest of the code");  
		        // if we handle the generated exception (Arithmetic Exception) with a 
		        //different type of exception class (ArrayIndexOutOfBoundsException)
		
	}

}
