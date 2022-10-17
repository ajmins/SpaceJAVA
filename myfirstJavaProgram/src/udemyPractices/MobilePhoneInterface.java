package udemyPractices;

public class MobilePhoneInterface implements ITelephone {

	private int myNumber;
	private boolean isRinging;
	private boolean isOn = false;
	
	
	public MobilePhoneInterface(int myNumber) {
		this.myNumber = myNumber;
		
	}

	@Override
	public void powerOn() {
		isOn = true;
		System.out.println("Mobile phone powered up");
		
	}
	
	@Override
	public void dial(int phoneNumeber) {
		if (isOn) {
			System.out.println("Now ringing" + phoneNumeber+ "on mobile phone");
		}
		else {
			System.out.println("Phone is switched off");
		}
		
		
	}
	
	@Override
	public void answer() {
		if (isRinging) {
			System.out.println("Answering the mobile phone");
			isRinging = false;
		}
		
	}
	
	@Override
	public boolean callPhone(int phoneNumeber) {
		if (phoneNumeber == myNumber && isOn) {
			isRinging = true;
			System.out.println("Melody Ring");
		}
		else {
			isRinging = false; 
			System.out.println("Mobile phone not on or number different");
		}
		return isRinging;
	}
	
	@Override
	public boolean isRinging() {
		return isRinging;
	}
	
}
