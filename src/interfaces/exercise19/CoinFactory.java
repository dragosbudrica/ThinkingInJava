package interfaces.exercise19;

public class CoinFactory implements GameFactory {
	@Override
	public Game getGame() {
		return new Coin();
	}
}
