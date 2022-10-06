package udemyPractices;
// Java program to illustrate Constructor Chaining to
// other class using super() keyword
class BaseNew
{
	String name;

	// constructor 1
	BaseNew()
	{
		this("");
		System.out.println("No-argument constructor of" +
										" BaseNew class");
	}

	// constructor 2
	BaseNew(String name)
	{
		this.name = name;
		System.out.println("Calling parameterized constructor"
											+ " of BaseNew");
	}
	
	public static void main(String args[])
	{
		// calls parameterized constructor 4
		BaseNew obj = new BaseNew("test");

		// Calls No-argument constructor
		// Derived obj = new Derived();
	}
}
