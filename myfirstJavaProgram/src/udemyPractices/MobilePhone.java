package udemyPractices;

import java.util.ArrayList;

public class MobilePhone {

	//holds the ArrayList of Contacts class
	private ArrayList<Contact> myContacts;
	private String myNumber;
	
	public MobilePhone(String myNumber) {
		this.myContacts = new ArrayList<Contact>();
		this.myNumber = myNumber;
	}
	
	//checking whether a contact is already presents
	public boolean addNewContact(Contact contact) {
		if (findContact(contact.getName()) >=0) {
			System.out.println("Contact already present");
			return false;
		}
		myContacts.add(contact);
		return true;
		
	}
	private int findContact(Contact contact) {
		return this.myContacts.indexOf(contact);
	}
	private int findContact(String contactName) {
		for (int i = 0; i < this.myContacts.size(); i++) {
			Contact contacts = this.myContacts.get(i);
			if (contacts.getName().equals(contactName)) {
				return i;
			}
		}
		return -1;
	}
	
	public boolean modifyContact(Contact oldContact, Contact newContact) {
		int foundPosition = findContact(oldContact);
		if (foundPosition <0) {
			System.out.println(oldContact.getName() +", was not found");
			return false;
		}
		else if (findContact(newContact.getName()) != -1) {
			System.out.println("Contact Name " +newContact.getName()+" is already found. Please enter another name");
			return false;
		}

			this.myContacts.set(foundPosition, newContact);
			System.out.println(oldContact.getName()+ ", was replaced with " +newContact.getName());
		return true;
	}
	
	public String queryContact(Contact contacts) {
		if (findContact(contacts)>= 0) {
			return contacts.getName();
		}
		return null;
	}
	public Contact queryContact(String name) {	
		int position = findContact(name);
		if (position >= 0) {
			return this.myContacts.get(position);
		}
		return null;
	}
	
	public boolean removeContact(Contact contact) {
		int foundPosition = findContact(contact);
		if (foundPosition <0 ) {
			System.out.println(contact.getName() +", was not found");
			return false;
		}
		this.myContacts.remove(foundPosition);
		System.out.println(contact.getName()+", was deleted");
		return true;
		
	}
	public void printContacts() {
		System.out.println("contact List");
		if(this.myContacts.size() == 0) {
			System.out.println("You have no contacts!");
		}
		for (int i = 0; i < this.myContacts.size(); i++) {
				System.out.println((i+1) + "." + this.myContacts.get(i).getName()
						+ "->" + this.myContacts.get(i).getPhoneNumber());
		}
	}
	
}
