package udemyPractices.InterfaceDefault;


public class Square implements  Polygon{

	@Override
	public void getArea() {
		int side = 5;
		double area = side * side;
		System.out.println("Area of Square: "+ area);
		
	}
	
}
