package interfaces.exercise19;

public class Dice implements Game {
	private int flips = 0;
	private static final int FLIPS = 6;
	private int die1;
	private int die2;
	@Override
	public boolean toss() {
		System.out.println("Throw the dice...");
		die1 = (int)(1 + Math.random() * 6);
		die2 = (int)(1 + Math.random() * 6);
		System.out.println("You throwed " + die1 + " - " + die2);
		return ++flips != FLIPS;
	}
}
