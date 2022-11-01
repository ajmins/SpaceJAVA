package udemyPractices.File;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class WriteContentProgram {

	public static void main(String[] args) {

		String fileName = "newfile.txt";
		
		try {
			File fp = new File(fileName);
			if (fp.exists() == false) {
				if (fp.createNewFile()) {
					System.out.println("File Created Successfully");
				}
				else {
					System.out.println("File Creation Failed!!");
				}
			}
			
			//writing data
			String text;
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the text: ");
			text = scanner.nextLine();
			
			//instance of filewriter
			FileWriter  fWriter = new FileWriter(fp.getAbsoluteFile());
			//instance of bufferedReader w.r.t filewriter
			BufferedWriter bReader = new BufferedWriter(fWriter);
			
			//write to file
			bReader.write(text);
			bReader.close();
			
			System.out.println("file saved!");
			
			
		} catch (Exception e) {
			System.out.println("Exception : "+e.toString());
		}

	}

}
