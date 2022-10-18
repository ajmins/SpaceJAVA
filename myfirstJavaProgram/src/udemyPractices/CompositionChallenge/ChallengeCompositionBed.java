package udemyPractices.CompositionChallenge;

//bed contain style, pillows, height, no of sheet, no of quilts and a method make
public class ChallengeCompositionBed {

	private String style;
	private int pillows;
	private int height;
	private int sheets;
	private int quilts;
	public ChallengeCompositionBed(String style, int pillows, int height, int sheets, int quilts) {
		this.style = style;
		this.pillows = pillows;
		this.height = height;
		this.sheets = sheets;
		this.quilts = quilts;
	}
	
	
	public String getStyle() {
		return style;
	}

	public int getPillows() {
		return pillows;
	}

	public int getHeight() {
		return height;
	}

	public int getSheets() {
		return sheets;
	}

	public int getQuilts() {
		return quilts;
	}

	public void make() {
		System.out.println("Bed -> making");
	}
}
