/**
 * 
 */
package myfirstJavaProgram;
import javax.swing.JOptionPane;
/**
 * @author Ajmi
 *
 */
public class Gui {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = JOptionPane.showInputDialog("Enter your name?");
		JOptionPane.showMessageDialog(null,"Hello "+ name);
		//in order to convert to integer directly
		//use Integer.parseInt() method
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age?"));
		JOptionPane.showMessageDialog(null,"You are "+ age + " years old");
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height?"));
		JOptionPane.showMessageDialog(null,"You are "+ height + "cm tall");
		
		
	}

}
