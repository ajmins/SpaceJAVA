package myfirstJavaProgram;
import java.util.Random;
public class RandomNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int x = rand.nextInt();
		System.out.println(x);
		int y = rand.nextInt(6);
		System.out.println(y);
		int z = rand.nextInt(6)+1;
		System.out.println(z);
		
		double w = rand.nextDouble();
		System.out.println(w);
		
		boolean u = rand.nextBoolean();
		System.out.println(u);
	}

}
