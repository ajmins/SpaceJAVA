package udemyPractices.FileInput;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilterInputStream;

public class FilterInput {

	public static void main(String[] args) throws Exception {
	
	File data = new File("C:\\Users\\Ajmi\\Desktop\\a.txt");  
    
	FileInputStream  file = new FileInputStream(data);  
    FilterInputStream filter = new BufferedInputStream(file);  
    
    int k =0;  
  
    while((k=filter.read())!=-1){  
        System.out.print((char)k);  
    }  
   
    file.close();  
    filter.close();  

	}

}
