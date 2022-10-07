package udemyPractices;

/*
 * this class does not provide any Encapsulation
 */

public class EncapsulationPlayer {

	public String name;
	//if we change the name here to fullName, we wont be able to access this in the main
	//public String fullName;
	public int health;
	public String weapon;
	
	public void loseHEalth(int damage) {
		this.health = this.health - damage;
		if(this.health <= 0) {
			System.out.println("Player Knocked Out");
		}
	}
	public int healthRemaining() {
		return this.health;
	}
}
