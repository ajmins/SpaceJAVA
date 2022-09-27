package myfirstJavaProgram;

public class Strings {
	//String is not a primitive data type
	//it's a Class
	//sequence of characters
	//strings are immutable
	//StringBuffer : StringBuffer is a peer class of String that provides much of the functionality of strings.
	//StringBuffer class is used to create mutable (modifiable) string. 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = " Ajmi ";
		boolean result = name.equalsIgnoreCase("ajmi");
		
		int len = name.length();
		
		char letter = name.charAt(2);
		
		int index = name.indexOf("i");
		
		boolean res = name.isEmpty();
		
		String upper = name.toUpperCase();
		
		String lower = name.toLowerCase();
		String trimResult = name.trim();
		String replaceResult =  name.replace('i', 'y');
		
		System.out.println(result);
		System.out.println(len);
		System.out.println(letter);
		System.out.println(index);
		System.out.println(res);
		System.out.println(upper);
		System.out.println(lower);
		System.out.println(trimResult);
		System.out.println(replaceResult);
		
		
	}

}
