package myfirstJavaProgram;

public class Methods {
	//method =  block of code executed whenever it is called upon
	
	public static void main(String[] args) {
		String name = "Ajmi";
		int age =  22;
		hello(); 
		//Cannot make a static reference to the non-static method hello() from the type Methods
		// so for that add static to method definition
		helloName(name, age);
		
		//another example
		calculateScore(true, 800, 5, 100);
		//or 
		boolean gameOver =  true;
		int score = 10000;
		int levelCompleted = 8;
		int bonus = 200;
		int finalS = calculateScore(gameOver, score, levelCompleted, bonus);
		System.out.println(finalS);
		
		
	}
	
	//create a method called hello
	static void hello() {
		System.out.println("Hello");
	}
	
	//passing an argument
	static void helloName(String nameOf, int age) {
		System.out.println("Hello "+ nameOf);
		System.out.println("You are "+ age);
	}

	// another example
	
	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
		
		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			System.out.println("Final score: "+ finalScore);
			return finalScore;
		}
//		else {
//			return -1;
//		}
		//or
		return -1;
	}	
	
}
