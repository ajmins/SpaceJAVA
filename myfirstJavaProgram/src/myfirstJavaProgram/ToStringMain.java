package myfirstJavaProgram;
//subclass: ToStringCar
public class ToStringMain {

	//toString() = special method that all objects inherit, that returns a string that "externally represents " an object
	//			can be used bth implicitly amnd explicitly
	public static void main(String[] args) {
		
		ToStringCar car = new ToStringCar();
		
		System.out.println(car.make);
		System.out.println(car.model);
		System.out.println(car.color);
		System.out.println(car.year);
		
		//if we print car 
		System.out.println(car); 
		//out: myfirstJavaProgram.ToStringCar@5a07e868
		// address of car object in the memory.
		//here we implictly use the toString method()
		
		//explicitly using 
		System.out.println(car.toString()); 
		//out: myfirstJavaProgram.ToStringCar@5a07e868
		
		
		//now override the toString method in the car class
		//after this if we print car either explicitly or implictly, we will get the output
		//out 
//		Ford
//		Mustang
//		red
//		2022
		
	}

}
