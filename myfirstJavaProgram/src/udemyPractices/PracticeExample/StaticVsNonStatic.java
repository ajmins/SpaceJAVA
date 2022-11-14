package udemyPractices.PracticeExample;

public class StaticVsNonStatic {

	public static void main(String[] args) {
		NonStaticCount c1 =  new NonStaticCount();
		NonStaticCount c2 =  new NonStaticCount();
		NonStaticCount c3 =  new NonStaticCount();
		
		StaticCount c11 =  new StaticCount();
		StaticCount c21 =  new StaticCount();
		StaticCount c31 =  new StaticCount();

	}

}

class NonStaticCount{
	int count = 0;
	//everytime object is created, count has new memory
	//not memory efficient
	

	public NonStaticCount() {
		count++;
		System.out.println(count);
	}
}
class StaticCount{
	static int count = 0;
	//everytime object is created, count memory is fixed
	// memory efficient
	

	public StaticCount() {
		count++;
		System.out.println(count);
	}
}
