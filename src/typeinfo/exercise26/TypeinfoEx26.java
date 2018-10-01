package typeinfo.exercise26;

import java.util.Arrays;
import java.util.List;

abstract class Instrument {
	void play() { System.out.println(this + ".play()"); }
	static void tune(Instrument i) {
		i.play();
	}
	abstract public String toString();
}

class Percussion extends Instrument {
	@Override
	public String toString() {
		return "Percussion";
	}
}

class Stringed extends Instrument {

	@Override
	public String toString() {
		return "Stringed";
	}
}

class Electronic extends Instrument {

	@Override
	public String toString() {
		return "Electronic";
	}
}

class Wind extends Instrument {
	public void clearSpitValve() {
		System.out.println("Clearing the spit valves for wind instruments");
	}

	@Override
	public String toString() {
		return "Wind";
	}
}

public class TypeinfoEx26 {
	public static void main(String[] args) {
		 List<Instrument> orchestra = Arrays.asList(
				 new Percussion(), new Stringed(), new Electronic(), new Wind()
				 );     
		 for(Instrument instrument : orchestra) {
			 instrument.play();
			 if(instrument instanceof Wind) {
				 ((Wind)instrument).clearSpitValve();
			 }
		 } 
	}
}
