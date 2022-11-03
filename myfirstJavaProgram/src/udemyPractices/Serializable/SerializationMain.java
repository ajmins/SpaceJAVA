package udemyPractices.Serializable;
import java.io.*;    

/*
 * If you want a class object to be serializable, all you need to do it implement the java.io.Serializable interface. 
 * Serializable in java is a marker interface and has no fields or methods to implement.
 * It is used to "mark" Java classes so that the objects of these classes may get a certain capability.
 * The Serializable interface must be implemented by the class whose object needs to be persisted.
 * The String class and all the wrapper classes implement the java.io.Serializable interface by default. 
 * Serialization in java is implemented by ObjectInputStream and ObjectOutputStream, so all we need is a wrapper over them to either save it to file or send it over the network. 
 */
public class SerializationMain {

	public static void main(String[] args) {
	  try{    
		  //Creating the object    
		  Student s1 =new Student(211,"Ajmi"); 
		  
		  //Creating stream and writing the object    
		  FileOutputStream fout=new FileOutputStream("f.txt");    
		  ObjectOutputStream out=new ObjectOutputStream(fout);    
		  out.writeObject(s1);    
		  out.flush();    
		  
		  //closing the stream    
		  out.close();    
		  
		  System.out.println("success");    
		  }
	  	  
	  catch(Exception e){
		  System.out.println(e);
		  }    
	}    

}
