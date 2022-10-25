package udemyPractices.SetInterface;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HeavenlyBody {

	private final String name;
	private final double orbitalPeriod;
	private final Set<HeavenlyBody> satellites;
	int c = 0;
	
	public HeavenlyBody(String name, double orbitalPeriod) {
		this.name = name;
		this.orbitalPeriod = orbitalPeriod;
		this.satellites = new HashSet<>();
	}

	public String getName() {
		return name;
	}

	public double getOrbitalPeriod() {
		return orbitalPeriod;
	}
	
	public boolean addMoon(HeavenlyBody moon) {
		return this.satellites.add(moon);
	}
	public Set<HeavenlyBody> getSatellites(){
		return new HashSet<>(this.satellites);
	}

	@Override
	public int hashCode() {
		c++;
		System.out.println("hashcode called in "+c);
		return this.name.hashCode() + 57;
	}

	//equals() in hashcode
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		System.out.println("obj.getclass() is "+ obj.getClass());
		System.out.println("this.getClass() is "+ this.getClass());
		
		if ((obj == null) || (obj.getClass() != this.getClass())) {
			return false;
			
		}
		
		String objName = ((HeavenlyBody) obj).getName();
		return this.name.equals(objName);
	}



	
	
	
}
