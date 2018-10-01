package exceptions.exercises;

@SuppressWarnings("serial")
class BaseballException extends Exception {}
@SuppressWarnings("serial")
class Foul extends BaseballException {}
@SuppressWarnings("serial")
class Strike extends BaseballException {}
@SuppressWarnings("serial")
class UmpireArgument extends BaseballException {}

abstract class Inning {
	public Inning() throws BaseballException {}
	public void event() throws BaseballException {}
	public abstract void atBat() throws Strike, Foul;
	public void walk() {} 
	public abstract void umpire() throws UmpireArgument, Foul;
}

@SuppressWarnings("serial")
class StormException extends Exception {}
@SuppressWarnings("serial")
class RainedOut extends StormException {}
@SuppressWarnings("serial")
class PopFoul extends Foul {}

interface Storm {
	public void event() throws RainedOut;
	public void rainHard() throws RainedOut;
	public void referee() throws UmpireArgument, PopFoul;
}

class StormyInning extends Inning implements Storm {
	public StormyInning()
		throws RainedOut, BaseballException {}
	public StormyInning(String s)
		throws Foul, BaseballException {}
  //! void walk() throws PopFoul{} // Cannot reduce the visibility of the inherited method from Inning
  //! public void event() throws RainedOut {} // Exception RainedOut is not compatible with throws clause in Inning.event()
	public void rainHard() throws RainedOut {}
	public void event() {}
	public void atBat() throws PopFoul {}
	public void umpire() {}
	public void referee() throws UmpireArgument {}
	public static void main(String[] args) {
		try {
			StormyInning si = new StormyInning();
			si.atBat();
		} catch(PopFoul e) {
			System.out.println("Pop foul");
		} catch(RainedOut e) {
			System.out.println("Rained out");
		} catch(BaseballException e) {
			System.out.println("Generic baseball exception");
		}
		try {
			Inning i = new StormyInning();
			i.atBat();
		} catch(Strike e) {
			System.out.println("Strike");
		} catch(Foul e) {
			System.out.println("Foul");
		} catch(RainedOut e) {
			System.out.println("Rained out");
		} catch(BaseballException e) {
			System.out.println("Generic baseball exception");
		}
		try {
			StormyInning si = new StormyInning();
			si.referee();
		} catch(UmpireArgument e) {
			System.out.println("Umpire argument exception");
		} catch(RainedOut e) {
			System.out.println("Rained out");
		} catch(BaseballException e) {
			System.out.println("Generic baseball exception");
		}
		try {
			Storm s = new StormyInning();
			s.referee();
		} catch(UmpireArgument e) {
			System.out.println("Umpire argument exception");
		} catch(PopFoul e) {
			System.out.println("Pop foul");
		} catch(RainedOut e) {
			System.out.println("Rained out");
		} catch(BaseballException e) {
			System.out.println("Generic baseball exception");
		}
		
		try {
			StormyInning si = new StormyInning();
			si.umpire();
		} catch(RainedOut e) {
			System.out.println("Rained out");
		} catch(BaseballException e) {
			System.out.println("Generic baseball exception");
		}
		try {
			Inning i = new StormyInning();
			i.umpire();
		} catch(UmpireArgument e) {
			System.out.println("Umpire argument exception");
		} catch(Foul e) {
			System.out.println("Foul");
		} catch(RainedOut e) {
			System.out.println("Rained out");
		} catch(BaseballException e) {
			System.out.println("Generic baseball exception");
		}
	}
}

public class ExceptionsEx20 {
	public static void main(String[] args) {
		StormyInning.main(args);
	}
}
