package myfirstJavaProgram;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int index = 10; index>=0; index-=2) {
			System.out.println(index);
		}
		System.out.println("Happy New Year");
		double amount = 10000;
		for (int i = 0; i < 12; i++) {
			//we can adjust the precision by using String.format() method
			//"%.2f" means after decimal 2 points only 
			System.out.println(amount +" at "+i+"% interest = "+String.format("%.2f",calculateInterest(amount, i)));
		}
	}
	
	public static double calculateInterest(double amount, double interestRate) {
		return(amount * (interestRate/100));
	}

}
