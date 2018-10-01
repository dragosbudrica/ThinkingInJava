package innerclasses.exercise17;

public class Coin implements Game {
	private int flips = 0;
	private static final int FLIPS = 7;
	public static GameFactory factory = new GameFactory() {
		@Override
		public Game getGame() {
			return new Coin();
		}
	};
	@Override
	public boolean toss() {
		System.out.println("Flip the coin...");
		if((int)(Math.random() * 2) == 0) {
			System.out.println("HEAD");
		}
		else {
			System.out.println("TAIL");
		}
		return ++flips != FLIPS;
	}
}
