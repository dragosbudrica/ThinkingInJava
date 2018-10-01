package holding.exercise8;
import java.util.*;

class Gerbil {
	private int gerbilNumber;
	Gerbil(int gerbilNumber) {
		this.gerbilNumber = gerbilNumber;
	}
	public void hop() {
		System.out.println("Gerbil " + gerbilNumber + " is hopping!");
	}
}

public class HoldingEx8 {
	public static void main(String[] args) {
		ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();
		for(int i = 0; i < 5; i++) 
			gerbils.add(new Gerbil(i+1));
		Iterator<Gerbil> it = gerbils.iterator();
		while(it.hasNext()) {
			Gerbil g = it.next();
			g.hop();
		}
	}
}
