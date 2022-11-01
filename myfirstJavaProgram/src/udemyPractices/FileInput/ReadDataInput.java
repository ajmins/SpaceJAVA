package udemyPractices.FileInput;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class ReadDataInput {

	public static void main(String[] args) throws Exception {
		InputStream input = new FileInputStream("C:\\Users\\Ajmi\\Desktop\\c.txt");
		DataInputStream data = new DataInputStream(input);
		
		int count = input.available();
		byte[] array = new byte[count];
		data.read(array);
		for (byte b : array) {
			char k = (char) b;
			System.out.print(k+ "-");
		}
	}

}
