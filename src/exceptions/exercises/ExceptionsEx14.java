package exceptions.exercises;

@SuppressWarnings("serial")
class OnOffException1 extends Exception {}

@SuppressWarnings("serial")
class OnOffException2 extends Exception {}

class Switch {
	private boolean state = false;
	public boolean read() { return state; }
	public void on() { state = true; System.out.println(this); }
	public void off() { state = false; System.out.println(this); }
	public String toString() { return state ? "on" : "off"; }
}

class OnOffSwitch {
	private static Switch sw = new Switch();
	private static String str;
	public static void f(String str)
	throws OnOffException1,OnOffException2 {
		System.out.println(str.toUpperCase());
	}
	public static void main(String[] args) {
		try {
			sw.on();
			f(str);
			sw.off();
		} catch(OnOffException1 e) {
			System.out.println("OnOffException1");
			sw.off();
		} catch(OnOffException2 e) {
			System.out.println("OnOffException2");
			sw.off();
		}
	}
}

public class ExceptionsEx14 {
	public static void main(String[] args) {
		OnOffSwitch.main(args);
	}
}