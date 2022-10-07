package udemyPractices;

public class EncpsulationEnhancedPlayer {

	private String fullName;
	private int health = 100;
	private String weapon;
	
	
	public EncpsulationEnhancedPlayer(String name, int health, String weapon) {
		this.fullName = name;
		
		if (health > 0 && health <=100) {
			this.health = health;
		}
		this.weapon = weapon;
	}
	
	public void loseHEalth(int damage) {
		this.health = this.health - damage;
		if(this.health <= 0) {
			System.out.println("Player Knocked Out");
		}
	}
	public int getHealth() {
		return health;
	}
	
}
