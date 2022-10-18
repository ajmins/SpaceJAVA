package udemyPractices.CompositionChallenge;

public class ChallengeCompositionMain {

	/*
	 * Create a single room of a house using composition. 
	 * Think about the things that should be included in the room. 
	 * Maybe physical parts of the house but furniture as well 
	 * Add at least one method to access an object via a getter 
	 * and then that objects public method as you saw in the previous video 
	 * then add at least one method to hide the object 
	 * e.g. not using a getter but to access the object used in composition within the main class like you saw in this video.


	 */
	/*
	 * create classes bedroom that having objects from the classes wall, ceiling, lamp and bed
	 * bedroom contains, name, walls, ceiling, lamp and bed 
	 * it also has a method called makeBed, which inturn call a  method make which is from bed class
	 * it also have getlamp method 
	 * wall class contains 4 objects showing directions S,N, E and W
	 * ceiling contains height and colour in int
	 * lamp contains style, a boolean shows ON or OFF, and globrating and a method turnON
	 * bed contain style, pillows, height, no of sheet, no of quilts and a method make
	 * 
	 * all the methods display text messg like lamp turning on, bed->making, bedroom->making bed
	 * 
	 * in main method, crete objects for walls using the directions, 
	 * ceiling with values: lamp with values,bed with values
	 * and finally calls the bedroom having name and objects
	 * call all the methods based on bedroom 
	 */
	public static void main(String[] args) {
		//create instances
		
		ChallengeCompositionWall wall1 = new ChallengeCompositionWall("North");
		ChallengeCompositionWall wall2 = new ChallengeCompositionWall("South");
		ChallengeCompositionWall wall3 = new ChallengeCompositionWall("East");
		ChallengeCompositionWall wall4 = new ChallengeCompositionWall("West");

		ChallengeCompositionCeiling ceiling = new ChallengeCompositionCeiling(12, 55);
		
		ChallengeCompositionLamp lamp = new ChallengeCompositionLamp("classic", false, 75);
		
		ChallengeCompositionBed bed = new ChallengeCompositionBed("modern", 2, 6, 2, 1);
		
		ChallengeCompositionBedroom bedroom = new ChallengeCompositionBedroom("MyRoom", wall1, wall2, wall3, wall4, ceiling, lamp, bed);
		
		bedroom.makeBed();
		
		bedroom.getLamp().turnOn();
		
	}

}
