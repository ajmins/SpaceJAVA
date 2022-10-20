package udemyPractices.Collections;


public class Kid implements Comparable<Kid>{  
int rollno;  
String name;  
int age;  
Kid(int rollno,String name,int age){  
	this.rollno=rollno;  
	this.name=name;  
	this.age=age;  
	}  
	  //sort based on age
public int compareTo(Kid st){  
	if(age==st.age)  
		return 0;  
	else if(age>st.age)  
		return 1;  
	else  
		return -1;  
	}  
}  