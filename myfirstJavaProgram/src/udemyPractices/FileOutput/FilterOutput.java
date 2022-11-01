package udemyPractices.FileOutput;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;

public class FilterOutput {

	public static void main(String[] args) throws Exception {
	
	File data = new File("C:\\Users\\Ajmi\\Desktop\\a.txt");  
    
	FileOutputStream file = new FileOutputStream(data);  
    FilterOutputStream filter = new FilterOutputStream(file);  
    
    String s="India is my country..";      
   
    byte b[]=s.getBytes();      
    
    filter.write(b);     
    filter.flush();  
    filter.close();  
    file.close();  
    
    System.out.println("Success...");  
	   
	}

}
