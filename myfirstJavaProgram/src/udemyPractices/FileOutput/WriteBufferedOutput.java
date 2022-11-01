package udemyPractices.FileOutput;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteBufferedOutput {

	public static void main(String[] args) throws Exception {
		
		//singleWrite();
		//multipleWrite();
		multipleWriteDesiredWay();
		
		  
	}

	private static void multipleWriteDesiredWay() {
		try {
		    // create a writer
		    FileOutputStream fos = new FileOutputStream(new File("output.dat"));
		    BufferedOutputStream writer = new BufferedOutputStream(fos);

		    // write data to file
		    writer.write("Hey, there!".getBytes());
		    writer.write("\n".getBytes());
		    writer.write("How are you doing?".getBytes());

		    // flush remaining bytes
		    writer.flush();
		    
		    // close the writer
		    writer.close();
		    System.out.println("Success");

		} catch (IOException ex) {
		    ex.printStackTrace();
		}
		
	}

	private static void multipleWrite() {
		try {
		    // create a writer
		    FileOutputStream fos = new FileOutputStream(new File("output.dat"));

		    // write data to file
		    fos.write("Hey, there!".getBytes());
		    fos.write("\n".getBytes());
		    fos.write("How are you doing?".getBytes());

		    // close the writer
		    fos.close();
		    System.out.println("Success");

		} catch (IOException ex) {
		    ex.printStackTrace();
		}
		
	}
	private static void singleWrite() throws Exception {
		
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
