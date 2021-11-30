package java_notes.ch03.footballPlayer;

public class FootballPlayerTest {

	public static void main(String[] args) {
		
		FootballPlayer player = new FootballPlayer();
		player.no = 11;
		player.name = "Didier Drogba";
		player.inPlay = true;
		player.minutes = 0;
		player.numberOfGoals = 0;
		
		player.play(85);
		player.play(25);
		player.score();
		player.score();
		
		System.out.println("Number of Drogba's goals: " + player.numberOfGoals);
		System.out.println("Drogba played totally " + player.minutes);
	}	
}
