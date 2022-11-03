package udemyPractices.File;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharArrayReaderClass {

	public static void main(String[] args) throws IOException {

		readerDemo();
		writerDemo();
	}

	private static void writerDemo() throws IOException {
		//The CharArrayWriter class can be used to write common data to multiple files. 
		//This class inherits Writerclass. 
		//Its buffer automatically grows when data is written in this stream. 
		//Calling the close() method on this object has no effect.
		
		CharArrayWriter writer = new CharArrayWriter();
		writer.write("This file shows an example of CharArrayClass");
		FileWriter f1 = new FileWriter("a1.txt");
		FileWriter f2 = new FileWriter("a2.txt");
		FileWriter f3 = new FileWriter("a3.txt");
		FileWriter f4 = new FileWriter("a4.txt");
		
		writer.writeTo(f1);
		writer.writeTo(f2);
		writer.writeTo(f3);
		writer.writeTo(f4);
		
		f1.close();
		f2.close();
		f3.close();
		f4.close();
		System.out.println("Success");
		
	}

	private static void readerDemo() throws IOException {
		//The CharArrayReader is composed of two words: CharArray and Reader. 
		//The CharArrayReader class is used to read character array as a reader (stream). 
		//It inherits Reader class.
		
		char[] charas = {'a','b','c','d','e'};
		CharArrayReader reader = new CharArrayReader(charas);
		int k = 0;
		
		while ((k = reader.read()) != -1) {
			char ch = (char)k;
			System.out.println(ch+" : "+k);
		}
		
	}

}
