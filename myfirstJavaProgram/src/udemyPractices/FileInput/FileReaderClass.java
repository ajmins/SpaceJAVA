package udemyPractices.FileInput;

import java.io.FileReader;

public class FileReaderClass {
	//Java FileReader class is used to read data from the file. 
	//It returns data in byte format like FileInputStream class.
	//It is character-oriented class which is used for file handling in java
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("C:\\Users\\Ajmi\\Desktop\\abc2.txt");
		int i;
		while ((i = fr.read()) != -1) {
			System.out.print((char)i);
			
		}
		fr.close();
	}

}
