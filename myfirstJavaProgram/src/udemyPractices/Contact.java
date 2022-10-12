package udemyPractices;

public class Contact {
	private String name;
	private String phoneNumber;
	
	public Contact(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	public String getName() {
		return name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	//method to create instace of contact class
	public static Contact createContact(String name,String phoneNumber) {
		return new Contact(name, phoneNumber);
		
	}
	
	
	
}
