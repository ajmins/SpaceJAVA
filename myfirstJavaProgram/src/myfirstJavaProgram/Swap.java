package myfirstJavaProgram;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "Water";
		String y = "Oil";
		String temp;
		System.out.println("Before");
		System.out.println("x: "+x);
		System.out.println("y: "+y);
		temp = x;
		x = y;
		y = temp;
		System.out.println("After");
		System.out.println("x: "+x);
		System.out.println("y: "+y);
	}

}
