package udemyPractices;

public class PrimitiveDatType {

	//byte, int, char, boolean, long, short, float, double
	
		public static void main(String[] args) {
			// 
			long l = 500000000L; //8bytes -> 64bits 
			int i = 5; //4 bytes -> 32bits
			short s = 5; //2 bytes -> 16bits -> -32768 to 32767
			byte b = 5; //1 byte -> 8bits -> -128 to 127
			float f = 5.5f; 
			double d = 5.5;
			boolean t = true;
			char c = 'A'; //2 bytes -> 16 bits ; allowed to store unicode character(not possible in byte)
			c = 66;
			System.out.println(c); //B
			
			double d1 = 5; //implicit conversion 
			//that is ; (d1 = of double datatype but 5 is integer and we can assign an integer value to a double
		//	int k = 5.5; => not possible but we can here do a type conversion
			int k = (int)5.5; //explicit conversion or type casting
			System.out.println(k); //5
		/*type casting
		 * byte -> short ->
		 * 					int -> long -> float -> double
		 * 			char->
		 * 
		 * */
		}

}
