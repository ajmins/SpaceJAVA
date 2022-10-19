package udemyPractices.Generics;

import java.util.ArrayList;

//if we want to extends interfaces also ; Coach & Manager
//public class Team<T extends Player & Coach & Manager > {
public class Team<T extends Player> implements Comparable<Team<T>> {

	private String name;
	int played = 0;
	int won = 0;
	int lost = 0;
	int tied = 0;
	

	
	private ArrayList<T> members = new ArrayList<>();
	
	public Team(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public boolean addPlayer(T player) {
		if (members.contains(player)) {
			//if we extends Team to Player, here no need to cast (Player)
			//System.out.println(((Player) player).getName() + " is already on this team");
			System.out.println((player).getName() + " is already on this team");
			return false;
		}
		else {
			members.add(player);
			//System.out.println(((Player) player).getName() + " picked for team " +this.name);
			System.out.println((player).getName() + " picked for team " +this.name);

			return true;
		}
	}
	
	public int NumPlayers() {
		return this.members.size();
	}
	
	public void matchResult(Team <T> opponent, int ourScore, int theirScore) {
		
		String message;
		
		if (ourScore > theirScore) {
			won++;
			message = " beat ";
		}
		else if (ourScore < theirScore) {
			lost++;
			message = " lost to ";
		}
		else {
			tied++;
			message = " drew with ";
		}
		played++;
		if (opponent != null) {
			System.out.println(this.getName() + message + opponent.getName());
			opponent.matchResult(null, ourScore, theirScore);
		}
	}
	public int ranking() {
		return(won* 2) + tied;
	}
	@Override
	public int compareTo(Team<T> team) {
		if (this.ranking() > team.ranking()) {
			return -1;
		}
		else if (this.ranking() < team.ranking()) {
			return 1;
		}
		else{
			return 0;
		}
	}
	
	
	
}
