package udemyPractices;

import java.security.PublicKey;
import java.util.Iterator;

public class OverloadingVSOverriding {

	

	public static void main(String[] args) {
		Overloading();
		Overriding();
	
		

	}
	public static void Overriding() {
		class Dog{
			public void bark() {
				System.out.println("woof");
			}
		}
		
		class Germanshepherd extends Dog{
			@Override
			public void bark() {
				System.out.println("woof, woof, woof");
			}
		}
		
	}

	//in two seperate programs
	public static void Overloading() {
	
		class Dog{
			public void barking() {
				System.out.println("woof");
			}
		}
		int number = 6;
		public void barking(number) {
			for (int i = 0; i < number; i++) {
				System.out.println("woof");
			}
		}
		
		
	}

}
