package myfirstJavaProgram;
import java.util.ArrayList;
public class ForEachLoop {
	//for-each =  traversing technique to iterate through the elements in an array/collection 
	// in less steps, more readable and less flexible
	//aka enhanced for loop
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] animals = {"cat","dog","lion"};
		
		for(String i : animals) {
			System.out.println(i);
		}
		
		ArrayList<String> birds = new ArrayList<String>();
		birds.add("crow");
		birds.add("dove");
		birds.add("sparrow");
		
		for(String i : birds) {
			System.out.println(i);
		}
	}

}
