package udemyPractices.Inheritence;

public class InheritAnimalFish extends InheritenceAnimal {


	private int gills;
	private int eyes;
	private int fins;
	
	public InheritAnimalFish(String name, int size, int weight, int gills, int eyes, int fins) {
		super(name, 1, 1, size, weight);
		this.gills = gills;
		this.eyes = eyes;
		this.fins = fins;
	}
	
	private void rest() {
		
	}
	private void moveMuscles() {
		
	}
	private void moveBackFin() {
		
	}
	
	public void swim(int speed) {
		moveBackFin();
		moveMuscles();
		super.move(speed);
	}
		
}
