package udemyPractices.FileInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//connecting the BufferedReader stream with the InputStreamReader stream 
//for reading the line by line data from the keyboard.
public class BufferedReaderFromConsole {

	public static void main(String[] args) throws Exception {
		InputStreamReader r=new InputStreamReader(System.in); 
		BufferedReader br=new BufferedReader(r);   
		
	//	singleInput(r, br);
		multipleInputs(r, br);
		
		 
	}

	

	private static void multipleInputs(InputStreamReader r, BufferedReader br) throws Exception {
		String name="";    
		while(!name.equals("stop")){    
			System.out.println("Enter data: ");    
		    name=br.readLine();    
		    System.out.println("data is: "+name);    
		
		}
		System.out.println("Stopped!");
	}


	private static void singleInput(InputStreamReader r, BufferedReader br) throws Exception {        
		
	    System.out.println("Enter your name");    
	    String name=br.readLine();    
	    System.out.println("Welcome "+name); 
		
	}

}
