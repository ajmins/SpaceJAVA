package udemyPractices.InterfaceDefault;

import java.io.IOException;

class AnimalException extends Exception{
	
}
public class DefaultIntefaceMain {

	
	public static void main(String[] args) {
	
		Rectangle r1 = new Rectangle();
		r1.getArea();
		r1.getSides();
		
		Square s1 = new Square();
		s1.getArea();
		s1.getSides();
		
		String nameString = "Ajmi";
		String s11 = new String("Ajmi");
		s11.intern(); //push to string constant pool
		//String name2String ="Ajmi";
		//String s12 = new String("Ajmi");
		if (s11 == nameString) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
	
}
 
