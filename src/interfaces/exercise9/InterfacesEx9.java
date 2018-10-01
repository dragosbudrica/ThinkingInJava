package interfaces.exercise9;

enum Note {
	MIDDLE_C, C_SHARP, B_FLAT; 
}

interface Instrument {
	int VALUE = 5;
	void play(Note n);
	void adjust();
}

abstract class AbstractInstrument implements Instrument {
	public abstract void play(Note n);
	public abstract String toString();
	public abstract void adjust();
}

class Wind extends AbstractInstrument {
	public void play(Note n) {
		System.out.println(this + ".play() " + n);
	}
	public String toString() { return "Wind"; }
	public void adjust() { System.out.println(this + ".adjust()"); }
}

class Percussion extends AbstractInstrument {
	public void play(Note n) {
		System.out.println(this + ".play() " + n);
	}
	public String toString(){ return "Percussion"; } 
	public void adjust() { System.out.println(this + ".adjust()"); }
}

class Stringed extends AbstractInstrument {
	public void play(Note n) {
		System.out.println(this + ".play() " + n);
	}
	public String toString() { return "Stringed"; }
	public void adjust() { System.out.println(this + ".adjust()"); }
}

class Brass extends Wind {
	public String toString() { return "Brass"; }
}

class Woodwind extends Wind {
	public String toString() { return "Woodwind"; }
}

class Musics {
	static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}
	static void tuneAll(Instrument[] e) {
		for(Instrument i : e)
			tune(i);
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

public class InterfacesEx9 {
	public static void main(String[] args) {
		Musics.main(args);
	}
}