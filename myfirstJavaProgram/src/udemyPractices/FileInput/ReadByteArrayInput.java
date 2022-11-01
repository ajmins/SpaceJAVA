package udemyPractices.FileInput;

import java.io.ByteArrayInputStream;

public class ReadByteArrayInput {
	//it can be used to read byte array as input stream.
	//contains an internal buffer which is used to read byte array as stream. 
	//In this stream, the data is read from a byte array.
	//The buffer of ByteArrayInputStream automatically grows according to data.

	public static void main(String[] args) {
		byte[] buffer = {35,36,37,38};
		
		//create new byte array input stream
		ByteArrayInputStream bin = new ByteArrayInputStream(buffer);
		int k = 0;
		while ((k = bin.read()) != -1) {
			//coversion of a byte into character
			char ch = (char) k;
			System.out.println("ASCII value of Character is: "+k+"; Special charcater is: "+ch);
		}

	}

}
