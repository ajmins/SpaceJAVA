package udemyPractices.FileOutput;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class WriteDataOutput {

	public static void main(String[] args) throws Exception {
		FileOutputStream fp = new FileOutputStream("C:\\Users\\Ajmi\\Desktop\\a.txt");
		DataOutputStream data = new DataOutputStream(fp);
		
		data.writeInt(66);
		data.flush();
		data.close();
		System.out.println("success");

	}

}
