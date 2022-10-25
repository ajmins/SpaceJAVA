package udemyPractices.ImmutableClasses;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/*
 * Immutable class in java means that once an object is created,
 * we cannot change its content. 
 * In Java, all the wrapper classes (like Integer, Boolean, Byte, Short) and String class is immutable. 
 * We can create our own immutable class as well.
 * 
 * The class must be declared as final so that child classes can’t be created.
Data members in the class must be declared private so that direct access is not allowed and it need to be final
 */
public final class ImmutableDemo {
	
	private final int id;
	private final String name;
	private final HashMap<String, String> testMap;
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	//accessor function for mutable objects
	public HashMap<String, String> getTestMap(){
		return (HashMap<String, String>) testMap.clone();
	}
	
	/*
	 *  Constructor performing Deep Copy
	 
	public ImmutableDemo(int i, String n, HashMap<String,String> hm){
		System.out.println("Performing Deep Copy for Object initialization");
		this.id=i;
		this.name=n;
		HashMap<String,String> tempMap=new HashMap<String,String>();
		String key;
		Iterator<String> it = hm.keySet().iterator();
		while(it.hasNext()){
			key=it.next();
			tempMap.put(key, hm.get(key));
		}
		this.testMap=tempMap;
	}
	 */
	/*
	 * Constructor performing Shallow Copy
	 */
	public ImmutableDemo(int i, String n, HashMap<String,String> hm){
		System.out.println("Performing Shallow Copy for Object initialization");
		this.id=i;
		this.name=n;
		this.testMap=hm;
	}
	
	public static void main(String[] args) {
		HashMap<String, String> h1 = new HashMap<String,String>();
		h1.put("1", "first");
		h1.put("2", "second");
		
		String s = "original";
		
		int i=10;
		
		ImmutableDemo ce = new ImmutableDemo(i,s,h1);
		
		//Lets see whether its copy by field or reference
		System.out.println(s==ce.getName());
		System.out.println(h1 == ce.getTestMap());
		
		//print the ce values
		System.out.println("ce id:"+ce.getId());
		System.out.println("ce name:"+ce.getName());
		System.out.println("ce testMap:"+ce.getTestMap());
		
		//change the local variable values
		i=20;
		s="modified";
		h1.put("3", "third");
		
		//print the values again
		System.out.println("ce id after local variable change:"+ce.getId());
		System.out.println("ce name after local variable change:"+ce.getName());
		System.out.println("ce testMap after local variable change:"+ce.getTestMap());
		
		HashMap<String, String> hmTest = ce.getTestMap();
		hmTest.put("4", "new");
		
		System.out.println("ce testMap after changing variable from accessor methods:"+ce.getTestMap());
		/*
		 * 	Deep copy
		  	Performing Deep Copy for Object initialization
			true
		  	false
			ce id:10
			ce name:original
			ce testMap:{1=first, 2=second}
			ce id after local variable change:10
			ce name after local variable change:original
			ce testMap after local variable change:{1=first, 2=second}
			ce testMap after changing variable from accessor methods:{1=first, 2=second}

			Shallow Copy
			Performing Shallow Copy for Object initialization
			true
			false
			ce id:10
			ce name:original
			ce testMap:{1=first, 2=second}
			ce id after local variable change:10
			ce name after local variable change:original
			ce testMap after local variable change:{1=first, 2=second, 3=third}
			ce testMap after changing variable from accessor methods:{1=first, 2=second, 3=third}


		 */

	}

}
