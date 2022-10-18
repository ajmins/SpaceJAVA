package udemyPractices.PracticeChallenges;

public class isPrime {

	public static void main(String[] args) {
		int countNumbers = 0;
		
		int MinValue = 0;
		int MaxValue = 50;
		for (int i = MinValue; i < MaxValue; i++) {
			if (isPrimeNumber(i)) {
				System.out.println(i+" is a Prime Number");
				countNumbers++;
			}
//			if (countNumbers ==10) {
//				break;
//			}

		}
		System.out.println("Number of prime numbers in between "+MinValue+" - "+MaxValue+" : "+countNumbers);

	}
	public static boolean isPrimeNumber(int n) {
		if (n==0 ||n == 1) {
			return false;
		}
		//if we r using n/2 then the number of iterations is more
		//eg: if n= 48, its half is 24 and its square root is 6.9
		//for calculating prime number we dont need to check for half of its value instead we can use its squareroot
		
		//for (int i = 2; i <= n/2; i++) {
		for (int i = 2; i <= (long)Math.sqrt(n); i++) {
			//System.out.println("Looping "+i);
			if(n % i == 0) {
				return false;
			}
			
		}
		return true;
		
	}

}
