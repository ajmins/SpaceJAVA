package udemyPractices.InterfaceDefault;

public interface Polygon {
	
	//abstract method
	void getArea();
	
	//creating  deafault method
	//will be inherited by the classes like ordinary methods
	default void getSides() {
		System.out.println("Will get the sides of polygon");
	}
}
