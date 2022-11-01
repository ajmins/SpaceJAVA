package udemyPractices.CloseableInterface;

import java.io.Closeable;
import java.io.IOException;

public class ResourceManagement {

	public static void main(String[] args) {
		//to illustrate the order in which close() works
		try (Demo d = new Demo(); Demo1 d1 = new Demo1()) {
			int x = 10/0;
			d.show();
			d1.show1();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}

class Demo implements Closeable{
	void show() {
		System.out.println("inside show");
	}

	@Override
	public void close() {
		System.out.println("Close from demo");
		
	}
}

class Demo1 implements Closeable{
	void show1() {
		System.out.println("inside show1");
	}

	@Override
	public void close(){
		System.out.println("Close from demo1");
		
	}
}