package udemyPractices.InnerClassChallenge;
/*
 * Create a Song class having Title and Duration for a song. 
 */
public class Song {

	private String title;
	private double duration;
	
	//constructor
	public Song(String title, double duration) {
		this.title = title;
		this.duration = duration;
	}

	public String getTitle() {
		return title;
	}

	@Override
	public String toString() {
		return "Song [title = " + title + ", duration = " + duration + "]";
	}
	
	
	
	
	
}
