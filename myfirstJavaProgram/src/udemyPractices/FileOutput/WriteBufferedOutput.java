package udemyPractices.FileOutput;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class WriteBufferedOutput {

	public static void main(String[] args) throws Exception {
		  FileOutputStream fout=new FileOutputStream("C:\\Users\\Ajmi\\Desktop\\abc.txt");    
		  BufferedOutputStream bout = new BufferedOutputStream(fout);
		  String str = " Java I/O includes processing input to produce output";
		  byte b[] = str.getBytes();
		  bout.write(b);
		  bout.flush();
		  bout.close();
		  fout.close();
		  System.out.println("Success");
	}

}
