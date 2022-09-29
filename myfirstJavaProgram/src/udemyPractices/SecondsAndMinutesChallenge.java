package udemyPractices;
public class SecondsAndMinutesChallenge {
	/*
	 *Create a method called getDurationString with two parameters, 
	 *first parameter minutes and 2nd parameter seconds. 
	 *You should validate that the first parameter minutes is >= 0.
	 *You should validate that the 2nd parameter seconds is >= 0 and <= 59. 
	 *The method should return "Invalid value" in the method if either of the above are not true.
	 *If the parameters are valid then calculate how many hours minutes and seconds 
	 *equal the minutes and seconds passed to this method and 
	 *return that value as string in format"XXh YYm Zzs” 
	 *where XX represents a number of hours, YY the minutes and ZZ the seconds.
	 */
	/*
	 * Create a 2nd method of the same name but with only one parameter seconds. 
	 * Validate that it is >= 0, and return "Invalid value" if it is not true.
	 * If it is valid, then calculate how many minutes are in the seconds value 
	 * and then call the other overloaded method passing the correct minutes and seconds calculated 
	 * so that it can calculate correctly. 
	 * Call both methods to print values to the console.
	 */	
	/*
	 *Use int or long for your number data types is probably a good idea.
	 *1 minute = 60 seconds and 1 hour = 60 minutes or 3600 seconds.
	 *Methods should be static as we have used previously.
	 */
	
	private static final String INVALID_VALUE_MESSAGE = "Invalid value";
	public static void main(String[] args) {
		
		System.out.println(getDurationString(-585,90));
		System.out.println(getDurationString(5600));
		
	}
	
	public static String getDurationString(int minutes, int seconds) {
		String duration;
		if (minutes < 0 || (seconds < 0 )) {
			//return "Invalid value";
			return INVALID_VALUE_MESSAGE;
		}
		else {
			//calculate how many hours minutes and seconds equal the minutes and seconds and in "XXh YYm Zzs” 
			int hour = minutes / 60 ;
			int remainingMinutes = (minutes % 60) + (seconds / 60);
			int remainingSeconds = seconds % 60;
			duration = String.format("%02dh:%02dm:%02ds", hour, remainingMinutes, remainingSeconds);
			//System.out.println(duration);
				
		}
		return duration;
	}
	
	public static String getDurationString(int seconds) {
	String duration;
	if (seconds < 0) {
		//return "Invalid value";
		return INVALID_VALUE_MESSAGE;
	}
	else {
		int minutesValue = seconds / 60;
		int remainingSeconds = seconds % 60;
		duration = String.format("%02dm:%02ds",minutesValue, remainingSeconds);
		//System.out.println(duration);
	}
	return duration;
	}
	
}
