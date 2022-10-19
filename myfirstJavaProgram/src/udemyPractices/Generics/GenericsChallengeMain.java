package udemyPractices.Generics;
/*
 * CHALLENGE
 * 	    // ArrayList<Team> teams;
        // Collections.sort(teams);
        // Create a generic class to implement a league table for a sport.
        // The class should allow teams to be added to the list, and store
        // a list of teams that belong to the league.
        //
        // Your class should have a method to print out the teams in order,
        // with the team at the top of the league printed first.
        //
        // Only teams of the same type should be added to any particular
        // instance of the league class - the program should fail to compile
        // if an attempt is made to add an incompatible team.

 */
public class GenericsChallengeMain {

	public static void main(String[] args) {
		League<Team<FootballPlayer>> footballLeague = new League<>("AFL");
		Team<FootballPlayer> blackSparrows = new Team<>("Black Sparrows");
	
		Team<FootballPlayer> newMan = new Team<>("New Man");
		Team<FootballPlayer> hawThorn = new Team<>("Haw Thorn");
		Team<FootballPlayer> mantleRocks = new Team<>("Mantle Rocks");
		Team<BaseballPlayer> modernWorld = new Team<>("Modern World");
	
		hawThorn.matchResult(mantleRocks, 1, 0);
		hawThorn.matchResult(blackSparrows, 3, 8);
		
		blackSparrows.matchResult(mantleRocks, 2, 1);
		
	footballLeague.add(mantleRocks);
	footballLeague.add(hawThorn);
	footballLeague.add(newMan);
	footballLeague.add(blackSparrows);	
	//footballLeague.add(modernWorld); 
	//this wont work becz the object is created for football team only not for baseball
	
	footballLeague.showLeagueTable();
	}

}
