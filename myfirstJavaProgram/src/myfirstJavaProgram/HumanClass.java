package myfirstJavaProgram;
//main class as ConstructorMain

public class HumanClass {
	//constructor method is called when an instance of an class is created
	
	String name;
	int age;
	double weight;
	
	//create a constructor which has the same name as class
	HumanClass(String name, int age, double weight){
		//these arguments are need to be passed into the main class instance
		
		//using this constructor we can create two different objects 
		
		//this keyword is get replaced by the object name in the main class
		//if this keyword is not used, then if we call the name attribute with some instance, will get null value
		//The this keyword refers to the current object in a method or constructor.
		//To eliminate the confusion between class attributes and parameters with the same name
		//for a human, human.name = name , for next human human2.name = name in general "this" is used
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	//Human class methods
	void eat() {
		System.out.println(this.name+" is eating");
	}
	
	void drink() {
		System.out.println(this.name+" is drinking...");
	}

}
