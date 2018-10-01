package holding.exercises;
import java.util.ArrayList;

class Gerbil {
	private int gerbilNumber;
	Gerbil(int gerbilNumber) {
		this.gerbilNumber = gerbilNumber;
	}
	public void hop() {
		System.out.println("Gerbil " + gerbilNumber + " is hopping!");
	}
}

public class HoldingEx1 {
	public static void main(String[] args) {
		ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();
		for(int i = 0; i < 5; i++) 
			gerbils.add(new Gerbil(i+1));
		for(int i = 0; i < gerbils.size(); i++)
			gerbils.get(i).hop();
	}
}
