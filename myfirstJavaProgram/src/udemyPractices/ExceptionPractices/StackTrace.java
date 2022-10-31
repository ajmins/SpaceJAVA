package udemyPractices.ExceptionPractices;


/*
 *  stack trace is location of the exceptions
 *  In Java, the stack trace is an array of stack frames. 
 *  It is also known as stack backtrace (or backtrace). 
 *  The stack frames represent the movement of an application during the execution of the program. 
 *  It traces the locations where exception raised.
 *  The JVM automatically produces the stack trace when an exception is thrown. 
 *  In stack trace, each element represents a method invocation.
 *  Java Throwable class provides the printSatckTrace() method to print the stack trace on the console.
 */
public class StackTrace {

	public static void main(String[] args) {
		demo();

	}

	static void demo() {
		demo1();
		
	}

	static void demo1() {
		demo2();
		
	}

	static void demo2() {
		demo3();
		//printSatckTrace();
		
	}

	static void demo3() {
		Thread.dumpStack();
		
		
	}
	/*
	 * Output
	 * java.lang.Exception: Stack trace
	at java.base/java.lang.Thread.dumpStack(Thread.java:1380)
	at udemyPractices.ExceptionPractices.StackTrace.demo3(StackTrace.java:37)
	at udemyPractices.ExceptionPractices.StackTrace.demo2(StackTrace.java:32)
	at udemyPractices.ExceptionPractices.StackTrace.demo1(StackTrace.java:27)
	at udemyPractices.ExceptionPractices.StackTrace.demo(StackTrace.java:22)
	at udemyPractices.ExceptionPractices.StackTrace.main(StackTrace.java:17)
	
	 * At the first line of the stack trace, we get the execution point of the stack 
	 * and from second line to the end line we get the stack frames that form the complete stack trace.
	 * We see that the method executed first becomes the last stack frame of the stack trace 
	 * and the method executed at last becomes the first stack frame of the stack trace. 
	 * Therefore, each element of the stack trace represents a stack frame.
	 * 
	 */

}
