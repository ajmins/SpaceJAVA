package udemyPractices.MapInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LocationMain {

	private static Map<Integer, Location> location = new HashMap<Integer, Location>();
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		location.put(0, new Location(0, "infront of computer"));
		location.put(1, new Location(1, "Standing in th road"));
		location.put(2, new Location(2, "near Hill"));
		location.put(3, new Location(3, "Inside building"));
		location.put(4, new Location(4, "Valley side"));
		location.put(5, new Location(5, "in the forest"));

		location.get(1).addExit("W", 2);
		location.get(1).addExit("E", 3);
		location.get(1).addExit("S", 4);
		location.get(1).addExit("N", 5);
		//location.get(1).addExit("Q", 0);
		
		location.get(2).addExit("N", 5);
		//location.get(2).addExit("Q", 0);
		
		location.get(3).addExit("W", 2);
		//location.get(3).addExit("Q", 0);
		
		location.get(4).addExit("W", 2);
		location.get(4).addExit("N", 5);
		//location.get(4).addExit("Q", 0);
		
		location.get(5).addExit("S", 4);
		location.get(5).addExit("W", 2);
		//location.get(5).addExit("Q", 0);
		
		//Splitting 
		String[] road = "You are standing at the end of a road before a small brick building".split(" ");
		for (String i : road) {
			System.out.println(i);
		}
		String[] building = "You are standing at the end of a road, before a small brick building".split(", ");
		for (String i : building) {
			System.out.println(i);
		}
		
		
		int loc = 1;
		while (true) {
			System.out.println(location.get(loc).getDescription());
			if (loc == 0) {
				break;
			}
			Map<String, Integer> exits = location.get(loc).getExits();
			System.out.println("Available exits are");
			for (String exit : exits.keySet()) {
				System.out.print(exit + ", ");
			}
			System.out.println();
			String direction = scanner.nextLine().toUpperCase();
			if (exits.containsKey(direction)) {
				loc = exits.get(direction);
			}
			else {
				System.out.println("Canot go in that direction");
			}

		}

	}

}
