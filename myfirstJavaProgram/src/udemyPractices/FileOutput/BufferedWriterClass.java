package udemyPractices.FileOutput;

import java.io.BufferedWriter;
import java.io.FileWriter;

//Java BufferedWriter class is used to provide buffering for Writer instances. 
//It makes the performance fast. 
//It inherits Writer class. 
//The buffering characters are used for providing the efficient writing of single arrays, characters, and strings.
//
public class BufferedWriterClass {

	public static void main(String[] args) throws Exception {
		
	FileWriter writer = new FileWriter("C:\\Users\\Ajmi\\Desktop\\abc2.txt");  
    
	BufferedWriter buffer = new BufferedWriter(writer);  
   
	buffer.write("Buffered Write class inherits writer Class");  
    buffer.close();  
   
    System.out.println("Success");  

	}

}
