package udemyPractices.Serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TransientDemo {

	
	public static void main(String[] args) {
		//serialize
		try {
			StudentList s1 =new StudentList(211,"Ajmi",22);//creating object    
			  //writing object into file    
			  FileOutputStream f=new FileOutputStream("f.txt");    
			  ObjectOutputStream out=new ObjectOutputStream(f);    
			  out.writeObject(s1);    
			  out.flush();    
			  out.close();    
			  f.close();    
			  System.out.println("serialization success");
		} catch (Exception e) {
			System.out.println(e);
		}
		
		//deserialize
		try {
			ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));    
			StudentList s=(StudentList)in.readObject();    
			System.out.println(s.id+" "+s.name+" "+s.age);    
			in.close();
			System.out.println("de-serialization success");

		} catch (Exception e) {
			System.out.println(e);
		}	  

	}

}
class StudentList implements Serializable{    
	 int id;    
	 String name;    
	 transient int age;//Now it will not be serialized and get default value of int as 0 
	 public StudentList(int id, String name,int age) {    
		  this.id = id;    
		  this.name = name;    
		  this.age=age;    
	 }    
	}    