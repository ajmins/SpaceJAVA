package udemyPractices.FileInput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class ReadSequenceInput {

	public static void main(String[] args) throws Exception {
		
		FileInputStream input1 = new FileInputStream("C:\\Users\\Ajmi\\Desktop\\abc.txt");
		FileInputStream input2 = new FileInputStream("C:\\Users\\Ajmi\\Desktop\\abc2.txt");
		
		
		FileOutputStream fOutputStream = new FileOutputStream("C:\\Users\\Ajmi\\Desktop\\output.txt");
		
		SequenceInputStream instance = new SequenceInputStream(input1,input2);
		
	
		//printing to another file
		printTofile(fOutputStream,instance);
		
		
		//printing into console
		printConsole(instance);
				
		
		fOutputStream.close();
		instance.close();
		input2.close();
		input1.close();
	}

	private static void printTofile(FileOutputStream fOutputStream, SequenceInputStream instance) throws IOException {
		int j;
		while ((j = instance.read()) != -1) {
			fOutputStream.write(j);
		}
		
	}

	private static void printConsole(SequenceInputStream instance) throws IOException {
		int j;
		while ((j = instance.read()) != -1) {
			System.out.print((char)j);
		}
		
	}



}
