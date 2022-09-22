package myfirstJavaProgram;
import java.util.Scanner;
public class Maths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 3.18;
		double y = -10;
		double z = Math.max(x, y);
		double a = Math.min(x, y);
		double b = Math.abs(y);
		double c = Math.sqrt(b);
		double d = Math.round(x);
		double e = Math.ceil(x);
		double f = Math.floor(x);
		System.out.println(z+"\n"+a+"\n"+b+"\n"+c+"\n"+d+"\n"+e+"\n"+f);
		
		System.out.println("Triangle");
		double p,q,r;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter side p:");
		p = scanner.nextDouble();
		System.out.println("Enter side q:");
		q = scanner.nextDouble();
		
		r = Math.sqrt((p*p)+(q*q));
		System.out.println("The hypotenuse is :"+r);
		scanner.close();
	}

}
