package udemyPractices.MapInterface;

import java.util.HashMap;
import java.util.Map;
public class HashMapMain {

	public static void main(String[] args) {
		Map<String, String> languages = new HashMap<>();
		languages.put("Java", "plat form independent");
		languages.put("Python", "interpreter, easy to understand");
		languages.put("Algol", "An algorithemic language");
		languages.put("Lisp", "List processing");
		
		System.out.println(languages.get("Java"));
		//if we add new value for same key, it's overridden
		languages.put("Java", "object oriented");
		System.out.println(languages.get("Java"));

		if (languages.containsKey("Python")) {
			System.out.println("Python is already in the map");
		}
		else {
			languages.put("Python", "object oriented");
		}
		System.out.println("=========================");
		//to print keys & values
		for (String key : languages.keySet()) {
			System.out.println(key +" : "+ languages.get(key));
		}
		//to remove
		languages.remove("Lisp");
		if (languages.remove("Algol", "a programming language")) {
			System.out.println("Algol removed");
		}
		else {
			System.out.println("Algol not removed, and not found ");
		}
		System.out.println("=========================");
		System.out.println(languages.replace("Lisp", "another programming language"));
		System.out.println(languages.replace("Python", "interpreted language"));

		System.out.println("=========================");
		//to print keys & values
		for (String key : languages.keySet()) {
			System.out.println(key +" : "+ languages.get(key));
		}
	}

}
