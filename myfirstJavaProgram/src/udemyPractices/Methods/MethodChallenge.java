package udemyPractices.Methods;

public class MethodChallenge {
	//method challenge
		/*
		 * Create a method called displayHighScoreposition 
		 * it should a players name as a parameter, and a 2nd parameter as a position in the high score table 
		 * You should display the players name along with a message 
		 * like " managed to get into position" and the position they got and a 
		 * further message " on the high score table".
		Create a 2nd method called calculateHighScorePosition 
		it should be sent one argument only, 
		the player score it should return an int the return data should be 
		1 if the score is >1000 
		2 if the score is >500 and < 1000 
		3 if the score is > 100 and < 500 
		4 in all other cases 
		call both methods and display the results of the following 
		a score of 1500, 900, 400, and 50

		 */

	public static void main(String[] args) {
		//1
		int Highscore = calculateHighScorePosition(1500);
		displayHighScoreposition("Jane", Highscore);
		//2
		Highscore = calculateHighScorePosition(900);
		displayHighScoreposition("John", Highscore);
		//3
		Highscore = calculateHighScorePosition(400);
		displayHighScoreposition("Kim", Highscore);
		//4
		Highscore = calculateHighScorePosition(50);
		displayHighScoreposition("Lara", Highscore);
		//5
		Highscore = calculateHighScorePosition(1000);
		displayHighScoreposition("Mary", Highscore);
	}

	
	
	public static void displayHighScoreposition(String playerName,int playerPosition) {
		
		System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score table");
		
	}
	public static int calculateHighScorePosition(int playerscore) {
		int position = 4;
		if (playerscore >= 1000) {
			 position = 1;
		}
		else if (playerscore >= 500) {
			 position = 2;
		}
		else if (playerscore >= 100) {
			 position = 3;
		}
		
		 return position;
		
		
	}
	//OUTPUT
	/*
	Jane managed to get into position 1 on the high score table
	John managed to get into position 2 on the high score table
	Kim managed to get into position 3 on the high score table
	Lara managed to get into position 4 on the high score table
	Mary managed to get into position 1 on the high score table
	 */

}
