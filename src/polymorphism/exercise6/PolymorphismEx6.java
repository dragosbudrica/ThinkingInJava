package polymorphism.exercise6;

enum Note {
	MIDDLE_C, C_SHARP, B_FLAT; 
}

class Instrument {
	void play(Note n) { System.out.println("Instrument.play() " + n); }
	public String what() { return "Instrument"; }
	void adjust() { System.out.println("Adjusting Instrument"); }
}

class Wind extends Instrument {
	@Override
	void play(Note n) { System.out.println("Wind.play() " + n); }
	@Override
	public String what() { return "Wind"; }
	@Override
	void adjust() { System.out.println("Adjusting Wind"); }
}

class Percussion extends Instrument {
	@Override
	void play(Note n) { System.out.println("Percussion.play() " + n); }
	@Override
	public String what() { return "Percussion"; }
	@Override
	void adjust() { System.out.println("Adjusting Percussion"); }
}

class Stringed extends Instrument {
	@Override
	void play(Note n) { System.out.println("Stringed.play() " + n); }
	@Override
	public String what() { return "Stringed"; }
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
	public String what() { return "Woodwind"; }
}

class Music3 {
	public static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}
	public static void tuneAll(Instrument[] e) {
		for(Instrument i : e) {
			System.out.println("-----------------------------");
			tune(i);
			System.out.println(i.what());
		}
	}
	public static void main(String[] args) {
		Instrument[] orchestra = {
				new Wind(),
				new Percussion(),
				new Stringed(),
				new Brass(),
				new Woodwind()
		};
		tuneAll(orchestra);
	}
}

public class PolymorphismEx6 {
	public static void main(String[] args) {
		Music3.main(args);
	}
}