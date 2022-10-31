package udemyPractices.ExceptionPractices;


public class Example1 {

	public static void main(String[] args) {
		
		try {
			//here the code that may arise exception
			int data = 100/0;
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		//rest of the code
		System.out.println("The core advantage of exception handling is to maintain the normal flow of the application.\n"
				+ "An exception normally disrupts the normal flow of the application; that is why we need to handle exceptions.");
		arithMetic();
		nullPointer();
		numberFormatt();
		indexOutOfBound();

	}

	//common scenarios
	private static void indexOutOfBound() {
		System.out.println("\"ArrayIndexOutOfBoundsException\"\n"
				+ "When an array exceeds to it's size, this exception occurs. "
				+ "there may be other reasons to occur ArrayIndexOutOfBoundsException.");
		try {
			int a[]=new int[5];  
			a[10]=50;
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	private static void numberFormatt() {
		System.out.println("\"NumberFormatException\"\n"
				+ "If the formatting of any variable or number is mismatched, it may result into NumberFormatException. Suppose we have a string\r\n"
				+ "variable that has characters; converting this variable into digit will cause NumberFormatException.");
		try {
			String s="abc";  
			int i=Integer.parseInt(s);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private static void nullPointer() {
		System.out.println("\"Null Point Exception\"\n"
				+ "If we have a null value in any variable\r\n"
				+ ", performing any operation on the variable throws a NullPointerException.");
		try {
			String s = null;
			System.out.println(s.length());
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	private static void arithMetic() {
		System.out.println("\"Arithmetic Exception\"\n"
				+ " If we divide any number by zero, there occurs an ArithmeticException.");
		try {
			int data = 100/0;
		} catch (Exception e) { //we can also specify Arithmetic Exception also
			System.out.println(e);
		}
	}
	
	
	

}
