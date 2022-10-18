package udemyPractices.CompositionChallenge;
/*
 	 * bedroom contains, name, walls, ceiling, lamp and bed 
	 * it also has a method called makeBed, which inturn call a  method make which is from bed class
	 * it also have getlamp method
	 * bedroom->making bed
 */
public class ChallengeCompositionBedroom {
	
	private String name;
	private ChallengeCompositionWall wall1;
	private ChallengeCompositionWall wall2;
	private ChallengeCompositionWall wall3;
	private ChallengeCompositionWall wall4;
	private ChallengeCompositionCeiling ceiling;
	private ChallengeCompositionLamp lamp;
	private ChallengeCompositionBed bed;
	
	public ChallengeCompositionBedroom(String name, ChallengeCompositionWall wall1, ChallengeCompositionWall wall2,
			ChallengeCompositionWall wall3, ChallengeCompositionWall wall4, ChallengeCompositionCeiling ceiling,
			ChallengeCompositionLamp lamp, ChallengeCompositionBed bed) {
		this.name = name;
		this.wall1 = wall1;
		this.wall2 = wall2;
		this.wall3 = wall3;
		this.wall4 = wall4;
		this.ceiling = ceiling;
		this.lamp = lamp;
		this.bed = bed;
	}
	//create a getter for lamp
	public ChallengeCompositionLamp getLamp() {
		return lamp;
	}

	
	public void makeBed() {
		System.out.println("Bedrooom -> making bed");
		bed.make();
	}



	
}
