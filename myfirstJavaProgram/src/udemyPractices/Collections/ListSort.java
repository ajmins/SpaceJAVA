package udemyPractices.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListSort {

	public static void main(String[] args) {

		List<Integer> values = new ArrayList<>();
		Random random = new Random();
		//we can avoid {} if single sentence only
		for (int i = 0; i < 5; i++) values.add(random.nextInt(20));
		
		System.out.println(values);
		//natural sorting using Collections class
		Collections.sort(values);
		System.out.println("Natural Sorting: "+values);
		
		//custom sorting, reverse order
		//this is comparator o2-o1 used inside lamda operator ->
		//it is of 3 kinds, ==, > & <; if positive return ascending order, if negative return in dscending order
		values.sort((o1,o2) -> {return (o2-o1);});
		System.out.println("Reverse Sorting: "+values);
		
		values.sort((o1,o2) -> {return (o1-o2);});
		System.out.println("Reverse Sorting: "+values);
		
		values.sort((o1,o2) -> {return (o1-o2-o1);});
		System.out.println("Reverse Sorting: "+values);
		
		values.sort((o1,o2) -> {return (o1-o2-o1-o2);});
		System.out.println("Reverse Sorting: "+values);

	}

}
