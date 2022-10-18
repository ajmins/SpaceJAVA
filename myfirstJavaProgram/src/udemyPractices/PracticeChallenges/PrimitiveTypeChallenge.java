package udemyPractices.PracticeChallenges;

public class PrimitiveTypeChallenge {
/*
To create a byte variable and set it to any valid byte number. 
Create a short variable and set it to any valid short number.
Create a int variable and set it to any valid int number.
Create a variable of type long and make it equal 
to 50000 plus 10 times the sum of the 
byte plus the short plus the integer values
*/	
	
	//notes
	//For long numbers smaller than Integer.MAX_VALUE, the L suffix is optional.
	//For long numbers larger than Integer.MAX_VALUE, we must add the L suffix.
	public static void main(String[] args) {
		byte b = 5;
		short s = 12;
		int i = 1000;
		long l = 50000L + 10L *(b + s + i);
		//here no need of casting becz, 
		System.out.println(l);
		
		//here we need casting becz we have an integer value i
		short sh = (short) (5000 + 10 *(b + s + i));
		System.out.println(sh);
		
		//but here no need
		int i1 = (5000 + 10 *(b + s + i));
		System.out.println(i1);
	}

}
