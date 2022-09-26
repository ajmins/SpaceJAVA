package myfirstJavaProgram;
//main class; ToStringMain
public class ToStringCar {

	String make = "Ford";
	String model = "Mustang";
	String color = "red";
	int year = 2022;
		
	public String toString() {
		String myCar = make + "\n" + model + "\n" + color + "\n" + year;
		return myCar;
		
	}
	
	
}
