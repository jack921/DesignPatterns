package ±¸ÍüÂ¼Ä£Ê½;

public class Client {

	public static void main(String[] args) {
		CallOfDuty game=new CallOfDuty();
		game.play();
		
		Caretaker caretaker=new Caretaker();
		caretaker.archive(game.createMemoto());
		game.quit();
		
		CallOfDuty newgame=new CallOfDuty();
		newgame.restore(caretaker.getMemoto());
		
	}
	
}
