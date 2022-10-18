package udemyPractices.InterfaceChallenge;

import java.util.ArrayList;
import java.util.List;

public class MonsterClassInterfaceChallenge implements ISaveable {

	private String name;
	private int hitPoints;
	private int strength;
	
	public MonsterClassInterfaceChallenge(String name, int hitPoints, int strength) {
		this.name = name;
		this.hitPoints = hitPoints;
		this.strength = strength;
	}

	public String getName() {
		return name;
	}

	public int getHitPoints() {
		return hitPoints;
	}

	public int getStrength() {
		return strength;
	}

	@Override
	public String toString() {
		return "Monster [name=" + name + ", hitPoints=" + hitPoints + ", strength=" + strength
				+ "]";
	}

	@Override
	public List<String> write() {
		ArrayList<String> values = new ArrayList<String>();
		values.add(0, this.name);
		//casting integer to string by putting double quotes
		values.add(1,""+ this.hitPoints);
		values.add(1,""+ strength);
		
		return values;
	}

	@Override
	public void read(List<String> savedValues) {
		if (savedValues != null && savedValues.size()>0) {
			this.name = savedValues.get(0);
			//converting back the string to integer 
			this.hitPoints = Integer.parseInt(savedValues.get(1));
			this.strength = Integer.parseInt(savedValues.get(2));
		}
		
	}
	
	
	
	
	
	
}
