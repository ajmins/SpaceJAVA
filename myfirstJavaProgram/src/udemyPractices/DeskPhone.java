package udemyPractices;

public class DeskPhone implements ITelephone{
	
	private int myNumber;
	private boolean isRinging;
	
	
	public DeskPhone(int myNumber) {
		this.myNumber = myNumber;
		
	}

	@Override
	public void powerOn() {
		System.out.println("No action taken, desk phone does not have a power button");
		
	}
	
	@Override
	public void dial(int phoneNumeber) {
		System.out.println("Now ringing" + phoneNumeber+ "on deskphone");
		
	}
	
	@Override
	public void answer() {
		if (isRinging) {
			System.out.println("Answering the desk phone");
			isRinging = false;
		}
		
	}
	
	@Override
	public boolean callPhone(int phoneNumeber) {
		if (phoneNumeber == myNumber) {
			isRinging = true;
			System.out.println("Ring Ring");
		}
		else {
			isRinging = false;
		}
		return isRinging;
	}
	
	@Override
	public boolean isRinging() {
		return isRinging;
	}
	
}
