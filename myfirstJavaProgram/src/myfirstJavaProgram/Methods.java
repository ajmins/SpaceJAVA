package myfirstJavaProgram;

public class Methods {
	//method =  block of code executed whenever it is called upon
	
	public static void main(String[] args) {
		String name = "Ajmi";
		int age =  22;
		hello(); 
		//Cannot make a static reference to the non-static method hello() from the type Methods
		// so for that add static to method definition
		helloName(name, age);
	}
	
	//create a method called hello
	static void hello() {
		System.out.println("Hello");
	}
	
	//passing an argument
	static void helloName(String nameOf, int age) {
		System.out.println("Hello "+ nameOf);
		System.out.println("You are "+ age);
	}

}
