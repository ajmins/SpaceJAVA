package myfirstJavaProgram;
//class CarClass
public class ObjectsMain {
	
	//object : an instance of a class that may contain attributes and methods
	
	public static void main(String[] args) {
		
		CarClass myCar =  new CarClass(); //myCar has all the attributes & methods of CarClass
	
		//another class instance
		CarClass myCar1 =  new CarClass(); 
		
		//call class attributes
		System.out.println(myCar.make);
		System.out.println(myCar.model);
		//Chevorlet
//		Corvette
	
		System.out.println("Second car");
		//call class methods
		myCar1.drive();
		myCar1.brake();
//		You drive the car
//		You step on the brake
		
		
		System.out.println(myCar1.make);
		System.out.println(myCar1.model);
		myCar1.drive();
		myCar1.brake();
		
			
	}

}

//here CarClass is acting as blueprint and whenever we construct an instance of this class
//a car object all of them are going to be the same methods and attributes
//but we don't want all our cars same attrubutes like chevorlet,
//so for that we r using "constructs"