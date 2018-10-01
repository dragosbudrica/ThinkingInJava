package reusing.exercises;

class Cleanser {
	private String s = "Cleanser";
	public void append(String a) { s += a; }
	public void dilute() { append(" dilute()"); }
	public void apply() { append(" apply()"); }
	public void scrub() { append(" scrub()"); }
	public String toString() { return s; }
	public static void main(String[] args) {
		Cleanser x = new Cleanser();
		x.dilute(); x.apply(); x.scrub();
		System.out.println(x);
	}
}

class DetergentDelegations {
	private Cleanser cleanser = new Cleanser();
	
	public String toString() {
		return cleanser.toString();
	}
	
	public void append(String a) {
		cleanser.append(a);
	}
	
	public void apply() {
		cleanser.apply();
	}
	
	public void dilute() {
		cleanser.dilute();
	}
	
	public void scrub() {
		append(" Detergent.scrub()");
		cleanser.scrub();
	}

	public void foam() {
		append(" foam()"); 
		}
}

public class ReusingEx11 {
	public static void main(String[] args) {
		DetergentDelegations x = new DetergentDelegations();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		System.out.println(x);
		System.out.println("Testing base class:");
		Cleanser.main(args);
	}
}
