package myfirstJavaProgram;

public class OverloadedMethods {

	//overloaded methods =  methods that share the same name but have different parameter
	//						method name + parameters =  method signature
	
	/*
	 * println method is a great example of method overloading in java
	 * there are 10 methods with the name println
	 * can print intger, double, string etc
	 * 
	 * it imroves code readability and reusability and flexibility
	 * acheives consistency in naming
	 */
	
	
	public static void main(String[] args) {
		
		//int x = add(1,2);
		//int x = add(1,2,3);
		//int x = add(1,2,3,4);
		
		//double x = add(1.4,2.9);
		//double x = add(1.4,2.9,3.7);
		double x = add(1.4,2.9,3.7,4.3);
		System.out.println(x);

	}
	
	static int add(int a, int b) {
		System.out.println("This is overloaded method #1");
		return a + b;
	}
	
	static int add(int a, int b, int c) {
		System.out.println("This is overloaded method #2");
		return a + b + c ;
	}
	
	static int add(int a, int b, int c, int d) {
		System.out.println("This is overloaded method #3");
		return a + b + c +d ;
	}
	
	static double add(double a, double b) {
		System.out.println("This is overloaded method #4");
		return a + b;
	}
	
	static double add(double a, double b, double c) {
		System.out.println("This is overloaded method #5");
		return a + b + c ;
	}
	
	static double add(double a, double b, double c, double d) {
		System.out.println("This is overloaded method #6");
		return a + b + c +d ;
	}
}
