package udemyPractices;

public interface ITelephone {
	//public keyword is also optional just like abstract 
	void powerOn();
	void dial(int phoneNumeber);
	void answer();
	boolean callPhone(int phoneNumeber);
	boolean isRinging();
	
}
