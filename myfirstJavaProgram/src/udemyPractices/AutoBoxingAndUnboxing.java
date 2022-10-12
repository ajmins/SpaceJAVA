package udemyPractices;

import java.util.ArrayList;

class IntClass{
	private int myValue;

	public IntClass(int myValue) {
		this.myValue = myValue;
	}

	public int getMyValue() {
		return myValue;
	}

	public void setMyValue(int myValue) {
		this.myValue = myValue;
	}

}

public class AutoBoxingAndUnboxing {
	/*
	 * Autoboxing: Automatic conversion of primitive types to the object of their corresponding wrapper classes is known as autoboxing. 
	 * For example – conversion of int to Integer, long to Long, double to Double etc.
	 * The Java compiler applies autoboxing when a primitive value is: 
	 * 			Passed as a parameter to a method that expects an object of the corresponding wrapper class.
	 * 			Assigned to a variable of the corresponding wrapper class.
	 */

	public static void main(String[] args) {
		//we can't use primitive values as such in arraylists
		//ArrayList<int> intArrayList = new ArrayList<int>();
		//if we want to use like this, we need to create a seperate class 
		ArrayList<IntClass> intClassArrayList = new ArrayList<>();
		intClassArrayList.add(new IntClass(54));
		//instead of these, we can use wrapper class as in the form of autoboxing
		
		/*
		 * Compiler uses valueOf() method to convert primitive to Object and uses intValue(), doubleValue() etc to get primitive value from Object. 
		 */
		//autoboxing
		Integer myIntvalue = 56; //same as Integer.valueOf(56);
		//unboxing
		int myInt = myIntvalue.intValue(); //same as myIntValue.intValue();
		
		
		//another example
		ArrayList<Double> myDoubleValues = new ArrayList<Double>();
		for (double dbl = 0.0; dbl<=10.0;dbl += 0.5) {
			myDoubleValues.add(Double.valueOf(dbl)); //autoboxing
		}
		for(int i = 0; i<myDoubleValues.size();i++) {
			double value = myDoubleValues.get(i).doubleValue(); //unboxing
			System.out.println(i +"-> "+ value);
		}
		
	}

}

