package udemyPractices;
/*
 * Notes
 * 
 * The java instanceof operator is used to test whether the object is an instance of the specified type (class or subclass or interface).
 * The instanceof in java is also known as type comparison operator because it compares the instance with type. 
 * It returns either true or false. 
 * 
 * 
 */

public class InstanceOf {

	public static void main(String[] args) {
		// simple example
		InstanceOf isOf =  new InstanceOf();
		System.out.println(isOf instanceof InstanceOf); //true

		//An object of subclass type is also a type of parent class. 
		//For example, if Dog extends Animal then object of Dog can be referred by either Dog or Animal class.
		
		ChildInstanceOf isOfChild = new ChildInstanceOf();
		System.out.println( isOfChild instanceof InstanceOf); //true
	
		//If we apply instanceof operator with a variable that have null value, 
		//it returns false
		
		
	}

}
class ChildInstanceOf extends InstanceOf{
	
}
