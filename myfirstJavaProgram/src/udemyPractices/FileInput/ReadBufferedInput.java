package udemyPractices.FileInput;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class ReadBufferedInput {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\Ajmi\\Desktop\\abc.txt");
			BufferedInputStream bin = new BufferedInputStream(fin);
			//int ch = fin.available();
			//System.out.println(ch);l
			System.out.println();
			int i;
			while ((i = bin.read()) != -1) {
				int ch = bin.available();
				System.out.print("Currently Reading:"
                        + (char)i);
				System.out.print(" Remaining character: "
                        + ch);
				System.out.println();
				//System.out.println(bin.read()+" \t "+(char)i);
			}
		
			bin.close();
			fin.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
