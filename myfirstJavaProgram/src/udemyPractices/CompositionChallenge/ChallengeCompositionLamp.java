package udemyPractices.CompositionChallenge;

public class ChallengeCompositionLamp {

	private String style;
	private boolean isON;
	private int globRating;
	
	public ChallengeCompositionLamp(String style, boolean isON, int globRating) {
		this.style = style;
		this.isON = isON;
		this.globRating = globRating;
	}
	public String getStyle() {
		return style;
	}
	public boolean isON() {
		return isON;
	}
	public int getGlobRating() {
		return globRating;
	}
	
	
	public void turnOn() {
		System.out.println("Lamp turning on...");
	}
	
	
}
