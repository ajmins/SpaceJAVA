package udemyPractices.FileOutput;

import java.io.FileWriter;

public class FileWriterClass {
/*
 * Java FileWriter class is used to write character-oriented data to a file. 
 * 		It is character-oriented class which is used for file handling in java.
 * 
 * Unlike FileOutputStream class, you don't need to convert string into byte array
 *  	because it provides method to write string directly.
 */
	public static void main(String[] args) {
		try {
			FileWriter fW = new FileWriter("C:\\Users\\Ajmi\\Desktop\\abc2.txt");
					fW.write("Johny Johny Yes Papa");
					fW.close();
		
		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("File opened");
		}

	}

}
