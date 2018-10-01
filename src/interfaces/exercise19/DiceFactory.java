package interfaces.exercise19;

public class DiceFactory implements GameFactory {
	@Override
	public Game getGame() {
		return new Dice();
	}
}
