package myfirstJavaProgram;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cars = {"Camaro","Corvetto","Tesla"};
		cars[0]="Mustang";
		System.out.println(cars[0]);
		
		String[] fruits = new String[3];
		fruits[0]="Apple";
		fruits[1]="Grapes";
		fruits[2]="Mango";
		
		System.out.println(fruits[2]);
		System.out.println();
		System.out.println("<--Fruits-->");
		for(int i =0; i<fruits.length;i++) {
			System.out.println(fruits[i]);
		}
		System.out.println();
		System.out.println("<--Cars-->");
		for(int i =0; i<cars.length;i++) {
			System.out.println(cars[i]);
		}
		
	}

}
