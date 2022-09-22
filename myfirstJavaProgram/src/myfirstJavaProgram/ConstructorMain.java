package myfirstJavaProgram;
//class HumanClass

public class ConstructorMain {

	//constructor = special method that is called when an object is instantiated or created
	public static void main(String[] args) {
		
		//first object
		HumanClass human =  new HumanClass("Rick",22,45); //instance of a class
		//need to have arguments same as that the constructor have in the HumanClass

		//second human
		HumanClass human2 =  new HumanClass("Mary",25,60);
		
		System.out.println(human.name);
		//using the constructor we can create two different objects 
		System.out.println(human2.weight);
		
		
		human2.eat();
		
		human.drink();
		
		
		
		
		
	}

}
