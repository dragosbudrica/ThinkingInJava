package innerclasses.exercise17;

class Games {
	public static void playGame(GameFactory gf) {
		Game g = gf.getGame();
		while(g.toss());
	}
	public static void main(String[] args) {
		playGame(Coin.factory);
		System.out.println("------------------------");
		playGame(Dice.factory);
	}
}

public class InnerClassesEx17 {
	public static void main(String[] args) {
		Games.main(args);
	}
}
