package udemyPractices.Interface;

public class InterfaceMain {

	public static void main(String[] args) {
		ITelephone ajPhone;
		//ITelephone ajPhone = new ITelephone(); type enter will generate all the methods
		//DeskPhone ajPhone2;
		ajPhone = new DeskPhone(123456);
		ajPhone.powerOn();
		ajPhone.callPhone(123456);
		ajPhone.answer();
		
		ajPhone =  new MobilePhoneInterface(24568);
		ajPhone.powerOn();
		ajPhone.callPhone(24568);
		ajPhone.answer();

	}

}
