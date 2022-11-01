package udemyPractices.FileInput;

import java.io.BufferedReader;
import java.io.FileReader;

//Java BufferedReader class is used to read the text from a character-based input stream. 
//It can be used to read data line by line by readLine() method. 
//It makes the performance fast. 
//It inherits Reader class.
public class BufferedReaderClass {

	public static void main(String[] args) throws Exception {
		FileReader fr=new FileReader("C:\\Users\\Ajmi\\Desktop\\abc2.txt");   
        BufferedReader br=new BufferedReader(fr);    

        int i;    
        while((i=br.read())!=-1){  
        System.out.print((char)i);  
        }  
        br.close();    
        fr.close();    

	}

}
