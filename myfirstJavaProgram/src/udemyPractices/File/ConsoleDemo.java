package udemyPractices.File;
import java.io.Console; 
public class ConsoleDemo {

	public static void main(String[] args) throws Exception {

	Console c=System.console();
	//c = java.io.Console@681a9515;
	  if(c == null) 
      {
          System.out.print("No console available");
          return;
      }
	//System.out.println("Welcome "+c); 
	System.out.println("Enter your name: ");    
	String n=c.readLine();    
	System.out.println("Welcome "+n); 
	System.out.println("Enter password: ");    
	char[] ch=c.readPassword();    
	String pass=String.valueOf(ch);//converting char array into string    
	System.out.println("Password is: "+pass);    
	
	}

}
