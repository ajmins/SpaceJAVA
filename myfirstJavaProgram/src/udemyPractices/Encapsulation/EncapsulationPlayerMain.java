package udemyPractices.Encapsulation;

/*
 * Encapsulation 
 * Encapsulation in Java is the process by which data (variables) and the code that acts upon them (methods) are integrated as a single unit. By encapsulating a class's variables, other classes cannot access them, and only the methods of the class can access them.
 * 
 * Encapsulation, is to make sure that "sensitive" data is hidden from users. 
 * To achieve this, you must:
 * 		-declare class variables/attributes as private
 * 		-provide public get and set methods to access and update the value of a private variable
 * 
 * Encapsulation provides ultimate control over the data members and data methods inside the class.
 * The standard IDEs provide in-built support for ‘Getter and Setter’ methods, which increases the programming pace.
 * Encapsulation prevents access to data members and data methods by any external classes. 
 * The encapsulation process improves the security of the encapsulated data.
 */


public class EncapsulationPlayerMain {

	public static void main(String[] args) {
		/*
		 * first section  main without any encapsulation techniques
		 * EncpsulationPlayer.java class
		
		EncapsulationPlayer player = new EncapsulationPlayer();
		player.name = "Ami";
		player.health = 20;
		player.weapon = "Sword";
		
		int damage = 10;
		player.loseHEalth(damage);
		System.out.println("Remaining health = "+player.healthRemaining());

		damage = 11;
		player.health = 200; 
		//the control is taken out of the player class
		//security conern
		player.loseHEalth(damage);
		System.out.println("Remaining health = "+player.healthRemaining());
	*/
		/*
		 * second session with encapsulation
		 * EncpsulationEnhancedPlayer.java class
		 */
		EncpsulationEnhancedPlayer player = new EncpsulationEnhancedPlayer("Ami", 200, "Sword");
		System.out.println("Initial health = "+player.getHealth());

		//System.out.println("Remaining health = "+player.healthRemaining());

	}

}
