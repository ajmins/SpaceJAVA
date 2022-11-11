package udemyPractices.MapInterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparable<Employee>{
	public Employee(String nameString, int age) {
		this.nameString = nameString;
		this.age = age;
	}

	String nameString;
	int age;
	
	@Override
	public String toString() {
		return "Employee [nameString=" + nameString + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return o.age>this.age ? -1: 1 ;
	}
	
}
class Comp implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o2.age>o1.age ? -1: 1;
	}
	
}

public class ListMethods {

	public static void main(String[] args) {

		
		List<Integer> numIntegers = new ArrayList<Integer>();
		numIntegers.add(1);
		numIntegers.add(9);
		numIntegers.add(3);
		numIntegers.add(5);
		numIntegers.add(0);
		
		Collections.sort(numIntegers);
		List<Employee> emp = new ArrayList<Employee>();
		Employee e1 = new Employee("DAjmi", 22);
		Employee e2 = new Employee("Aabc", 23);
		Employee e3 = new Employee("Zeb", 15);
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		///Collections.sort(emp);
		//System.out.println(emp);
		Comparator co = new Comp();
		
		//function defition at the time of object creation
		//anonymous class 
		Comparator<Employee> co1 =  ( o1,  o2) -> {
			//lambda expression can only be used if functional interface
				return o2.age>o1.age ? -1: 1;
			
			
		};
		Collections.sort(emp, co1);
		System.out.println(emp);

	}

}
