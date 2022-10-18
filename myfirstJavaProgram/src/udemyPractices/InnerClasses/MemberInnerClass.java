package udemyPractices.InnerClasses;

//outer class
public class MemberInnerClass {

	 private int data=30;  
	 
	 //inner class
	 class Inner{  
		 	
		 void msg(){
			 //data is a private variable to outer class
			 //inner class can access outer class data members
			 System.out.println("data is "+data);
		  }  
	 }  
	public static void main(String[] args) {
		
		//creating instance of outer class
		MemberInnerClass outer=new MemberInnerClass();
		
		//creating instance of inner class refernce to outer class
		MemberInnerClass.Inner inner=outer.new Inner();  
		 
		inner.msg();  

	}

}
