package udemyPractices.DeepVsShallowCopy;

public class ShallowCopyMain {
	/*
	 * When we do a copy of some entity to create two or more than two entities 
	 * such that changes in one entity are reflected in the other entities as well, 
	 * then we can say we have done a shallow copy. In shallow copy, 
	 * new memory allocation never happens for the other entities, 
	 * and the only reference is copied to the other entities. 
	 */

	public static void main(String[] args) {
		//create object of class ABC
		Demo obj1 = new Demo();
		
		//will copy the reference, not value
		Demo obj2 = obj1;
		
		//update value of x
		obj2.x = 6;
		
		//print
		System.out.println(" Value of x of object1: "+obj1.x);
		System.out.println(" Value of x of object2: "+obj2.x);

		/*
		 *  Value of x of object1: 6
 			Value of x of object2: 6
		 */
	}

}
class Demo{
	//instance of class ABC
	int x = 30;
}