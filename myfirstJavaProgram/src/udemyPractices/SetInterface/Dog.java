package udemyPractices.SetInterface;

public class Dog {

	private final String name;

	public Dog(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public final boolean equals(Object obj) {
		//if we put final keyword, then it means 
		//you cannot override this in any of its sub classes
		if (this == obj) {
			return true;
		}
		if (obj instanceof Dog) {
			String objName = ((Dog) obj).getName();
			return this.name.equals(objName);
		}
		return false;
	}
	
	
	
}
