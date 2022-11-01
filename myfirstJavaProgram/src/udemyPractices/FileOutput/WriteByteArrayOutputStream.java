package udemyPractices.FileOutput;

import java.io.ByteArrayOutputStream;

import java.io.FileOutputStream;

public class WriteByteArrayOutputStream {
	//to write common data into multiple files
	public static void main(String[] args) throws Exception {

	FileOutputStream fout1 = new FileOutputStream("C:\\Users\\Ajmi\\Desktop\\a.txt");
	FileOutputStream fout2 = new FileOutputStream("C:\\Users\\Ajmi\\Desktop\\b.txt");

	ByteArrayOutputStream bout = new ByteArrayOutputStream();
	bout.write(65);
	bout.writeTo(fout1);
	bout.writeTo(fout2);
	
	bout.flush();
	bout.close();
	System.out.println("Success");
	}

}
