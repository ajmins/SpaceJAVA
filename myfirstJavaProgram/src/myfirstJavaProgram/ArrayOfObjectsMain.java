package myfirstJavaProgram;
//subclass: ArrayOfObjectsFood
public class ArrayOfObjectsMain {

	public static void main(String[] args) {

		//array of integers, characters, and strings
		int[] numbers = new int[3];
		char[] characters = new char[4];
		String[] strings = new String[5];
		
		//creating instance of ArrayOfObjectsFood object
		//method 1
		//datatype  =  ArrayOfObjectsFood
		//datatype[] name =  new datatype();
		ArrayOfObjectsFood[] refrigerator = new ArrayOfObjectsFood[3];
		
		
		//creating food(ArrayOfObjectsFood) objects
		ArrayOfObjectsFood food1 =  new ArrayOfObjectsFood("pizza");
		ArrayOfObjectsFood food2 =  new ArrayOfObjectsFood("hamburger");
		ArrayOfObjectsFood food3 =  new ArrayOfObjectsFood("cupcake");

		//refrigerator array stores food1, food2 and food3
		refrigerator[0] = food1;
		refrigerator[1] = food2;
		refrigerator[2] = food3;
		
		//display values in refrigerator array
		System.out.println(refrigerator[0]); 
		//out:
		//myfirstJavaProgram.ArrayOfObjectsFood@5a07e868 -> where food1 is stored ib the memory
		
		//inorder to get the name, which is passed into the class
		System.out.println(refrigerator[0].name); 
		//out:- pizza
		
		//method 2
		//creating food(ArrayOfObjectsFood) objects
		ArrayOfObjectsFood food4 =  new ArrayOfObjectsFood("orange");
		ArrayOfObjectsFood food5 =  new ArrayOfObjectsFood("apple");
		ArrayOfObjectsFood food6 =  new ArrayOfObjectsFood("lemon");
		
		ArrayOfObjectsFood[] refrigerator2 = {food4,food5,food6};
		
		System.out.println(refrigerator2[0].name); 
		System.out.println(refrigerator2[1].name); 
		System.out.println(refrigerator2[2].name); 
	}

}
