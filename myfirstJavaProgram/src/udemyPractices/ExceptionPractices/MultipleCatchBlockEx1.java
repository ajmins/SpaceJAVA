package udemyPractices.ExceptionPractices;

public class MultipleCatchBlockEx1 {

	public static void main(String[] args) {
		try{    
            int a[]=new int[5];    
//            a[5]=30/0;
//            System.out.println(a[8]);
            String s=null;  
            System.out.println(s.length());   //here NullPointException is not provided
           }    
       catch(ArithmeticException e)  
          {  
           System.out.println("Arithmetic Exception occurs");  
          }    
       catch(ArrayIndexOutOfBoundsException e)  
          {  
           System.out.println("ArrayIndexOutOfBounds Exception occurs");  
          }    
       catch(Exception e)  
          {  
           System.out.println("Parent Exception occurs");  
          }             
       System.out.println("rest of the code");    

	}
	//if we do not follow the order then it will generate error: compile-time
	//ie if we place first Exception then arithmetic etc will be out of order

}
