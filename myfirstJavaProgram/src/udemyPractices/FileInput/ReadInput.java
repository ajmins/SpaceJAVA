package udemyPractices.FileInput;
import java.io.FileInputStream;
public class ReadInput {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\Ajmi\\Desktop\\abc.txt");
			//to read a single character
			int i = fin.read();
			System.out.println((char)i);
			//fin.close();
			//to read all charcaters
			//FileInputStream finp = new FileInputStream("C:\\Users\\Ajmi\\Desktop\\abc.txt");
			int c = 0;
			while ((c=fin.read())!=-1) {
				System.out.println((char)c);
			}
			
			fin.close();
		}
		catch (Exception e) {
			System.out.println(e);
		}

	}

}
