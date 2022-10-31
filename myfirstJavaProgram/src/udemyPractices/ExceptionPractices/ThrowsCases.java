package udemyPractices.ExceptionPractices;

import java.io.IOException;

/*
 * If we are calling a method that declares an exception, 
 * we must either caught or declare the exception.
 * There are two cases:

Case 1: We have caught the exception 
	i.e. we have handled the exception using try/catch block.
Case 2: We have declared the exception 
	i.e. specified throws keyword with the method.
In Case2
	In case we declare the exception, 
		if exception does not occur, the code will be executed fine.
	In case we declare the exception and the exception occurs, 
		it will be thrown at runtime because throws does not handle the exception.
 */
public class ThrowsCases {

	//declare exception here
	public static void main(String[] args) throws IOException {
		M m = new M();
		//m.method();
		N n = new N();
		//n.task();
		
		System.out.println("Normal flow");

	}

}
class M{
	void method() throws IOException{
		System.out.println("Device operation performed");
	}
}
class N{
	void task() throws IOException{
		throw new IOException("device error");
	}
}
