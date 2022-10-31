package udemyPractices.ExceptionPractices;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
/*
 * If we throw a checked exception using throw keyword, 
 * it is must to handle the exception using catch block 
 * or the method must declare it using throws declaration.
 */
public class ThrowChecked {

	//function
	public static void method() throws FileNotFoundException{
		FileReader file = new FileReader("C:\\Users\\Ajmi\\Desktop\\abc.txt");
		BufferedReader fileInput = new BufferedReader(file);
		
		throw new FileNotFoundException();
	}
	
	
	public static void main(String[] args) {
		try {
			method();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Remianing code");

	}

}
