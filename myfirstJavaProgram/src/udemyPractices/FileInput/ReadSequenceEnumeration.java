package udemyPractices.FileInput;

import java.io.FileInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

/*
 * If we need to read the data from more than two files, we need to use Enumeration.
 * Enumeration object can be obtained by calling elements() method of the Vector class
 */
public class ReadSequenceEnumeration {

	public static void main(String[] args) throws Exception {
		//creating the FileInputStream objects for all the files    
		FileInputStream fin1=new FileInputStream("C:\\Users\\Ajmi\\Desktop\\a.txt");    
		FileInputStream fin2=new FileInputStream("C:\\Users\\Ajmi\\Desktop\\b.txt");    
		FileInputStream fin3=new FileInputStream("C:\\Users\\Ajmi\\Desktop\\c.txt");    
		FileInputStream fin4=new FileInputStream("C:\\Users\\Ajmi\\Desktop\\d.txt");    

		//creating Vector object to all the stream   
		//Vector v = new Vector(); //is also fine
		Vector<FileInputStream> v=new Vector<FileInputStream>();    
		v.add(fin1);    
		v.add(fin2);    
		v.add(fin3);    
		v.add(fin4);   
		
		//creating enumeration object by calling the elements method   
		//Enumeration e = v.element(); //is also fine
		Enumeration<FileInputStream> e=v.elements();   
		
		//passing the enumeration object in the constructor    
		SequenceInputStream sequence =new SequenceInputStream(e);    
		int i=0;      
		while((i=sequence.read())!=-1){    
		System.out.print((char)i);    
		}  
		sequence.close();    
		fin1.close();    
		fin2.close();    
	}

}
