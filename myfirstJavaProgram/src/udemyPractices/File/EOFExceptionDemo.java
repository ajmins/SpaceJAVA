package udemyPractices.File;
import java.io.EOFException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class EOFExceptionDemo {

	public static void main(String[] args) throws Exception {
	     
	      Scanner scanner = new Scanner(System.in);
	      System.out.println("Enter a String: ");
	     
	      String data = scanner.nextLine();
	      byte[] buf = data.getBytes();
	      
	      //Writing it to a file using the DataOutputStream
	      DataOutputStream dos = new DataOutputStream(new FileOutputStream("C:\\Users\\Ajmi\\Desktop\\abc2.txt"));
	      
	      for (byte b:buf) {
	         dos.writeChar(b);
	      }
	     
	      dos.flush();
	      //Reading from the above created file using readChar() method
	      DataInputStream dis = new DataInputStream(new FileInputStream("C:\\Users\\Ajmi\\Desktop\\abc2.txt"));
	      while(true) {
	         char ch;
	         try {
	            ch = dis.readChar();
	            System.out.print(ch);
	         } catch (EOFException e) {
	            System.out.println("");
	            System.out.println("End of file reached");
	            break;
	         } 
	      }
	}
}
