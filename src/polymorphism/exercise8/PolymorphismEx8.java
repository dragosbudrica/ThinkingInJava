package polymorphism.exercise8;
import java.util.Random;

enum Note {
	MIDDLE_C, C_SHARP, B_FLAT; 
}

class Instrument {
	void play(Note n) { System.out.println("Instrument.play() " + n); }
	@Override
	public String toString() { return "Instrument"; }
	void adjust() { System.out.println("Adjusting Instrument"); }
}

class Wind extends Instrument {
	@Override
	void play(Note n) { System.out.println("Wind.play() " + n); }
	@Override
	public String toString() { return "Wind"; }
	@Override
	void adjust() { System.out.println("Adjusting Wind"); }
}

class Percussion extends Instrument {
	@Override
	void play(Note n) { System.out.println("Percussion.play() " + n); }
	@Override
	public String toString() { return "Percussion"; }
	@Override
	void adjust() { System.out.println("Adjusting Percussion"); }
}

class Stringed extends Instrument {
	@Override
	void play(Note n) { System.out.println("Stringed.play() " + n); }
	@Override
	public String toString() { return "Stringed"; }
	@Override
	void adjust() { System.out.println("Adjusting Stringed"); }
}

class Brass extends Wind {
	@Override
	void play(Note n) { System.out.println("Brass.play() " + n); }
	@Override
	void adjust() { System.out.println("Adjusting Brass"); }
}

class Woodwind extends Wind {
	@Override
	void play(Note n) { System.out.println("Woodwind.play() " + n); }
	@Override
	public String toString() { return "Woodwind"; }
}

class RandomInstrumentGenerator {
	private Random rand = new Random(41);
	public Instrument next() {
		switch(rand.nextInt(6)) {
		default:
		case 0: return new Wind();
		case 1: return new Percussion();
		case 2: return new Stringed();
		case 3: return new Brass();
		case 4: return new Woodwind();
		}
	}
}

class Music3 {
	public static void tune(Instrument i) {
		// ...
		i.play(Note.MIDDLE_C);
	}
	public static void tuneAll(Instrument[] e) {
		for(Instrument i : e) {
			tune(i);
		}
	}
	public static void main(String[] args) {
		RandomInstrumentGenerator rig = new RandomInstrumentGenerator();
		Instrument[] orchestra = new Instrument[9];
		for(int i = 0; i < orchestra.length; i++) {
			orchestra[i] = rig.next();
		}
		tuneAll(orchestra);
	}
} 

public class PolymorphismEx8 {
	public static void main(String[] args) {
		Music3.main(args);
	}
}
