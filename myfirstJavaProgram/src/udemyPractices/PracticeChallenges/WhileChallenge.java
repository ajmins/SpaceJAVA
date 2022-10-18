package udemyPractices.PracticeChallenges;

public class WhileChallenge {

	/*
	 * Create a method called isEvenNumber that takes a parameter of type int 
	 * Its purpose is to determine if the argument passed to the method 
	 * is an even number or not. 
	 * return true if an even number, otherwise return false;

	 */
	
	public static void main(String[] args) {

		int number = 0;
		int MaxValue = 18;
		int countValue = 0;
		int sum = 0;
		while (number <= MaxValue) {
			number++;
			if(isEvenNumber(number)) {
				countValue++;
				sum +=number;
				System.out.println(number+" found as even");
			}
			else {
				continue;
				//System.out.println(number+" is not even");
			}
			if (countValue == 5) {
				break;
			}
			
		}
		System.out.println("Total number: "+countValue);
		System.out.println("Total sum: "+sum);
		
	}

	public static boolean isEvenNumber(int num){
		if ((num % 2) == 0) {
			return true;
		}
		return false;
	}
}
