package myfirstJavaProgram;

public class PizzaClass {
	
	String bread;
	String cheese;
	String sause;
	String topping;
	
	PizzaClass(String bread,String cheese,String sause, String topping){

		//this keyword refers to the current object in a method or constructor.
		//to eliminate the confusion between class attributes and parameters with the same name
		this.bread =  bread;
		this.cheese =  cheese;
		this.sause =  sause;
		this.topping =  topping;
	}
	//constructor 2
	//constructor overloading: same name but different number of attributes
	
	PizzaClass(String bread,String cheese,String sause){

		this.bread =  bread;
		this.cheese =  cheese;
		this.sause =  sause;
	}
	
	//constructor 3
	PizzaClass(){
	}
	
}
