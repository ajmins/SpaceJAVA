package udemyPractices.DeepVsShallowCopy;

public class IntegerCopyMain {

	public static void main(String[] args) {
		int x = 9;  
		int y = x;  
		  
		System.out.println("The value of x & y are: " + x + ", " + y);  //9,9
		  
		// updating the value of y  
		y = 10;  
		  
		System.out.println("The value of x & y are: " + x + ", " + y);  //9,10
		  
		boolean b1 = false;  
		  
		// copying the value of b1 in b2  
		boolean b2 = b1;  
		  
		System.out.println("The value of b1 & b2 are: " + b1 + ", " + b2);  //f,f
		  
		// updating the value of b2  
		b2 = true;  
		System.out.println("The value of b1 & b2 are: " + b1 + ", " + b2);  //f,t
		  
		}  


}
