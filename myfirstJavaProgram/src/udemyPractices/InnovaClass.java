package udemyPractices;

public class InnovaClass extends CarClass{
	private int roadServiceMonths;

	public InnovaClass(int roadServiceMonths) {
		super("Innova", "muv" , 4, 5, 6, false);
		
		this.roadServiceMonths = roadServiceMonths;
	}

	public String toString() {
		String InnovaCar = getName() + "\n" + getSize() + "\n" + roadServiceMonths + " months";
		return InnovaCar;
		
	}
	public void accelerate(int rate) {
		
		int newVelocity = getCurrentVelocity() +rate;
		if(newVelocity == 0) {
			stop();
			changeGear(1);
		}
		else if (newVelocity > 0 && newVelocity <= 10) {
			changeGear(1);
		}
		else if (newVelocity > 10 && newVelocity <= 20) {
			changeGear(2);	
		}
		else if (newVelocity > 20 && newVelocity <= 30) {
			changeGear(3);	
		}
		else {
			changeGear(4);
		}
		
		if(newVelocity > 0) {
			changeVelocity(newVelocity, getCurrentDirection());
		}
	}
}