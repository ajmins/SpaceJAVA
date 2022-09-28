package udemyPractices;

public class CodeExercise2 {
	/*
	 * 
	 * Speed Converter
		1. Write a method called to MilesPer Hour that has 1 parameter of type double with the name kilometersPer Hour. 
		This method needs to return the rounded value of the calculation of type long
		If the parameter kilometersPer our is less than 0, 
			the method to MilesPer Hour needs to return-1 to indicate an invalid value.
		Otherwise, if it is positive, calculate the value of miles per hour, 
			round it and return it. 
			For conversion and rounding, check the notes in the text below.
		
		Examples of input/output:
			toMilesPerhour(1.5); -> should return value 1
			toMilesPer Hour(10.25); -> should return value 6
			toMilesPer Hour(-5.6); -> should return value-1
			toMilesPerhour(25.42); -> should return value 16
			toilesPerhour (75.114); -> should return value 47
	
	1 mile = 1.609 km
	for getting value in mile
	an approximate result, divide the length value in km by 1.609

	
	2. Write another method called printConversion with 1 parameter of type double with the name kilometersPerHour.
	This method should not return anything (void) and 
	it needs to calculate milesPer Hour from the kilometersPerHour parameter.
	Then it needs to print a message in the format "XX km/h - YY mi/h".
	XX represents the original value kilometersPer Hour. 
	YY represents the rounded milesPer Hout from the kilometersPer Hour parameter.
	If the parameter kilometersPer Hour is <0 then print the text "Invalid Value".

	 */

	public static void main(String[] args) {
		
		double km,miles;
		//km = 1.5;
		//km = 10.25;
		//km = -5.6;
		//km = 25.42;
		km = 75.114;
		miles = MilesPerHour(km);
		printConversion(km,miles);
		//System.out.println((int) MilesPerHour(km));

	}
	public static long MilesPerHour(double kilometersPerHour) {
		
		if (kilometersPerHour < 0) {
			return -1;
		}
		else {
			return (long)(Math.round(kilometersPerHour/1.609));
		}
		
	}
	public static void printConversion(double km, double miles) {
		
		if (km < 0) {
			System.out.println("Invalid value");
		}
		else {
			System.out.println(km + " km/h - " + miles +" mi/h");
		}
		
		
		
	}

}
