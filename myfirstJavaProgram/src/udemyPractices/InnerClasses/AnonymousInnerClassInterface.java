package udemyPractices.InnerClasses;

public class AnonymousInnerClassInterface {


	public static void main(String[] args) {
		//here a class is created but its name is decided by the compiler, which implements the Eatable interface and provides the implementation of the eat() method.
		//An object of the Anonymous class is created that is referred to by 'eaten', a reference variable of the Eatable type.
		Eatable eaten = new Eatable() {
		
			@Override
			public void eat() {
				System.out.println("nice fruits");
				
			}
		};

		eaten.eat();
	}

}
