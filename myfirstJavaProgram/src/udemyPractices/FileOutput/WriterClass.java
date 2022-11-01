package udemyPractices.FileOutput;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterClass {
	//It is an abstract class for writing to character streams
	//The methods that a subclass must implement are write(char[], int, int), flush(), and close(). 
	//Most subclasses will override some of the methods defined here to provide higher efficiency, functionality or both.
	public static void main(String[] args) {
		
		Writer w;
		try {
			w = new FileWriter("output.txt");
			String content = "My name is Ajmi";
			w.write(content);
			w.close();
			System.out.println("Done");
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
