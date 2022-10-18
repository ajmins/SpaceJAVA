package udemyPractices.Inheritence;

public class InheritenceAnimal {

	private String name;
	private int brain;
	private int body;
	private int size;
	private int weight;


	//create constructor
	
	public InheritenceAnimal(String name, int brain, int body, int size, int weight) {
		this.name = name;
		this.brain = brain;
		this.body = body;
		this.size = size;
		this.weight = weight;
	}

	//create some methods common to all animals
	public void eat() {
		System.out.println("Animal can eat");
	}
	public void move(int speed) {
		System.out.println("Animal move is called and animal is moving at "+speed);
		
	}
	
	
	//create getters for all attributes
	public String getName() {
		return name;
	}


	public int getBrain() {
		return brain;
	}


	public int getBody() {
		return body;
	}


	public int getSize() {
		return size;
	}


	public int getWeight() {
		return weight;
	}
	
	
	
	
	
}
