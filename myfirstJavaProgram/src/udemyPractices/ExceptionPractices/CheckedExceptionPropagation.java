package udemyPractices.ExceptionPractices;

import java.io.IOException;

/*
 * while using throws keyword for declaring checked exceptions, 
 * it may now moved to call stack
 * provides information to the caller of the method about the exception.
 */
public class CheckedExceptionPropagation {
	
	void m() throws IOException{
		//checked exception
		throw new IOException("device error"); 
	}
	void n() throws IOException{
		m();
	}
	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("exception handled");
		}
	}

	public static void main(String[] args) {
		
		CheckedExceptionPropagation obj1 = new CheckedExceptionPropagation();
		obj1.p();
		System.out.println("Remaining code");

	}

}
