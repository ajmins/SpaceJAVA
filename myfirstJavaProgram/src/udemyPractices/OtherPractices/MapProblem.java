package udemyPractices.OtherPractices;

import java.util.HashMap;
import java.util.Map;

public class MapProblem {

	public static void main(String[] args) {

		String text = "Jack and Jill went up the hill";
		Map<Character,Integer> letterCount=new HashMap<Character,Integer>();
		//String[] letters = text.split("");
		char[] letters = text.toCharArray();
		for (char c : letters) {
			if (letterCount.containsKey(c)) {
				letterCount.put(c, letterCount.get(c)+1);
			}
			else {
				letterCount.put(c, 1);
			}
		}
		System.out.println("Letters : Count\n");
//		letterCount.entrySet().forEach(entry -> System.out.println(
//				  entry.getKey() + " : " + entry.getValue()));
		
		 for (Map.Entry<Character,Integer> entry : letterCount.entrySet()) 
	            System.out.println("Key = " + entry.getKey() +
	                             ", Value = " + entry.getValue());
	}

}
