package myfirstJavaProgram;

public class FinalKeyword {

	//final : cannot be updated later
	public static void main(String[] args) {
		final double PI = 3.14159;
		
		//pi =4; //The final local variable pi cannot be assigned. It must be blank and not using a compound assignment
		
		System.out.println(PI);

	}

}
