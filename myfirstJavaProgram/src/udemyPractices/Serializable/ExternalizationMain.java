package udemyPractices.Serializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/*
 * Externalization serves the purpose of custom Serialization, where we can decide what to store in stream.
Externalizable interface present in java.io, is used for Externalization which extends Serializable interface. 
It consist of two methods which we have to override to write/read object into/from stream
 */
public class ExternalizationMain {

	public static void main(String[] args) {
		String fileName = "person.ser";
		PersonExternalization person = new PersonExternalization();
		person.setId(1);
		person.setName("Ajmi");
		person.setGender("Female");
		
		//serialization
		try {
			FileOutputStream fos = new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
		    oos.writeObject(person);
		    oos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//deserialization
		FileInputStream fis;
		try {
			fis = new FileInputStream(fileName);
			ObjectInputStream ois = new ObjectInputStream(fis);
			PersonExternalization p = (PersonExternalization)ois.readObject();
		    ois.close();
		    System.out.println("Person Object Read="+p);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	    
	}

}
