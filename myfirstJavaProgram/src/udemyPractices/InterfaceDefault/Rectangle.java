package udemyPractices.InterfaceDefault;

public class Rectangle implements Polygon{

	@Override
	public void getArea() {
		int length = 5;
		int breadth = 6;
		double area = length * breadth;
		System.out.println("Area of rectangle: "+ area);
		
	}
	//overrides the method
	public void getSides() {
		System.out.println("Rectangle has 4 sides");
	}
	
}
