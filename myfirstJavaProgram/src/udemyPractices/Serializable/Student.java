package udemyPractices.Serializable;

import java.io.Serializable;  
//Student class implements Serializable interface. 
//Now its objects can be converted into stream.
public class Student implements Serializable{  
	int id;  
	String name;  
	
	public Student(int id, String name) {  
		this.id = id;  
		this.name = name;  
 }  
}  