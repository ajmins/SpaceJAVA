package myfirstJavaProgram;
//subclass: PizzaClasss
public class OverloadedConstructorMain {
	
	//overloaded constructor =  multiple constructors within a class with same name,
	//							but have differnt parameters 
	//		two methods: change the data types or changing the number of datatypes
	//							signature = name = parameters

	public static void main(String[] args) {
		
		PizzaClass pizza =  new PizzaClass("thick crust", "tomato", "mozzerrella", "pepperoni");
		System.out.println("Here are the ingredients of the pizza ");
		System.out.println(pizza.bread);
		System.out.println(pizza.sause);
		System.out.println(pizza.cheese);
		System.out.println(pizza.topping);
		
		//constructor 2 instance
		PizzaClass pizza2 =  new PizzaClass("thick crust", "tomato", "mozzerrella");
		System.out.println("Here are the ingredients of the pizza ");
		System.out.println(pizza2.bread);
		System.out.println(pizza2.sause);
		System.out.println(pizza2.cheese);
		System.out.println(pizza2.topping); //if this, will create null
		
		//constructor 3 instance
		PizzaClass pizza3 =  new PizzaClass();
		System.out.println("Here are the ingredients of the pizza ");
		System.out.println(pizza3.bread);
		System.out.println(pizza3.sause);
		System.out.println(pizza3.cheese);
		System.out.println(pizza3.topping); 
		//will all print null value
		
	}

}
