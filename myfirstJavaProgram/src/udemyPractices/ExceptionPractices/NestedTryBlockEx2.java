package udemyPractices.ExceptionPractices;
/*
 * Here the try block within nested try block (inner try block 2) do not handle the exception. 
 * The control is then transferred to its parent try block (inner try block 1). 
 * If it does not handle the exception, then the control is transferred to the main try block (outer try block) where the appropriate catch block handles the exception. 
 * It is termed as nesting.
 */
public class NestedTryBlockEx2 {

	public static void main(String[] args) {
    // outer (main) try block  
    try {  
    
        //inner try block 1   
        try {  
    
            // inner try block 2  
            try {  
                 int arr[] = { 1, 2, 3, 4 };  
                 //printing the array element out of its bounds  
                 System.out.println(arr[10]);  
                }  
    
                // to handles ArithmeticException  
                catch (ArithmeticException e) {  
                    System.out.println("Arithmetic exception");  
                    System.out.println(" inner try block 2");  
                }  
            }  
    
            // to handle ArithmeticException   
            catch (ArithmeticException e) {  
                System.out.println("Arithmetic exception");  
                System.out.println("inner try block 1");  
            }  
        }  
    
        // to handle ArrayIndexOutOfBoundsException   
        catch (ArrayIndexOutOfBoundsException e4) {  
            System.out.println(e4);  
            System.out.println(" outer (main) try block");  
        }  
        catch (Exception e5) {  
            System.out.print("Exception");  
            System.out.println(" handled in main try-block");  
        }  
	}

}
