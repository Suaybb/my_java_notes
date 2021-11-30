package java_notes.ch03.footballPlayer;

public class FootballPlayer {
	
	public int no;
	public String name;
	public boolean inPlay;
	public float minutes;
	public int numberOfGoals;
	
	public void play(int minutesToPlay) {
		minutes += minutesToPlay;	
	}
	
	public void score() {
		++numberOfGoals;
	}
}
