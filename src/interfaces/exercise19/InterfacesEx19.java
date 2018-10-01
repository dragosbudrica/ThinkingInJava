package interfaces.exercise19;

class Games {
	public static void playGame(GameFactory gf) {
		Game g = gf.getGame();
		while(g.toss());
	}
	public static void main(String[] args) {
		playGame(new CoinFactory());
		System.out.println("------------------------");
		playGame(new DiceFactory());
	}
}

public class InterfacesEx19 {
	public static void main(String[] args) {
		Games.main(args);
	}
}
