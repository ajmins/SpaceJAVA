package udemyPractices.DeepVsShallowCopy;

public class StringCopyMain {

	public static void main(String[] args) {
		// an object of the String class is created  
		String obj1 = new String("JavaTpoint is a very good site.");  
		  
		// copying obj1 to obj2  
		String obj2 = obj1;  
		
		
		//before assigning value to scnd object
		System.out.println("Before assigning value to 2nd object");
		System.out.println("The hash code is: " + obj1.hashCode());  
		System.out.println("The hash code is: " + obj2.hashCode());  
		
		
		// we have updated the string for reference variable obj2  
		obj2 = "JavaTpoint is very good.";  
		
		//after assigning value to scnd object
		System.out.println("\nAfter assigning value to 2nd object");

		// printing the hash code using the reference variable obj1.  
		System.out.println("The hash code is: " + obj1.hashCode());  
		// printing the string  
		System.out.println("The string is: " + obj1 + "\n");  
		  
		  
		// printing the hash code using the reference variable obj2.  
		System.out.println("The hash code is: " + obj2.hashCode());  
		// printing the string  
		System.out.println("The string is: " + obj2);  
		}  
	

}
