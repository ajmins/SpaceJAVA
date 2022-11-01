package udemyPractices.FileInput;

import java.io.FileReader;
import java.io.Reader;

public class ReaderClass {
	//Java Reader is an abstract class for reading character streams.
	//The only methods that a subclass must implement are read(char[], int, int) and close(). 
	//Most subclasses, however, will override some of the methods to provide higher efficiency, additional functionality, or both.
	
	public static void main(String[] args) {
		try {
			Reader reader = new FileReader("output.txt");
			int data = reader.read();
			while (data != -1) {
				System.out.print((char)data );
				data = reader.read();
			}
			reader.close();
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
