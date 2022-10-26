package udemyPractices.HashMethods;

import java.util.Objects;

//import static org.junit.Assert.assertEquals;

public class HashMain {

	/*
		Object.hashCode(): use to get the hashcode of a single, non-null object
		Objects.hashCode(): use to get the hashcode of a single object that might be null
		Objects.hash(): use to get a hashcode for multiple objects
	 */
	public static void main(String[] args) {

		//objectHashCode();
		//objectsHashCode();
		objectsHash();

	}

	private static void objectsHash() {
		String strOne = "one";
		String strTwo = "two";
		String strOne2 = "one";
		String strTwo2 = "two";
		        
		int hashCode1 = Objects.hash(strOne, strTwo);
		int hashCode2 = Objects.hash(strOne2, strTwo2);
		        
		checkHash(hashCode1, hashCode2); //true
		String testString = "test string";
		int hashCode11 = Objects.hash(testString);
		int hashCode21 = Objects.hashCode(testString);
		        
		checkHash(hashCode11, hashCode21); //false
		
	}

	private static void objectsHashCode() {
		String stringOne = "test";
		String stringTwo = "test";
		int hashCode1 = Objects.hashCode(stringOne);
		int hashCode2 = Objects.hashCode(stringTwo);
		
		checkHash(hashCode1, hashCode2); //true
		String nullString = null;
		int hashCode = Objects.hashCode(nullString);
		checkHash(0, hashCode); //true; hashCode = 0
	}

	private static void objectHashCode() {
		Double valueOne = Double.valueOf(1.0012);
		Double valueTwo = Double.valueOf(1.0012);
		        
		int hashCode1 = valueOne.hashCode();
		int hashCode2 = valueTwo.hashCode();
		
		checkHash(hashCode1, hashCode2); //true

//		Double value = null;
//		System.out.println(value.hashCode());
		//will throw error
	}
	
	public static void checkHash(int hashCode1, int hashCode2){
		if (hashCode1 == hashCode2) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}

	

}
