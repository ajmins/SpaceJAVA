package udemyPractices.Generics;

public class GenericsMain {

	public static void main(String[] args) {
		FootballPlayer joel = new FootballPlayer("Joel");
		BaseballPlayer john= new BaseballPlayer("John");
		SoccerPlayer willie = new SoccerPlayer("Willie");

		Team<FootballPlayer> blackSparrows = new Team<>("Black Sparrows");
		blackSparrows.addPlayer(joel);
//		blackSparrows.addPlayer(john);
//		blackSparrows.addPlayer(willie);
		
		System.out.println(blackSparrows.NumPlayers());
		
		Team<BaseballPlayer> modernWorld = new Team<>("Modern World");
		modernWorld.addPlayer(john);
		
		Team<SoccerPlayer> shiningStars = new Team<>("Shining Stars");
		shiningStars.addPlayer(willie);
		
		Team<FootballPlayer> newMan = new Team<>("New Man");
		FootballPlayer banks =  new FootballPlayer("Cunning Crew");
		newMan.addPlayer(banks);
		
		Team<FootballPlayer> hawThorn = new Team<>("Haw Thorn");
		Team<FootballPlayer> mantleRocks = new Team<>("Mantle Rocks");
		
		hawThorn.matchResult(mantleRocks, 1, 0);
		hawThorn.matchResult(blackSparrows, 3, 8);
		
		blackSparrows.matchResult(mantleRocks, 2, 1);
		//blackSparrows.matchResult(modernWorld, 1, 1);
		
		System.out.println("Rankings");
		System.out.println(blackSparrows.getName() + ": " +blackSparrows.ranking());
		System.out.println(newMan.getName() + ": " +newMan.ranking());
		System.out.println(mantleRocks.getName() + ": " +mantleRocks.ranking());
		System.out.println(hawThorn.getName() + ": " +hawThorn.ranking());
		
		
		System.out.println(blackSparrows.compareTo(newMan));
		System.out.println(blackSparrows.compareTo(hawThorn));
	}

}
