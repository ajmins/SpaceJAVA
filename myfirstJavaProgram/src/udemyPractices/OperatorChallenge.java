package udemyPractices;


public class OperatorChallenge {

	//Operators Test
	/*
	 * 1.Create a double variable with value 20.0
	 * 2.Create another double variable with value 80.0
	 * 3.Add both and multiply by 100.00
	 * 4.Find remainder from step 3 and 40.00
	 * 5.Create boolean that assigns the value true if the remainder in step 4 is 0 or false if not zero
	 * 6. Print its value
	 * 7. Write an if-then statement that displays a msg "Got some remainder",if the value is not true
	 * Some issue is arised..check it
	 */
	
	public static void main(String[] args) {
		
		double v1, v2, newNum, rem;
		v1 = 20.00d;
		v2 = 80.00d;
		newNum = (v1 + v2) * 100.00d;
		//if here () is not used? then the setBoolean value will be false
		rem = newNum % 40.00d;
		
		boolean setBoolean = (rem==0)? true : false;
		
		System.out.println("Result of boolean : "+ setBoolean);
		if (!setBoolean) { //is setBoolean is false?
			System.out.println("Got some remainder ");
		}

	//Output
		/*
		 * Result of boolean : true
		 */
	
		
	}

}
