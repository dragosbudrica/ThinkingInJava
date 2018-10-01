package exceptions.exercise29;

@SuppressWarnings("serial")
class BaseballException extends RuntimeException {}
@SuppressWarnings("serial")
class Foul extends RuntimeException {}
@SuppressWarnings("serial")
class Strike extends RuntimeException {}

abstract class Inning {
	public Inning() {
		throw new BaseballException();
	}
	public void event() {
		throw new BaseballException();
	}
	public abstract void atBat();
	public void walk() {}
}

@SuppressWarnings("serial")
class StormException extends RuntimeException {}
@SuppressWarnings("serial")
class RainedOut extends RuntimeException {}
@SuppressWarnings("serial")
class PopFoul extends RuntimeException {}

interface Storm {
	public void event();
	public void rainHard();
}

class StormyInning extends Inning implements Storm {
	public StormyInning() {
		throw new RainedOut();
	}
	public StormyInning(String s) {
		throw new Foul();
	}
	public void walk() {
		throw new PopFoul();
	} 
	public void event() {
		throw new RainedOut();
	}
	public void rainHard() {
		throw new RainedOut();
	}
	public void atBat() {
		throw new PopFoul();
	}
	public static void main(String[] args) {
			StormyInning si = new StormyInning();
			si.atBat();
			System.out.println("Pop foul");
			System.out.println("Rained out");
			System.out.println("Generic baseball exception");
			Inning i = new StormyInning();
			i.atBat();
			System.out.println("Strike");
			System.out.println("Foul");
			System.out.println("Rained out");
			System.out.println("Generic baseball exception");
	}
}

public class ExceptionsEx29 {
	public static void main(String[] args) {
		StormyInning.main(args);
	}
}
