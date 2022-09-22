package myfirstJavaProgram;

public class ReturnMethod {
	//method =  block of code executed whenever it is called upon
	public static void main(String[] args) {
		int x = 3;
		int y = 4;
		
		int result = add(x,y);
		System.out.println("sum of "+ x + " and " + y + " is "+ result);

		//another method
		System.out.println("sum of "+ x + " and " + y + " is "+ sum(x,y));

	}
	
	//return type
	static int add(int a, int b) {
		
		int z = a + b;
		return z;
	}
	
	//another method
	static int sum(int a, int b) {
		
		return a + b;
	}

}
