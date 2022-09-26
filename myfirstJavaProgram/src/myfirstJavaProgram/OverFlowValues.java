package myfirstJavaProgram;

public class OverFlowValues {

	public static void main(String[] args) {
		int myMinIntValue = Integer.MIN_VALUE;
		int myMaxIntValue = Integer.MAX_VALUE;
		System.out.println("my MinInt Value: " + myMinIntValue);
		System.out.println("my MaxInt Value: " + myMaxIntValue);
		System.out.println("my Busted MaxValue: " + (myMaxIntValue + 1));
		System.out.println("my Busted MinValue: " + (myMinIntValue - 1));
		
		System.out.println("my second Busted MaxValue: " + (myMaxIntValue + 2));
		System.out.println("my second Busted MinValue: " + (myMinIntValue - 2));
		
		//output
		/*
		my MinInt Value: -2147483648
		my MaxInt Value: 2147483647
		
		here the overflow occurs 
		my Busted MaxValue: -2147483648
		
		here the underflow
		my Busted MinValue: 2147483647
		
		my second Busted MaxValue: -2147483647
		my second Busted MinValue: 2147483646
		
		*/
		/*
		If you try and put a value larger than the maximum value in Java, or a value smaller than
		the minimum value in Java,then you will get an Overflow in the case of the maximum value
		or an Underflow in the case of the minimum.
		The computer just skips back to the minimum number or the maximum number,which is
		usually not what you want. It's an important concept to be aware of.
	*/
	}

}
