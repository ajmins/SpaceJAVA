package udemyPractices.Serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//If a class has a reference to another class, all the references must be Serializable otherwise serialization process will not be performed. 
//In such case, NotSerializableException is thrown at runtime.

public class SerializeHASA implements Serializable {

	int id;  
	 String name;  
	 Address address;//HAS-A  
	 public void Student(int id, String name) {  
	  this.id = id;  
	  this.name = name;  
	 }  
	public static void main(String[] args) {
		Address ad = new Address("King lane", "Tvm", "KL");
		//check whether the address class is serializable or not
		if(ad instanceof Serializable){
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		//Checking the serializability Employee class
		Employee emp = new Employee(10, "Anu");
		if (emp instanceof Serializable) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		//but when we try to serialize the objects, string company wont be serialized
		//serialze
		try {
			//Creating stream and writing the object    
			  FileOutputStream fout=new FileOutputStream("f.txt");    
			  ObjectOutputStream out=new ObjectOutputStream(fout);    
			  out.writeObject(emp);    
			  out.flush();    
			  
			  //closing the stream    
			  out.close();    
			  
			  System.out.println("success");   
		} catch (Exception e) {
			System.out.println(e);
		}
		//deserialize
		 try{    
		    	
			  //Creating stream to read the object    
			  ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));    
			  Employee emp1=(Employee)in.readObject(); 
			  
			  //printing the data of the serialized object    
			  System.out.println(emp1.id+" "+emp1.name+" "+emp1.company); 
			  
			  //closing the stream    
			  in.close();    
			  }
		    catch(Exception e){
		    	System.out.println(e);
		    	}    
	}
}

//Since Address is not Serializable, you cannot serialize the instance of the SerializeHASA class.
//: All the objects within an object must be Serializable.
class Address{    
	 String addressLine,city,state;    
	 public Address(String addressLine, String city, String state) {    
		  this.addressLine=addressLine;    
		  this.city=city;    
		  this.state=state;    
	 	}    
	}  

//If there is any static data member in a class, it will not be serialized because static is the part of class not object.
class Employee implements Serializable{  
	 int id;  
	 String name;  
	 static String company="SSS IT Pvt Ltd";//it won't be serialized  
	 public Employee(int id, String name) {  
		  this.id = id;  
		  this.name = name;  
	 }  
	}  