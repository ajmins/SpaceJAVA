package udemyPractices.Class;


//subclass: ClassCar
public class ClassMain {

	public static void main(String[] args) {
		
		//creating instance of a class
		ClassCar porsche = new ClassCar();
		//aother object
		ClassCar musk = new ClassCar();

		//another object
		ClassCar fish = new ClassCar();
		
		//System.out.println("car model :"+porche.getModel()); //out: null
		porsche.setModel("Carrera");
		System.out.println("car model :"+porsche.getModel());
		
		fish.setModel("Clown");
		System.out.println("fish model :"+fish.getModel());
		
	}

}
