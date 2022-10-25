package udemyPractices.DeepVsShallowCopy;

public class DeepCopyMain {
/*
 * When we do a copy of some entity to create two or more than two entities such that changes in one entity are not reflected in the other entities, 
 * then we can say we have done a deep copy. 
 * In the deep copy, a new memory allocation happens for the other entities, and reference is not copied to the other entities. 
 * Each entity has its own independent reference.
 */

	public static void main(String[] args) {

		//create object of class ABC
		ABC obj1 = new ABC();
		ABC obj2 = new ABC();
		
		//update value of x
		obj2.x = 6;
		
		//print
		System.out.println(" Value of x of object1: "+obj1.x);
		System.out.println(" Value of x of object2: "+obj2.x);
		/*
		 *   	Value of x of object1: 30
 				Value of x of object2: 6
		 */
	}

}
class ABC{
	//instance of class ABC
	int x = 30;
}
