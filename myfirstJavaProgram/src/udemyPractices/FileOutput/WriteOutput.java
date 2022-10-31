package udemyPractices.FileOutput;
import java.io.FileOutputStream;
public class WriteOutput {

	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("C:\\Users\\Ajmi\\Desktop\\abc.txt");
			fout.write(65);
			//System.getProperty("line.separator");
			String string = "Twinkle twinkle littel star";
			//convert string to byte
			byte b[] = string.getBytes();
			fout.write('\n');
			fout.write(b);
			fout.close();
			System.out.println("Success");
		
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
