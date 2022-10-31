package udemyPractices.ExceptionPractices;

public class ExceptionPropagation {

	void m() {
		//here the exception occurs
		//nut not handled
		int data = 50 /0 ;
		
		//if checked error like IOException, then may cause error becz they're not propagated in chains
		//throw new java.io.IOException("device error");
	}
	void n() {
		//call the exception occured function
		//but here also not handled
		m();
	}
	void p() {
		//calls above function
		//and exception is handled here. 
		try {
			n();
		} catch (Exception e) {
			System.out.println("Exception handled!");
		}
	}
	
	public static void main(String[] args) {
		ExceptionPropagation ob1 = new ExceptionPropagation();
		ob1.p();
		System.out.println("Remaining code");

	}

}
